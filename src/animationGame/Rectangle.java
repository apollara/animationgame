package animationGame;

public class Rectangle extends GeometricObject {

	public Rectangle(double x, double y, double w, double h){
		super(w,h,new Vertex(x,y));
	}
}
