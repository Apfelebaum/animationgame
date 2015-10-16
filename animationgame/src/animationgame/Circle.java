package animationgame;

public class Circle extends GeometricObject {
	public Circle (double h, Vertex pos){
		super(h,h,pos);
		}
		public Circle(double h, double x, double y){
			super(h,h,new Vertex(x,y));
		}
		@Override	public double area(){return Math.PI*hight*hight/4;}
		@Override	public String toString(){
			return "Circle("+super.toString()+")";
		}
		public boolean equals(Object that){
			return (that instanceof Circle && super.equals(that));
		}
}		