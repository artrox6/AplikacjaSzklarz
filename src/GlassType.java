
public class GlassType {
	
	private String name;
	private double maxWidth;
	private double maxHeight;


		GlassType(String name, double maxWidth, double maxHeight)
			{
				this.name = name;
				this.maxWidth = maxWidth;
				this.maxHeight = maxHeight;		
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
	
		
}

