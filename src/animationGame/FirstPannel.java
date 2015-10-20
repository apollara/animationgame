package animationGame;
import javax.swing.*;
public class FirstPannel extends JPanel {
	
	public void paintComponent(java.awt.Graphics g){
		g.fillRect(30, 50, 45, 80);
		g.fillOval(60, 180, 66, 66);
		g.fillRoundRect(0, 0, 25, 25, 10, 20);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.add(new FirstPannel());
		f.setVisible(true);
	}

}
