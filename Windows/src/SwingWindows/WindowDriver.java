package SwingWindows;

import javax.swing.JFrame;

public class WindowDriver {
	
	public static void main(String[] args) {		
			window alignFrame = new window();
			alignFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			alignFrame.setSize(350,150);
			alignFrame.setLocation(600,400);
			alignFrame.setVisible(true);
		}
}
