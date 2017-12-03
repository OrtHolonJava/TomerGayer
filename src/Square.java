import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Square  extends JPanel {
	private int _row;
	private int _col;
	private Img _ImgBackground;
	private enum _solider{black,white,empty};
	private Img _imgSoldier ;
	public Square(int row, int col, Img imgBackground, Img imgSoldier) {
		super();
		_row = row;
		_col = col;
		_ImgBackground = imgBackground;
		_imgSoldier = imgSoldier;
	}
	public int getRow() {
		return _row;
	}
	public void setRow(int row) {
		_row = row;
	}
	public int getCol() {
		return _col;
	}
	public void setCol(int col) {
		_col = col;
	}
	public Img getImgBackground() {
		return _ImgBackground;
	}
	public void setImgBackground(Img imgBackground) {
		_ImgBackground = imgBackground;
	}
	public Img getImgSoldier() {
		return _imgSoldier;
	}
	public void setImgSoldier(Img imgSoldier) {
		_imgSoldier = imgSoldier;
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		_ImgBackground.drawImg(g);
		_imgSoldier.drawImg(g);
	}
}
