import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class DrawingPanel extends JPanel
{

	DrawingPanel()
	{
		JPanel drawpane = new JPanel();
	
		drawpane.setBackground(new Color(255, 255, 255));
		drawpane.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
		drawpane.setPreferredSize(new Dimension(100,100));
		drawpane.setLayout(new BorderLayout());
		drawpane.setVisible(true);
		drawpane.setMinimumSize(new Dimension(100,20));
		drawpane.add(new DrawingMouseComp());
		add(drawpane);
	}

}


