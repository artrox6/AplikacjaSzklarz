import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;


public class InnerCutShapeTest extends JFrame {
	
	
	public static void main(String[] args)
	{
		
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		InnerCutShape rect = new InnerCutShape(60,60,80,80);
		
		frame.setVisible(true);
	}
}
