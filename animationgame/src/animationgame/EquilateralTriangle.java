package animationgame;

public class EquilateralTriangle extends GeometricObject{
	public EquilateralTriangle (double w,double h, Vertex pos){
		super(w,h,pos);
		}
		public EquilateralTriangle(double w,double h, double x, double y){
			super(w,h,new Vertex(x,y));
		}
		@Override	public double area(){return width*hight/2;}
		@Override	public String toString(){
			return "EquilateralTriangle("+super.toString()+")";
		}
		public boolean equals(Object that){
			return (that instanceof EquilateralTriangle && super.equals(that));
		}
}
