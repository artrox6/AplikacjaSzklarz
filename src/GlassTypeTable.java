
public class GlassTypeTable {

	private static GlassType[] glassTable =
		{
		new GlassType("Float", 321.0, 225.0),
		new GlassType("OptiWhite", 321.0, 225.0),
		new GlassType("Antisol", 321.0, 225.0),
		new GlassType("Dark Grey", 321.0, 225.0),
		new GlassType("Reflex", 321.0, 225.0),
		new GlassType("Lacobel", 225.0, 160.0),
		new GlassType("Lacomat", 321.0, 225.0),
		new GlassType("Satyna", 321.0, 225.0),
		new GlassType("Lustro", 321.0, 225.0),
		new GlassType("VSG", 321.0, 225.0),
		new GlassType("Ornament", 225.0, 160.0),
		new GlassType("Robax", 225.0, 160.0),
		};
	
	public static GlassType getGTable(int i)
	{
		return glassTable[i];
	}
	public static double getGPrice(int i)
	{
		return glassTable[i].getGPrice();
	}
	
	public static GlassType[] getGFTable()
	{
		return glassTable;
	}
}	
