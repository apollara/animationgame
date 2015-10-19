package animationGame;

public class Triangle extends GeometricObject {
	
	public Triangle (double w,double h, Vertex pos){
		super(w,h,pos);
	}
	public Triangle (double w,double h, double x, double y){
		super(w,h, new Vertex (x,y));
	}
	
	public double area(){return width*height/2;}
	
	public String toString(){return "Triangle(" + super.toString()+ ")";}
	
	public boolean equals(Object that){
		return (that instanceof Triangle&& super.equals(that));
	}
	public double circumference(){
		return width + 2*(Math.sqrt((width/2)*(width/2)+height*height));
	}
}
