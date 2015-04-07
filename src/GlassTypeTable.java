
public class GlassTypeTable {

	private static GlassType[] glassTable =
		{
			new GlassType("Float", GlassThickness.getFThick() , 321.0, 225.0, GlassThickPrice.getPFloat() ),
			new GlassType("OptiWhite", GlassThickness.getOPWThick() , 321.0, 225.0, GlassThickPrice.getPOPWhite()),
			new GlassType("Antisol", GlassThickness.getAThick() , 321.0, 225.0, GlassThickPrice.getPAntisol()),
			new GlassType("Dark Grey", GlassThickness.getDGThick() , 321.0, 225.0, GlassThickPrice.getPDarkGrey()),
			new GlassType("Reflex", GlassThickness.getReThick() , 321.0, 225.0, GlassThickPrice.getPReflex()),
			new GlassType("Lacobel", GlassThickness.getLThick() , 225.0, 160.0, GlassThickPrice.getPLacobel()),
			new GlassType("Lacomat", GlassThickness.getLaThick() , 321.0, 225.0, GlassThickPrice.getPLacomat()),
			new GlassType("Satyna", GlassThickness.getSThick() , 321.0, 225.0, GlassThickPrice.getPSatin()),
			new GlassType("Lustro", GlassThickness.getMirThick() , 321.0, 225.0, GlassThickPrice.getPMirror()),
			new GlassType("VSG", GlassThickness.getVSGThick() , 321.0, 225.0, GlassThickPrice.getPVSG()),
			new GlassType("Ornament", GlassThickness.getOThick() , 225.0, 160.0, GlassThickPrice.getPOrnament()),
			new GlassType("Robax", GlassThickness.getRoThick() , 225.0, 160.0, GlassThickPrice.getPRobax()),
		};
	
	public static GlassType getGTable(int i)
	{
		return glassTable[i];
	}
	//public static double getGPrice(int i)
//	{
//		return glassTable[i].getGPrice();
//	}
	
	public static GlassType[] getGFTable()
	{
		return glassTable;
	}
}	
