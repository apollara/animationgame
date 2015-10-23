package animationGame;

public class SimpleSizdelPanel extends SizedPanel {
	public void paintComponent(java.awt.Graphics g){
		g.fillRect(20, 20, 90, 130);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowInFrame.show(new SimpleSizdelPanel());
	}

}
