import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class Main
{
   public static void main(String[] args)
   {
	   Image _image;
	   _image = new ImageIcon(("images\\rollsback.png")).getImage(); 
	   BoardPanel mp = new BoardPanel();
      JFrame frame = new JFrame("My Frame");
      try{
    	     frame.setIconImage(_image);
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
