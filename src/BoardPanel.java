import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class BoardPanel extends JPanel {
	private Square _mat[];
private Img _img1;
	public BoardPanel (){
		  _mat = new Square[61];		
		 _img1 = new Img("images\\rollsback.png", 0, 0, 2000, 1000);
		  for(int i = 0;i<61;i++)
			{
				_mat[i] = new Square(i, 0, new Img("images\\blackBall.png", 0, 0, 100, 100), new Img("Images\\blackBall.png", 20, 20, 50, 50));
				setLayout(null);
				 _mat[i].setBounds(630 + i*150, 150 + i, 100, 100);
				  add(_mat[i]);
				  
				}
			
			}	  
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		_img1.drawImg(g);
	}
	
	
}
