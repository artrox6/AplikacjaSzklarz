import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JPanel;


public class InnerCutShape  implements CutInterface{
	
	private double height;
	private double width;
	private double angle;
	private Ellipse2D s = new Ellipse2D.Double();
	private Ellipse2D s2 = new Ellipse2D.Double();
	private Rectangle2D rect = new Rectangle2D.Double();
	private Area a = new Area(rect);
	private Area as = new Area(s);
	private Area as2 = new Area(s2);
	public Area getCut()
		{	
		return a;
		}	
	public void setAngle(double angle)
		{
			this.angle=angle;
		}
	public double getCenterX()
		{
		return width/2;
		}
	public double getCenterY()
		{
		return height/2;
		}
	InnerCutShape()
	{
		InnerCutShape in = new InnerCutShape(10,10,10,10);
	}
	InnerCutShape(double x, double y, double width, double height)
		{		
		this.width=width;
		this.height=height;
		s.getBounds();
		s.setFrame(x+(width/2),y-(height/2),width,height);
		s2.setFrame(x+(width/2),y+(height/2),width,height);
		rect.setFrame(x, y, width, height);
	   	this.a.add(as2);
	    this.a.add(as);	    	   
		}	
	
	public void setFromDiagonal(Point2D p1,Point2D p2)
		{	
	//	a = new Area();
		DiagonalFrame frame = new DiagonalFrame(p1 , p2);
		Rectangle2D r = new Rectangle2D.Double(frame.getX1(),frame.getY1(),frame.getX2()-frame.getX1(),frame.getY2()-frame.getY1());
		width = frame.getX2() - frame.getX1();
		height= frame.getY2() - frame.getY1();
		Ellipse2D s = new Ellipse2D.Double(frame.getX1()+(width/2),frame.getY2()-(height/2),width,height);
		Ellipse2D s2 = new Ellipse2D.Double(frame.getX1()+(width/2),frame.getY2()-(height*1.5),width,height);
		this.a =new Area(r);
		Area b = new Area(s);
		Area c = new Area(s2);
		this.a.add(b);
		this.a.add(c);
			
		}
	
	public Dimension getPreferredSize() { return new Dimension(200,200);}
	}
