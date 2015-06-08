import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class DrawTest {
	
public void start(){
	
	JFrame frame = new JFrame();
	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension screenSize = kit.getScreenSize();
	int screenWidth = screenSize.width;
	int screenHeight = screenSize.height;
	frame.setSize(screenWidth / 2, screenHeight / 2);
	frame.setLocationByPlatform(true);
	frame.setTitle("Valuation Frame");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	frame.setLayout(new BorderLayout());
	DrawingPanel pane = new DrawingPanel();
	frame.add(pane,BorderLayout.CENTER);
	
	ShapeToolBar toolBar = new ShapeToolBar();
	pane.getMouse().setToolbar(toolBar);
	frame.add(toolBar,BorderLayout.NORTH);
	pane.getPreferredSize();
	frame.setVisible(true);
	frame.invalidate();
	frame.repaint();
}
	
	
	public static void main(String[] args)
	{
	
	DrawTest test = new DrawTest();
	test.start();
	
	}
}
