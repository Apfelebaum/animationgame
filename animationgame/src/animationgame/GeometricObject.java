package animationgame;
import java.awt.Color;
public class GeometricObject {

		public Vertex pos;
		public double hight;
		public double width;
		public Color color;
	
		public GeometricObject(double width, double hight,Vertex pos, Color color){
			this.pos=pos;
			this.hight=hight;
			this.width=width;
			this.color=color;
			
			if(this.width<0){
				this.width=-this.width;
				pos.x=pos.x-this.width;}
			
			if(this.hight<0){
				this.hight=-this.hight;
				pos.y=pos.y-this.hight;}
			}
		public GeometricObject(double width, double hight, Color color){
			this(width, hight, new Vertex(0,0),color);
		}
		public GeometricObject (double width){
			this(width, width, new Vertex(0,0),new Color(0,0,0));
			}
		public GeometricObject(Vertex pos){
			this(0,0, pos,new Color(0,0,0));}
		public GeometricObject(){
			this(0,0,new Vertex(0,0),new Color(0,0,0));
		}
		
		public double getWidth(){return width;}
		public double getHight(){return hight;}
		public Vertex getPos(){return pos;}
		
		public String toString(){
			return "width="+width+",hight="+hight +",pos="+pos+",color="+color;
		}
		public double circumferences (){return 2*(width+hight);}
		public double area (){return width*hight;}
		public boolean contains(Vertex v){
			return v.x >= pos.x && v.x<=pos.x+width
			&&v.y>=pos.y && v.y<=pos.y+hight;
		}
		public boolean isLargerthan(GeometricObject that){
			return this.area()>that.area();
		}
		public void moveTo(Vertex pos){this.pos=pos;
		}
		public void moveTo(double x, double y){
			moveTo(new Vertex(x,y));
		}
		public void move(Vertex v){
			moveTo(pos.add(v));}
		public boolean equals(Object thatObject){
			if(thatObject instanceof GeometricObject){
				GeometricObject that=(GeometricObject)thatObject;
				return that.width==this.width && that.hight==this.hight && this.pos.equals(that.pos);
			}
			return false;
		}
		
}


	