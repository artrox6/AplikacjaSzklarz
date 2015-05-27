import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;


public class CopyOfInnerCutShape implements Area{
	double x;
	double y;
	double height;
	double width;
	Area a;
	
	public Area RysujCopyOfInnerCutShape(double x, double y, double width, double height)
	{
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		Arc2D arc = new Arc2D.Double(x+(width/2),y-(height/2),width,height,270,270,Arc2D.OPEN);
		Arc2D arc2 = new Arc2D.Double(x+(width/2),y+(height/2),width,height,90,360,Arc2D.OPEN);
	      
		this.a = new Area(new Rectangle2D.Double(x, y, width, height));
		Area b = new Area(arc);
	   	Area c = new Area(arc2);
	   	
	   this.a.add(b);
	   this.a.add(c);
	   
	   return a;
	}
	
	public Area RysujWciecie()
	{
		return this.a;
	}
	

	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
			     	    
	      g2.draw(a);
	    
	    
	}
	public Dimension getPreferredSize() { return new Dimension(200,200);}
	}
