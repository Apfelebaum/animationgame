package animationgame;

public class Rectangular extends GeometricObject{
	public Rectangular (double w,double h, Vertex pos){
		super(w,h,pos);
		}
		public Rectangular (double w,double h, double x, double y){
			super(w,h,new Vertex(x,y));
		}
		@Override	public double area(){return width*hight;}
		@Override	public String toString(){
			return "Rectangular("+super.toString()+")";
		}
		public boolean equals(Object that){
			return (that instanceof Rectangular && super.equals(that));
		}
}
