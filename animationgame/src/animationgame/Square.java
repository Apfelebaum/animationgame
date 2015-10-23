package animationgame;
import java.awt.Color;
public class Square extends GeometricObject{
	public Square (double h, Vertex pos,Color color){
		super(h,h,pos,color);
		}
	public Square (double h, Vertex pos){
		super(h,h,pos,Color.black);
		}
		public Square (double h, double x, double y){
			super(h,h,new Vertex(x,y),Color.black);
		}
		@Override	public double area(){return hight*hight;}
		@Override	public String toString(){
			return "Square("+super.toString()+")";
		}
		public boolean equals(Object that){
			return (that instanceof Square && super.equals(that));
		}
}
