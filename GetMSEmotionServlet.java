package twitch2017;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.github.sarxos.webcam.Webcam;




/**
 * Servlet implementation class GetMSEmotionServlet
 */
@WebServlet("/GetMSEmotionServlet")
public class GetMSEmotionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetMSEmotionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jsonResponse = getEmotion();
		response.setContentType("application/json");
		PrintWriter pw = response.getWriter();
		response.setContentType("text/plain");
		pw.write(jsonResponse);
		pw.flush();
		pw.close();
	}
	
	private BufferedImage captureImage() {
		List<Webcam> webcams = Webcam.getWebcams();
		for(Webcam webcam: webcams) {
			System.out.println(webcam.getName());
		}
		Webcam webcam = webcams.get(0);
		webcam.open();
		BufferedImage img = webcam.getImage();
	
		return img;
	}
	
	private String uploadImage(BufferedImage img) {
	    try{
	    	ImageIO.write(img, "jpg", new File("C:\\Users\\taisi\\Documents\\USC\\twitchHacks2017\\TwitchCon2017_2\\WebContent\\static\\capture.jpg"));
	    }catch(IOException ioe) {
	    	System.out.println("IOE: "+ioe.getMessage());
	    }
	    
	    //AmazonS3 s3Client = AmazonS3ClientBuilder.defaultClient();
	    return new String("http://4bfc7739.ngrok.io");
	}
	
	private String getEmotion() {
		HttpClient httpClient = HttpClients.createDefault();
		URI uri = null;
		StringEntity reqEntity = null;
		HttpResponse response = null;
		Scanner sc = null;
		String imgUrl;
		
		BufferedImage img = captureImage();
		
		if(img==null) {
			return new String();
		}
		
		imgUrl = uploadImage(img);
		if(imgUrl==null)
			return new String();
	
		try {
            URIBuilder uriBuilder = new URIBuilder("https://westus.api.cognitive.microsoft.com/emotion/v1.0/recognize");
            uri = uriBuilder.build();
		}catch(URISyntaxException use) {
			System.out.println("use: "+use.getMessage());
			return new String();
		}
	
        HttpPost request = new HttpPost(uri);
        // Request headers. Replace the example key below with your valid subscription key.
        request.setHeader("Content-Type", "application/json");
        request.setHeader("Ocp-Apim-Subscription-Key", "6ba7fadf9d9748a794eda8e1f1201895");

        // Request body. Replace the example URL below with the URL of the image you want to analyze.
        try {
        	reqEntity = new StringEntity("{ \"url\": \"www.jokesmannia.com/wp-content/uploads/2016/07/angry-man.jpg/\" }");
        }catch(UnsupportedEncodingException uee) {
        	System.out.println("uee: "+uee.getMessage());
        	return new String();
        }
        request.setEntity(reqEntity);
        try {
        	response = httpClient.execute(request);
        }catch(IOException ioe) {
        	System.out.println("ioe: "+ioe.getMessage());
        	return new String();
        }
        HttpEntity entity = response.getEntity();
        String jsonResponse = new String();
        try {
        	sc = new Scanner(entity.getContent());
        }catch(IOException ioe) {
        	System.out.println("ioe: "+ioe.getMessage());
        	return jsonResponse;
        }            
        while(sc.hasNextLine()) {
        	jsonResponse += sc.nextLine();
        }
        System.out.println(jsonResponse);
        return jsonResponse;
	}

}
