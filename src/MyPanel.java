import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	private Img _img;

	public MyPanel(Img img) {
		super();
		_img = new Img("Images\\img1.jpg", 0, 0, 600, 200);
	}
	   public void paintComponent(Graphics g)
	   {
	      super.paintComponent(g);

            _img.drawImg(g);
	   }

	

}
