package animationGame;

public class PaintableOval extends SimpleOval implements Paintable {
	
	public PaintableOval(double width, double height,double x, double y){
		super(x,y,width, height);
	}
	
	public void paintTo(java.awt.Graphics g){
		g.fillOval((int)pos.x, (int)pos.y, (int)width, (int)height);
	}

}
