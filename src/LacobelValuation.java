
public class LacobelValuation implements ValuationStrategyInterface {
	private double width;
	private double height;
	private String glassType;
	private double price;
	private double area;
	private double thickness;
	private String color;
	public void setWidth(double width)
	{
		this.width = width;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public void setGlassType(String glassType)
	{
		this.glassType = glassType;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setArea(double area)
	{
		this.area = area;
	}
	public void setThickness(double thickness)
	{
		this.thickness = thickness;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	
	
	
	public double getWidth()
	{
		return width;
	}
	public double getHeight()
	{
		return height;
	}
	public String getGlassType()
	{
		return glassType;
	}
	public double getPrice()
	{
		return price;
	}
	public double getArea()
	{
		return area;
	}
	public double getThickness()
	{
		return thickness;
	}
	public String getColor()
	{
		return color;
	}
}
