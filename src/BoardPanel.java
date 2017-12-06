import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class BoardPanel extends JPanel {
	private Square _mat[];
private Img _img1;
	public BoardPanel (){
		int i;
		  _mat = new Square[28];		
		 _img1 = new Img("images\\rollsback.png", 0, 0, 2000, 1000);
		  for( i = 0;i<5;i++)
			{
				_mat[i] = new Square(i, 0, new Img("images\\whiteball1.png", 0, 0, 100, 90), new Img("Images\\blackBall.png", 20, 20, 50, 50));
				setLayout(null);
				_mat[i].setBackground(new Color(0,0,0,0));
				 _mat[i].setBounds(645 + i*150, 150 , 100, 90);
				  add(_mat[i]);
				  
				  _mat[i+14] = new Square(i, 0, new Img("images\\blackball1.png", 0, 0, 110, 100), new Img("Images\\blackball1.png", 20, 20, 50, 50));
					setLayout(null);
					 _mat[i+14].setBackground(new Color(0,0,0,0));
					 _mat[i+14].setBounds(612 + i*150, 778 , 110, 100);
					  add(_mat[i+14]);
				  
				}
		  for( i = 0;i<6;i++)
			{
				_mat[i+5] = new Square(i, 0, new Img("images\\whiteball1.png", 0, 0, 100, 90), new Img("Images\\blackBall.png", 20, 20, 50, 50));
				setLayout(null);
				 _mat[i+5].setBackground(new Color(0,0,0,0));
				 _mat[i+5].setBounds(565 + i*150, 233 , 100,90);
				  add(_mat[i+5]);
				  
				  _mat[i+19] = new Square(i, 0, new Img("images\\blackball1.png", 0, 0, 110, 100), new Img("Images\\blackball1.png", 0, 0, 50, 50));
					setLayout(null);
					 _mat[i+19].setBounds(538 + i*150, 698 , 110, 100);
					 _mat[i+19].setBackground(new Color(0,0,0,0));
					  add(_mat[i+19]);
				  
				}
		  for( i = 0;i<3;i++)
			{
				_mat[i+11] = new Square(i, 0, new Img("images\\whiteball1.png", 0, 0, 100, 90), new Img("Images\\blackBall.png", 20, 20, 50, 50));
				setLayout(null);
				 _mat[i+11].setBackground(new Color(0,0,0,0));
				 _mat[i+11].setBounds(490 + i*150+300, 312 , 100, 90);
				  add(_mat[i+11]);
				  
				  _mat[i+25] = new Square(i, 0, new Img("images\\blackball1.png",0 , 0, 110, 100), new Img("Images\\blackball1.png", 0, 0, 0, 0));
					setLayout(null);
					_mat[i+25].setBackground(new Color(0,0,0,0));
					 _mat[i+25].setBounds(463 + i*150+300, 620 , 110, 100);
					  add(_mat[i+25]);
				  
				}
			
			}	  
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		_img1.drawImg(g);
	}
	
	
}
