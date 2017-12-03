import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class BoardPanel extends JPanel {
	private Square _mat[];
private Img _img1;
	public BoardPanel (){
		int i;
		  _mat = new Square[61];		
		 _img1 = new Img("images\\rollsback.png", 0, 0, 2000, 1000);
		  for( i = 0;i<5;i++)
			{
				_mat[i] = new Square(i, 0, new Img("images\\blackBall.png", 0, 0, 100, 100), new Img("Images\\blackBall.png", 20, 20, 50, 50));
				setLayout(null);
				
				 _mat[i].setBounds(655 + i*150, 160 + i, 70, 70);
				  add(_mat[i]);
				  
				}
		  for( i = 0;i<6;i++)
			{
				_mat[i] = new Square(i, 0, new Img("images\\blackBall.png", 0, 0, 100, 100), new Img("Images\\blackBall.png", 20, 20, 50, 50));
				setLayout(null);
				
				 _mat[i].setBounds(580 + i*150, 238 + i, 70, 70);
				  add(_mat[i]);
				  
				}
			
			}	  
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		_img1.drawImg(g);
	}
	
	
}
