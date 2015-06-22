import java.awt.geom.Area;
import java.awt.geom.Point2D;


public interface CutInterface {
public Area getCut();
public void setFromDiagonal(Point2D p1,Point2D p2);
public double getCenterX();
public double getCenterY();
}
