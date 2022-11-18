package A;

public class A {
	private static final double PI = 3.14;
	private int radius = 1;
	//	{
	//		radius = 1;
	//	}
	public A() {

	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void incrementRadius() {
		radius++;
	}
	public void getAreaOfCircle() {
		System.out.println(radius*PI*2); 
	}
	public void getSizeOfCirecle() {
		System.out.println(radius*radius*PI);
	}



}
