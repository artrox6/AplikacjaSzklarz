import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;


public class DoubleCircle implements CutInterface {
private double distance = 100;	
private Area a;
public Area getCut()
{
	return a;
} 
	DoubleCircle()
	{
	Rectangle2D xx = new Rectangle2D.Double(50, 50, 50, 50);
	a = new Area(xx);
	}
DoubleCircle (double c1x, double c1y, double distance, double height ,double width )
	{
	this.a = new Area();
	Ellipse2D c1 = new Ellipse2D.Double( c1x , c1y , width , height);
	Ellipse2D c2 = new Ellipse2D.Double( c1x , c1y + distance , width , height);
	Area a1 = new Area(c1);
	Area a2 = new Area(c2);
	this.a.add(a1);
	this.a.add(a2);
	}
public void setFromDiagonal(Point2D p1, Point2D p2)
	{
	double width = p2.getX() - p1.getX();
    double height= p2.getY() - p1.getY();
	Ellipse2D c1 = new Ellipse2D.Double( p1.getX() , p1.getY() , width , height);
	Ellipse2D c2 = new Ellipse2D.Double( p1.getX() , p1.getY() + distance , width , height);
	this.a = new Area(c1);
	Area a1 = new Area(c2);
	
	this.a.add(a1);
	}
public void setDistance(double d)
	{
	this.distance=d;
	}
public double getDistance()
	{
	return distance;
	}
}
