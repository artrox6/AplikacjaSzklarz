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


public class InnerCutShape implements CutInterface{
	

	private Area a;
	
	public Area getCut()
		{
		
		return a;
		}	
	InnerCutShape()
		{
		a = new Area( new Ellipse2D.Double( 50 ,50 , 50 , 50));		}
	InnerCutShape(double x, double y, double width, double height)
		{		
		Ellipse2D s = new Ellipse2D.Double(x+(width/2),y-(height/2),width,height);
		Ellipse2D s2 = new Ellipse2D.Double(x+(width/2),y+(height/2),width,height);
		this.a = new Area(new Rectangle2D.Double(x, y, width, height));
		Area b = new Area(s);
	   	Area c = new Area(s2);
	   	this.a.add(b);
	    this.a.add(c);	    	   
		}	
	
	public void setFromDiagonal(Point2D p1,Point2D p2)
		{	
		Rectangle2D r = new Rectangle2D.Double();
	    r.setFrameFromDiagonal(p1.getX(),p1.getY(),p2.getX(),p2.getY());
	    double width = p2.getX() - p1.getX();
	    double height= p2.getY() - p1.getY();
	    Ellipse2D s = new Ellipse2D.Double(p1.getX()+(width/2),p2.getY()-(height/2),width,height);
	    Ellipse2D s2 = new Ellipse2D.Double(p1.getX()+(width/2),p2.getY()-(height*1.5),width,height);
	    this.a =new Area(r);
	    Area b = new Area(s);
		Area c = new Area(s2);
	    this.a.add(b);
		this.a.add(c);
		}
	
	public Dimension getPreferredSize() { return new Dimension(200,200);}
	}
