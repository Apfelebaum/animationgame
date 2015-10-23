package animationgame;

public class PaintableOval extends SimpleOval implements Paintable{
	public PaintableOval(double width, double hight, double x, double y){
		super (width, hight, x, y);
	}

	public void paintTo(java.awt.Graphics g){
		g.fillOval((int)pos.x, (int)pos.y,(int) width,(int) hight);
	}
}
