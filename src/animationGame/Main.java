package animationGame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleOval s1 = new SimpleOval(45,99,7,7);
		Triangle t1	= new Triangle(6, 4,9, 8);
		Circle c1 = new Circle(88,9,8);
		
		System.out.println(s1);
		System.out.println(t1);
		System.out.println(c1);
		System.out.println(t1.equals(s1));
		System.out.println(c1.area());
		System.out.println(t1.circumference());
	}

}
