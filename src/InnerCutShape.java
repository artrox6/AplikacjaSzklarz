import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;


/**

public class InnerCutShape extends JComponent {
	double x;
	double y;
	double height;
	double width;
	
	
	InnerCutShape(double x, double y , double height, double width)
	{
		this.x = x;
		this.y = y;
		this.height = height;
		this.height = width ;
	}

	public void paintComponent(Graphics g)
	{
		
		Graphics2D g2 = (Graphics2D) g;
		
	     
	     Arc2D arc = new Arc2D.Double(x,y,60,60,270,270,Arc2D.OPEN);
	     Arc2D arc2 = new Arc2D.Double(90,90,60,60,90,360,Arc2D.OPEN);
	      
	  Area a = new Area(new Rectangle2D.Double(60, 50, 80, 80));
	  Area b = new Area(arc);
	  Area c = new Area(arc2);
	  a.add(b);
	  a.add(c);
	   g2.draw(a);
	    
	    
	}
	public Dimension getPreferredSize() { return new Dimension(200, 200); }
	}**/
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
	
	double x;
	double y;
	int width;
	int height;
	Area a;
	InnerCutShape(double x, double y, int width, int height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	    
	}
	
	
	
	
	public void DrawArea(Graphics2D g2)
	{
		
	  Arc2D arc = new Arc2D.Double(this.x+(this.width/2),(this.y-(this.height/2))+(0.25*(this.width)),this.width,this.height,270,270,Arc2D.OPEN);
	  Arc2D arc2 = new Arc2D.Double(this.x+(this.width/2),this.y+(this.height/2),this.width,this.height,90,360,Arc2D.OPEN);
	      
	  this.a = new Area(new Rectangle2D.Double(this.x, this.y, 1.25* (this.width), 1.25*(this.height)));
	  Area b = new Area(arc);
	  Area c = new Area(arc2);
	  this.a.add(b);
	  this.a.add(c);
	  g2.draw(this.a);
	    
	    
	}
	public Dimension getPreferredSize() { return new Dimension(200,200);}
	}

