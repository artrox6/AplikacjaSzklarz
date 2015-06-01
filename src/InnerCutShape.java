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


public class InnerCutShape extends Area{
	

	private Area a;
	public Area getCut()
	{
		return a;
	}
	public boolean contains(Point2D p)
	{
	return super.contains(p);
	}

	InnerCutShape(double x, double y, double width, double height)
	{
		
	//	Arc2D arc = new Arc2D.Double(x+(width/2),y-(height/2),width,height,270,270,Arc2D.OPEN);
	//	Arc2D arc2 = new Arc2D.Double(x+(width/2),y+(height/2),width,height,90,360,Arc2D.OPEN);
		Ellipse2D s = new Ellipse2D.Double(x+(width/2),y-(height/2),width,height);
		Ellipse2D s2 = new Ellipse2D.Double(x+(width/2),y+(height/2),width,height);
		this.a = new Area(new Rectangle2D.Double(x, y, width, height));
		Area b = new Area(s);
	   	Area c = new Area(s2);
	   	this.a.add(b);
	    this.a.add(c);
	
	   
	}
	
	
	
	/**public void paintComponent(Graphics g)
	{	
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
	     
	      Arc2D arc = new Arc2D.Double(this.x+(this.width/2.5),this.y-(this.height/2.5),this.width,this.height,270,270,Arc2D.OPEN);
	      Arc2D arc2 = new Arc2D.Double(this.x+(this.width/2.5),this.y+(this.height/2.5),this.width,this.height,90,360,Arc2D.OPEN);
	      
	      this.a = new Area(new Rectangle2D.Double(this.x, this.y, this.width, this.height));
	      Area b = new Area(arc);
	      Area c = new Area(arc2);
	     this.a.add(b);
	     this.a.add(c);
	      g2.draw(a);
	    
	    
	}*/
	public Dimension getPreferredSize() { return new Dimension(200,200);}
	}
