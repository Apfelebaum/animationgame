package animationgame;
import java.awt.Color;
public class SimpleOval extends GeometricObject{

	public SimpleOval (double w, double h, Vertex pos, Color color){
		super(w,h,pos, color);
		}
		public SimpleOval(double w, double h, double x, double y,Color color){
			super(w,h,new Vertex(x,y),color);
		}
		public SimpleOval (double w, double h, Vertex pos){
			super(w,h,pos, Color.black);
			}
		public SimpleOval(double w, double h, double x, double y){
			super(w,h,new Vertex(x,y),Color.black);
		}
		@Override	public double area(){return Math.PI*width*hight/4;}
		@Override	public String toString(){
			return "SimpleOval("+super.toString()+")";
		}
		@Override public boolean equals(Object that){
			return (that instanceof SimpleOval && super.equals(that));
		}
		}