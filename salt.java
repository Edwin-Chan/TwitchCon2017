import javax.swing.*;
import java.awt.*;
import javax.imageio.*;

public class salt extends KeyListener
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

  public void keyTyped(KeyEvent e) {}

  public void keyPressed(KeyEvent e)
  {
    if(e.getKeyChar() == 's')
    {
      sad++;
    }

    if(e.getKeyChar() == 'a')
    {
      anger++;
    }

    if(e.getKeyChar() == 'c')
    {
      contempt++;
    }

    if(e.getKeyChar() == 'h')
    {
      happy++;
    }

    if(e.getKeyChar() == 'f')
    {
      fear++;
    }

    if(e.getKeyChar() == 'd')
    {
      disgust++;
    }

    if(e.getKeyChar() == 'n')
    {
      neutral++;
    }

    if(e.getKeyChar() == 'p')
    {
      suprise++;
    }
  }

  public void keyReleased(KeyEvent e) {}

  public void imagePull (String name, int val)
  {
    if(name == "salt")
    {
      if(val > 50)
      {
        BufferedImage img = null;
        try {
          img = ImageIO.read(new File("IMG_3642.jpg"));
        } catch (IOException e) { }
      }
      else if(val > 75)
      {

      }
      else if(val > 90)
      {

      }
      else if(val == 100)
      {

      }
    }
  }

}
