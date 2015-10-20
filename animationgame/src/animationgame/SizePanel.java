package animationgame;
import javax.swing.*;

import java.awt.Dimension;
public class SizePanel extends JPanel{
		int preferredwidth=400;
		int preferredhight=300;
		
	public SizePanel(int w, int h){
		preferredwidth=w;
		preferredhight=h;
	}

	public SizePanel(){};
	@Override public Dimension getPreferredSize(){
		return new Dimension (preferredwidth,preferredhight);
	}
	
	public static void main(String[] args) {
ShowInFrame.show(new SizedPanel());
		
	}

}
