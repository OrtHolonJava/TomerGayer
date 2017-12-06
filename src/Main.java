import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Main
{
   public static void main(String[] args)
   {
	   BoardPanel mp = new BoardPanel();
      JFrame frame = new JFrame("My Frame");
      try{
    	  frame.add(mp);
      }
      catch (NullPointerException ex)
      {
    	  System.out.println("the image is not found");
      }
      //********
      //********
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(200, 200);
      frame.setVisible(true);
      
   }
}
