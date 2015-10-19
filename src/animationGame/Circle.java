package animationGame;

public class Circle extends GeometricObject {

	public Circle(double w,Vertex pos){super(w,w,pos);}
	
	public Circle(double w, double x, double y){super(w, w ,new Vertex(x,y));}
	
	public double area(){return (width/2)*(width/2)*Math.PI;}
	
	public String toString(){return "Circle("+super.toString()+")";}
	
	public boolean equals(Object that){return (that instanceof Circle && super.equals(that));}
	
	public double circumference(){ return width*Math.PI;}
	
}
