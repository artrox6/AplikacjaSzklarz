import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class DrawingPanel extends JPanel
{
	
	
	public DrawingMouseComp getMouse()
	{
	return component;	
	}
	
	private DrawingMouseComp component = new DrawingMouseComp();
	DrawingPanel()
	{
		JPanel drawpane = new JPanel();
	
		drawpane.setBackground(new Color(255, 255, 255));
		drawpane.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
		drawpane.setPreferredSize(new Dimension(300,300));
		drawpane.setLayout(new BorderLayout());
		drawpane.setVisible(true);
		drawpane.setMinimumSize(new Dimension(20,20));		
		drawpane.add(component);
		add(drawpane);
		
	}

}


