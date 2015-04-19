import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;


public class InnerCutShape extends Area {
	
	int x;
	int y;
	int width;
	int height;
	Area a;
	InnerCutShape(double x, double y, int width, int height)
	{
		Arc2D arc = new Arc2D.Double(this.x+(this.width/2),this.y-(this.height/2),this.width,this.height,270,270,Arc2D.OPEN);
	    Arc2D arc2 = new Arc2D.Double(this.x+(this.width/2),this.y+(this.height/2),this.width,this.height,90,360,Arc2D.OPEN);
	      
	    Area a = new Area(new Rectangle2D.Double(this.x, this.y, this.width, this.height));
	    Area b = new Area(arc);
	    Area c = new Area(arc2);
	    
	}
	
	
	
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
	     
	      Arc2D arc = new Arc2D.Double(this.x+(this.width/2),this.y-(this.height/2),this.width,this.height,270,270,Arc2D.OPEN);
	      Arc2D arc2 = new Arc2D.Double(this.x+(this.width/2),this.y+(this.height/2),this.width,this.height,90,360,Arc2D.OPEN);
	      
	    Area a = new Area(new Rectangle2D.Double(this.x, this.y, this.width, this.height));
	  Area b = new Area(arc);
	  Area c = new Area(arc2);
	  this.a.add(b);
	  this.a.add(c);
	    g2.draw(this.a);
	    
	    
	}
	public Dimension getPreferredSize() { return new Dimension(200,200);}
	}
