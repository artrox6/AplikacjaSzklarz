
public class FloatValuation implements ValuationStrategyInterface {
	
	private double width;
	private double height;
	private String glassType;
	private double price;
	private double area;
	private double thickness;
	private double valuationPrice;
	private double priceV;
	//set parameters Methods
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
	public void setPriceV(double priceV)
	{
		this.priceV = priceV;
	}
	public void setArea(double area)
	{
		this.area = area;
	}
	public void setThickness(double thickness)
	{
		this.thickness = thickness;
	}

	
	//counting Methods
	public double countArea()
	{
		this.area = (getWidth()/100)*(getHeight()/100);
		return area;
	}
	public double countValuationPrice()
	{
		this.valuationPrice = area*price;
		return valuationPrice;
	}
	
	
	//get Methods return paramethers getParam()
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
	public double getPriceV()
	{
		return priceV;
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
