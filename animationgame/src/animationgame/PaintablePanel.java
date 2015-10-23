package animationgame;

public class PaintablePanel extends SizedPanel{
	
	Paintable pa;
	public PaintablePanel(Paintable pa){this.pa=pa;}

	public void PaintComponent(java.awt.Graphics g){
		pa.paintTo(g);
	}       
	public static void main(String[] args) {
		ShowInFrame.show(new PaintablePanel(new PaintableOval(120,53,79,25)));
		ShowInFrame.show(new PaintablePanel(new SimplePaintableRectangle(120,53,79,25)));
	}
}