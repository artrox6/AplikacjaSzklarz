import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



public class ShapeToolBar extends JPanel {
	private CutInterface curentCut;
	private DoubleCircle dcircle = new DoubleCircle();
	private InnerCutShape iCut = new InnerCutShape();
	ShapeToolBar()
 	{
	
	Action doubleCircleAction = new ShapeAction("Double Circle",new ImageIcon("DoubleCircle.gif"), dcircle );
	Action innerCutAction = new ShapeAction("Inner Cut",new ImageIcon("InnerCut.gif"), iCut );
	curentCut = iCut;
	JToolBar shapeBar = new JToolBar();
	shapeBar.add(doubleCircleAction);
	shapeBar.add(innerCutAction);
	add(shapeBar, BorderLayout.NORTH);
	}
	
	
	
	
	class ShapeAction extends AbstractAction
	{
		public ShapeAction(String name, Icon icon ,CutInterface cut)
		{
			putValue(Action.NAME, name);
			putValue(Action.SMALL_ICON, icon);
			putValue(Action.SHORT_DESCRIPTION, name +" shape of cut");
			putValue("CutInterface", cut);
		}
		public void actionPerformed(ActionEvent event)
	    {
	         CutInterface c = (CutInterface) getValue("CutInterface");
	         curentCut=c;
	    }
	}
	public CutInterface getCutType()
	{
		return curentCut;
	}
}
