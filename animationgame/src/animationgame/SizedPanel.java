package animationgame;
import javax.swing.*;

import java.awt.Dimension;
public class SizedPanel extends JPanel{
		int preferredwidth=400;
		int preferredhight=300;
		
	public SizedPanel(int w, int h){
		preferredwidth=w;
		preferredhight=h;
	}

	public SizedPanel(){};
	@Override public Dimension getPreferredSize(){
		return new Dimension (preferredwidth,preferredhight);
	}
	
	public static void main(String[] args) {
ShowInFrame.show(new SizedPanel());
		
	}
}