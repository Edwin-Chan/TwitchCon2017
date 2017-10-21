package justarandom;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import classDeclaration.TopLevel ;



/**
 * Servlet implementation class LecturesServlet
 */
@WebServlet("/ServletToBeMade")
public class ServletToBeMade extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String search = request.getParameter("String");
		Gson gson = new Gson();  
		TopLevel[] array = null;
		array = gson.fromJson(search, TopLevel[].class);  
		Double anger  = null;
		Double contempt  = null;
		Double disgust = null;
		Double fear = null;
		Double neutral = null;
		Double happiness = null;
		Double sadness = null;
		Double surprise = null;
		anger = Double.parseDouble(array[0].getScores().getAnger());
		contempt = Double.parseDouble(array[0].getScores().getContempt());
		disgust = Double.parseDouble(array[0].getScores().getDisgust());
		fear = Double.parseDouble(array[0].getScores().getFear());
		neutral = Double.parseDouble(array[0].getScores().getNeutral());
		happiness = Double.parseDouble(array[0].getScores().getHappiness());
		sadness = Double.parseDouble(array[0].getScores().getSadness());
		surprise = Double.parseDouble(array[0].getScores().getSurprise());
		ArrayList<Double> compare = new ArrayList<Double>();
		compare.add(anger);
		compare.add(contempt);
		compare.add(disgust);
		compare.add(fear);
		compare.add(neutral);
		compare.add(happiness);
		compare.add(sadness);
		compare.add(surprise);
		int largestIndex = 0;
		Double largest = 0.0;
		String largestString = "";
		for (int i = 0; i < compare.size(); i++) {
			if (largest.compareTo(compare.get(i)) < 0) {
				largest = compare.get(i);
				largestIndex = i;
			}
		}
		if (largestIndex == 0) {
			largestString = "anger";
		}else if (largestIndex == 1) {
			largestString = "contempt";
		} else if (largestIndex == 2) {
			largestString = "disgust";
		}else if (largestIndex == 3) {
			largestString = "fear";
		}else if (largestIndex == 4) {
			largestString = "neutral";
		}else if (largestIndex == 5) {
			largestString = "happiness";
		}else if (largestIndex == 6) {
			largestString = "sadness";
		}else if (largestIndex == 7) {
			largestString = "surprise";
		}

		response.setContentType("text/plain");
		PrintWriter pw = response.getWriter();
		pw.write(largestString);
		pw.flush();
		pw.close();
		
	}

}

