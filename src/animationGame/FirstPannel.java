package animationGame;
import java.awt.Color;

import javax.swing.*;
public class FirstPannel extends JPanel {
	
	/*public void paintComponent(java.awt.Graphics g){
		g.fillRect(30, 50, 45, 80);
		g.fillOval(60, 180, 66, 66);
		g.fillRoundRect(0, 0, 25, 25, 10, 20);
		
	}*/
	
	public void paintPolygon(java.awt.Graphics g){
		int xPonts[] ={66,77,33,44,99,22};
		int yPonts[] = {111,122,133,144,155,166};
		int npoints =  xPonts.length;
		Color c = Color.red;
		
		g.setColor(c);
		g.drawPolygon(xPonts, yPonts, npoints);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.add(new FirstPannel());
		f.setVisible(true);
	}

}
