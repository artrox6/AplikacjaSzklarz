import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.RoundRectangle2D;


public class RoundRectCut implements CutInterface {
	
		private Area a;	
		private double RoundCornerHAndW= 50;
		
		public void setRoundCorner(double r)
		{
			this.RoundCornerHAndW= r;
		}
		public double getRoundCorner()
		{
			return RoundCornerHAndW;
		}
		public Area getCut()
			{
				return a;
			}
		RoundRectCut()
			{
				a = new Area(new RoundRectangle2D.Double(0, 0, 0,0, 20, 20));
			}

		RoundRectCut(double x, double y,double width, double height)
			{
		    	a  = new Area(new RoundRectangle2D.Double(x, y, width, height, RoundCornerHAndW, RoundCornerHAndW));
			}
			
		public void setFromDiagonal(Point2D p1, Point2D p2)
			{
			RoundRectangle2D rect = new RoundRectangle2D.Double(0, 0, 0, 0, RoundCornerHAndW, RoundCornerHAndW);
				rect.setFrameFromDiagonal(p1, p2);
				a = new Area(rect);
			}
	
}
