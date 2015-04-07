//Class used to create GlassTypeTable from objects GlassType

public class GlassType {
	
	private String name;
	private Double[] thickness;
	private double maxWidth;
	private double maxHeight;
	private Double[] price;


	GlassType(String name, Double[] thickness, double maxWidth, double maxHeight, Double[] price)
		{
			{
				this.name = name;
				this.thickness = thickness;
				this.maxWidth = maxWidth;
				this.maxHeight = maxHeight;
				this.price = price;
				this.maxHeight = maxHeight;
			}	
		}
		
	
	public String getGName()
		{
			return name;
		}
	
	public double getGMaxWidth()
		{
			return maxWidth;
		}
	
	public double getGMaxHeight()
		{
			return maxHeight;
		}
	
	public Double[] getThickness()
		{
		return thickness;
		}
	
	public Double getThickness(int i)
	{
	return thickness[i];
	}
	
	public Double[] geGTPrice()
	{
	return price;
	}
		
}

