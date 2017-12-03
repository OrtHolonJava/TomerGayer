import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
/**
 * 
 * @author PC 10 - image class to draw imaes
 *
 */
public class Img
{
	private Image _image;
	private int x, y, width, height;
	/**
	 * Initializing new image
	 * @param path - the image source
	 * @param x - the place of image on axis x
	 * @param y - the place of image on axis y
	 * @param width - the width of image
	 * @param height - the height of image
	 */
	public Img(String path, int x, int y, int width, int height)
	{
		_image = new ImageIcon(this.getClass().getClassLoader().getResource(path)).getImage(); 
		
		setImgCords(x, y);
		setImgSize(width, height);
	}
	/**
	 * 
	 * @param g - draw the image
	 */
	public void drawImg(Graphics g) 
	{
		Graphics2D g2d = (Graphics2D) g;
        		g2d.drawImage(_image, x, y, width, height, null);
	}
	
	public void setImgCords(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void setImgSize(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	public void setImg(Image image)
	{
		_image = image;
	}
}


