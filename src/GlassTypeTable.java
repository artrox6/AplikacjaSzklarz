
public class GlassTypeTable {

	private static GlassType[] glassTable =
		{
		new GlassType("Float", GlassThickness.getfThick() , 321.0, 225.0, 150.0),
		new GlassType("OptiWhite", GlassThickness.getfThick() , 321.0, 225.0, 150.0),
		new GlassType("Antisol", GlassThickness.getfThick() , 321.0, 225.0, 150.0),
		new GlassType("Dark Grey", GlassThickness.getfThick() , 321.0, 225.0, 150.0),
		new GlassType("Reflex", GlassThickness.getfThick() , 321.0, 225.0, 150.0),
		new GlassType("Lacobel", GlassThickness.getlThick() , 225.0, 160.0, 150.0),
		new GlassType("Lacomat", GlassThickness.getfThick() , 321.0, 225.0, 150.0),
		new GlassType("Satyna", GlassThickness.getfThick() , 321.0, 225.0, 150.0),
		new GlassType("Lustro", GlassThickness.getfThick() , 321.0, 225.0, 150.0),
		new GlassType("VSG", GlassThickness.getfThick() , 321.0, 225.0, 150.0),
		new GlassType("Ornament", GlassThickness.getfThick() , 225.0, 160.0, 150.0),
		new GlassType("Robax", GlassThickness.getfThick() , 225.0, 160.0, 150.0),
		};
	
	public static GlassType getGTable(int i)
	{
		return glassTable[i];
	}
	public static double getGPrice(int i)
	{
		return glassTable[i].getGPrice();
	}
}	
