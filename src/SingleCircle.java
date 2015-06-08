import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;


public class SingleCircle implements CutInterface
{
	private Area a;	

	
	public Area getCut()
		{
			return a;
		}
	
	SingleCircle()
		{
			a = new Area(new Ellipse2D.Double(50, 50, 50, 50));
		}

	SingleCircle(double x, double y,double width, double height)
		{
	    	a  = new Area(new Ellipse2D.Double(x, y, width, height));
		}
		
	public void setFromDiagonal(Point2D p1, Point2D p2)
		{
			Ellipse2D circle = new Ellipse2D.Double();
			circle.setFrameFromDiagonal(p1, p2);
			a = new Area(circle);
		}
}
