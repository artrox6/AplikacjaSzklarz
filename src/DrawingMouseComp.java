import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;


	
public class DrawingMouseComp extends JComponent 
{
	//Array that stores all drawings of innercuts
	private ArrayList<InnerCutShape> innerCuts;
	private InnerCutShape current;

	
	public DrawingMouseComp()
		{
			innerCuts = new ArrayList<InnerCutShape>();
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
				cut2.draw(i.getCut());
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
					if (i.contains(p)) return i;
					
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
			
			current = new InnerCutShape(x,y,60,60);
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
	         // Dodanie nowego ksztaltu, jeœli kursor nie jest wewn¹trz innego kwadratu
	         current = find(event.getPoint());
	         if (current == null) add(event.getPoint());
	         
	            
	      }
	      public void mouseClicked(MouseEvent event)
	      {
	         // Usuniêcie ksztaltu w wyniku jego dwukrotnego klikniêcia
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
	            int x = event.getX();
	            int y = event.getY();

	         
	         }
	      }
	   }
	   
	   public Dimension getPreferredSize() { return new Dimension(300, 300); }
	}

	   