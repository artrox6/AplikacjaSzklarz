import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JComponent;

	
public class DrawingMouseComp extends JComponent 
{
	
	private  ArrayList<InnerCutShape> innerCuts;
	private InnerCutShape current;
	private int x;
	private int y;
	//Array that stores all drawings of innercuts
	public DrawingMouseComp()
		{
			innerCuts = new ArrayList<>();
			current = null;
			addMouseListener(new MouseHandler());
			addMouseMotionListener(new MouseMotionHandler());
		}
	
	  //Drawing all inner cuts 
	
	public void paintComponent(Graphics cut)
		{
		Graphics2D cut2 = (Graphics2D) cut;
		
			for(InnerCutShape i: innerCuts)
			{
				cut2.draw(i);
			}
		}
	
	  /**
	    * Finds first innercut that includes point
	    * @param p point
	    * @return first innercut that includes point
	    */
	public InnerCutShape find (Point2D p)
		{
			for (InnerCutShape i : innerCuts)
				{
					if(i.contains(p)) 
					return i;
				}
			return null;
		}
	
	
	  /**
	    * Add innerCut to panel and array
	    * @param p right upper corner of rectangle
	    */
	
	public void add(Point2D p)
		{
			double x = p.getX();
			double y = p.getY();
			
			current = new InnerCutShape(x, y, 0, 0);
			innerCuts.add(current);
			repaint();
		}
	 
	  /**
	    * Remove inerCut from panel and array.
	    * @param s cut that will be removed
	    */
	   public void remove(InnerCutShape s)
	   {
	      if (s == null) return;
	      if (s == current) current = null;
	      innerCuts.remove(s);
	      repaint();
	   }
	  
	
	private class MouseHandler extends MouseAdapter
	   {
	      public void mousePressed(MouseEvent event)
	      {
	         // Dodanie nowego kwadratu, jeœli kursor nie jest wewn¹trz innego kwadratu
	         current = find(event.getPoint());
	         //if (current == null) 
	         add(event.getPoint());
	         x = event.getX();
	         y =event.getX();
	      }
	      public void mouseClicked(MouseEvent event)
	      {
	         // Usuniêcie kwadratu w wyniku jego dwukrotnego klikniêcia
	         current = find(event.getPoint());
	         if (current != null && event.getClickCount() >= 2) remove(current);
	      }
	   }
	   private class MouseMotionHandler implements MouseMotionListener
	   {
	      public void mouseMoved(MouseEvent event)
	      {
	         // Ustawienie kursora na krzy¿yk, jeœli znajduje siê wewn¹trz
	         // kwadratu

	         if (find(event.getPoint()) == null) setCursor(Cursor.getDefaultCursor());
	         else setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
	      }

	      public void mouseDragged(MouseEvent event)
	      {
	         if (current != null)
	         {
	           // int x = event.getX();
	          //  int y = event.getY();
	          
	          
	            // Przeci¹gniêcie aktualnego kwadratu w celu wycentrowania go w punkcie (x, y)
	           
	         
	         	
	            repaint();
	            
	            {
	            	
	            }
	         }
	      }
	   }
}