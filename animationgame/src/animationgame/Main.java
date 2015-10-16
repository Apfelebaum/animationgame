package animationgame;

public class Main {

	public static void main(String[] args) {

		SimpleOval s1= new SimpleOval(4,7,3,5);
		SimpleOval s2= new SimpleOval(7,3,56,73);
		Rectangular s3=new Rectangular(4,7,3,5);
		System.out.println(s1.equals(s3));
		
	}

}
