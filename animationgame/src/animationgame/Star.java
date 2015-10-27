package animationgame;

import java.awt.Color;

public class Star  extends GeometricObject{


	public Star (double w,double h, Vertex pos,Color color){
		super(w,h,pos,color);
		}
	public Star (double w,double h, Vertex pos){
			super(w,h,pos,Color.black);
			}
		public Star (double w,double h, double x, double y, Color color){
			super(w,h,new Vertex(x,y),color);
		}
		public Star (double w,double h, double x, double y){
			super(w,h,new Vertex(x,y),Color.black);
		}
		@Override	public double area(){return;}
		@Override	public String toString(){
			return "Star("+super.toString()+")";
		}
		public boolean equals(Object that){
			return (that instanceof Rectangular && super.equals(that));
		}
}
