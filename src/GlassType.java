
public class GlassType {
	private int IDGNumber;
	private String name;
	private Double[] thickness;
	private double maxWidth;
	private double maxHeight;
	private double price;

		GlassType(String name, Double[] thickness, double maxWidth, double maxHeight, double price)
			{
				this.name = name;
				this.thickness = thickness;
				this.maxWidth = maxWidth;
				this.maxHeight = maxHeight;
				this.price = price;
			}
		
		public int getIDGNumber()
			{
				return IDGNumber;
			}
		public String getGName()
			{
				return name;
			}
		public Double[] getGThickness()
			{
				return thickness;
			}
		public double getGMaxWidth()
			{
				return maxWidth;
			}
		public double getGMaxHeight()
			{
				return maxHeight;
			}
		public double getGPrice()
			{
				return price;
			}
}

