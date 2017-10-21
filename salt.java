import javax.swing.*;
import java.awt.*;
import javax.imageio.*;

public class salt
{

  int sad = 0;
  int anger = 0;
  int contempt = 0;
  int happy = 0;
  int fear = 0;
  int disgust = 0;
  int neutral = 0;
  int suprise = 0;

  public static void main(String[] args)
  {
    salt.run();
  }

  public void run()
  {
    imagePull("sad", sad);
    imagePull("anger", anger);
    imagePull("contempt", contempt);
    imagePull("happy", happy);
    imagePull("fear", fear);
    imagePull("disgust", disgust);
    imagePull("neutral", neutral);
    imagePull("suprise", suprise);
  }

  public void imagePull (String name, int val)
  {
    if(name == "anger")
    {
      if(val > 50)
      {
        //meter that moves up
      }
      else if(val == 100)
      {
        BufferedImage img = null;
        try {
          img = ImageIO.read(new File("anger.jpg"));
        } catch (IOException e) { }
        //put over face
      }

      if(name == "sad" && val == 100)
      {
        BufferedImage img = null;
        try {
          img = ImageIO.read(new File("sad.jpg"));
        } catch (IOException e) { }
      }

      if(name == "contempt" && val == 100)
      {
        BufferedImage img = null;
        try {
          img = ImageIO.read(new File("contempt.jpg"));
        } catch (IOException e) { }
      }

      if(name == "happy" && val == 100)
      {
        BufferedImage img = null;
        try {
          img = ImageIO.read(new File("happy.jpg"));
        } catch (IOException e) { }
      }

      if(name == "fear" && val == 100)
      {
        BufferedImage img = null;
        try {
          img = ImageIO.read(new File("fear.jpg"));
        } catch (IOException e) { }
      }

      if(name == "disgust" && val == 100)
      {
        BufferedImage img = null;
        try {
          img = ImageIO.read(new File("disgust.jpg"));
        } catch (IOException e) { }
      }

      if(name == "neutral" && val == 100)
      {
        BufferedImage img = null;
        try {
          img = ImageIO.read(new File("neutral.jpg"));
        } catch (IOException e) { }
      }

      if(name == "suprise" && val == 100)
      {
        BufferedImage img = null;
        try {
          img = ImageIO.read(new File("suprise.jpg"));
        } catch (IOException e) { }
      }
    }
  }

}
