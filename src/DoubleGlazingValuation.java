
public class DoubleGlazingValuation implements ValuationStrategyInterface {
	private double width;
	private double height;
	private String glassType;
	private String glassType2;
	private double price;
	private double area;
	private double thickness;
	
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
	public void setGlassType2(String glassType2)
	{
		this.glassType2 = glassType2;
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
	public String getGlassType2()
	{
		return glassType2;
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
}
