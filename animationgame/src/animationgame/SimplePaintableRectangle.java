package animationgame;

public class SimplePaintableRectangle extends Rectangular implements Paintable{
	public SimplePaintableRectangle(double width, double hight, double x, double y){
		super (width, hight, x, y);
	}
	public void paintTo(java.awt.Graphics g){
		g.fillRect((int)pos.x, (int)pos.y,(int) width,(int) hight);
	}
}
