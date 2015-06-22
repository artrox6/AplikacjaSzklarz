import java.awt.geom.Point2D;


public class DiagonalFrame {
private double x1;
private double x2;
private double y1;
private	double y2;

DiagonalFrame(Point2D p1, Point2D p2)
	{
		x1=p1.getX();
		x2=p2.getX();
		y1=p1.getY();
		y2=p2.getY();
		if(x2 < x1)
		{
			double t=x1;
			x1=x2;
			x2=t;
		}
		if(y2 <y1)
		{
			double t =y1;
			y1 = y2;
			y2 = t;
		}
	}

	public double getX1()
	{
		return x1;
	}
	public double getX2()
	{
		return x2;
	}
	public double getY1()
	{
		return y1;
	}
	public double getY2()
	{
		return y2;
	}
}
