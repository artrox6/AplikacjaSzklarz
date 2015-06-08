import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;


	
public class DrawingMouseComp extends JComponent 
{
	//Array that stores all drawings of innercuts
	private ArrayList<CutInterface> innerCuts;
	private CutInterface current;
	public  ShapeToolBar shapechanger = new ShapeToolBar();
	
	double x;
	double y;
	Point2D punkt;
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
		
			for(CutInterface i: innerCuts)
			{
				cut2.draw(i.getCut());
			}
		}
	
	  /**
	    * Finds first innercut that includes point
	    * @param p point
	    * @return first innercut that includes point
	    */
	public CutInterface find (Point2D p)
		{
			for (CutInterface i : innerCuts)
				{
					if (i.getCut().contains(p)) return i;
					
				}
			return null;
		}
	
	
	  /**
	    * Add innerCut to panel and array
	    * @param p right upper corner of rectangle
	    */
	
	public void add(Point2D p)
		{
			this.x = p.getX();
			this.y = p.getY();
			
			current = shapechanger.getCutType();
			//innerCuts.add(current);
			repaint();
		}
	 
	  /**
	    * Remove inerCut from panel and array.
	    * @param s cut that will be removed
	    */
	   public void remove(CutInterface s)
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
	         punkt = event.getPoint();
	            
	      }
	      public void mouseClicked(MouseEvent event)
	      {
	         // Usuniêcie ksztaltu w wyniku jego dwukrotnego klikniêcia
	         current = find(event.getPoint());
	         if (current != null && event.getClickCount() >= 2) remove(current);
	         repaint();
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
	        	 current.setFromDiagonal(punkt,event.getPoint());
	        	 innerCuts.add(current);
	        	 repaint();
	         }
	      }
	   }
	   
	   public Dimension getPreferredSize() { return new Dimension(300, 300); }
	}

	   