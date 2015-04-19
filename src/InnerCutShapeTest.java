import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;


public class InnerCutShapeTest extends JFrame {
	
	
	public static void main(String[] args)
	{
		
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		frame.add(new InnerCutShape(100,100,100,100),BorderLayout.CENTER);
		frame.setVisible(true);
		frame.invalidate();
		frame.repaint();
	}
}
