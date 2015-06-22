import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



public class ShapeToolBar extends JPanel {
	
	private int angle =0;
	private DoubleCircle dCircle = new DoubleCircle();
	private InnerCutShape iCut = new InnerCutShape();
	private CutInterface curentCut=dCircle;
	private SingleCircle sCircle = new SingleCircle();
	private RoundRectCut rRect = new RoundRectCut();
	public CutInterface getCutType()
	{
		return curentCut;
	}
	
	public double getAngle()
	{
		return angle;
	}
	public void setCutType(CutInterface cCut)
	{
	this.curentCut = cCut;	
	}
	ShapeToolBar()
	{
	JToolBar shapeBar = new JToolBar();
	Action doubleCircleAction = new ShapeAction("Double Circle",new ImageIcon("DoubleCircle.gif"), dCircle );
	Action innerCutAction = new ShapeAction("Inner Cut",new ImageIcon("InnerCut.gif"), iCut );
	Action singleCircAction = new ShapeAction("Single Circle", new ImageIcon("SingleCircle.gif"),sCircle );
	Action roundRectAction = new ShapeAction("Round Rectangle", new ImageIcon("RoundRect.gif"), rRect);
	Action rotateAction = new RotateAction("Rotate", new ImageIcon("Rotate.gif"));
	shapeBar.add(doubleCircleAction);
	shapeBar.add(innerCutAction);
	shapeBar.add(singleCircAction);
	shapeBar.add(roundRectAction);
	shapeBar.add(rotateAction);
	add(shapeBar, BorderLayout.EAST);
	}
	
	
	
	
	class ShapeAction extends AbstractAction
	{
		public ShapeAction(String name, Icon icon ,CutInterface cut)
		{
			putValue(Action.NAME, name);
			putValue(Action.SMALL_ICON, icon);
			putValue(Action.SHORT_DESCRIPTION, name +" shape of cut");
			putValue("CutInterface", cut);
			//System.out.println(name);
		}
		public void actionPerformed(ActionEvent event)
	    {
	         CutInterface c = (CutInterface)getValue("CutInterface");
	         setCutType(c);
	         System.out.println("Wysylam " + curentCut);
	    }
	}
	class RotateAction extends AbstractAction
	{
		public RotateAction(String name, Icon icon)
		{
			putValue(Action.NAME, name);
			putValue(Action.SMALL_ICON, icon);
			putValue(Action.SHORT_DESCRIPTION, name +"Rotate shape by 90 degrees");
		}
		public void actionPerformed(ActionEvent event)
		{
			if (angle <360)
			{
				angle=angle+90;
				System.out.println(angle);
			}
			else
			{
				angle=0;
				System.out.println(angle);
			}
		}
	}
	
}
