
interface ValuationStrategyInterface {
public void setWidth(double width);
public void setHeight(double height);
public void setGlassType(String glassType);
public void setPrice(double price);
public void setArea(double area);
public void setThickness(double thickness);

public double countArea();
public double countPrice();

public double getWidth();
public double getHeight();
public String getGlassType();
public double getPrice();
public double getArea();
public double getThickness();
}