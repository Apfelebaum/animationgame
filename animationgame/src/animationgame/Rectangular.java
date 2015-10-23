package animationgame;
import java.awt.Color;

public class Rectangular extends GeometricObject{
	public Rectangular (double w,double h, Vertex pos,Color color){
		super(w,h,pos,color);
		}
	public Rectangular (double w,double h, Vertex pos){
			super(w,h,pos,Color.black);
			}
		public Rectangular (double w,double h, double x, double y, Color color){
			super(w,h,new Vertex(x,y),color);
		}
		public Rectangular (double w,double h, double x, double y){
			super(w,h,new Vertex(x,y),Color.black);
		}
		@Override	public double area(){return width*hight;}
		@Override	public String toString(){
			return "Rectangular("+super.toString()+")";
		}
		public boolean equals(Object that){
			return (that instanceof Rectangular && super.equals(that));
		}
}
