
public class GlassThickPrice 
{
	//Price for m^2 glass depending on glass thickness of selected Type
	
	//Price for fThick table
	private	static Double[] pFloat = {12.5,12.5,15.0,18.75,22.5,30.0,37.5};
	
	//Price for oPWThick table
	private static Double[] pOPWhite = {32.0,40.0,48.0,60.0,80.0};
	
	//Price for aThick table
	private static Double[] pAntisol = {17.5,21.5};
	
	//Price for dGThick table
	private static Double[] pDarkGrey = {44.0,60.0};
	
	//Price for reThick table
	private static Double[] pReflex = {56.0};
	
	//Price for lThick table
	private static Double[] pLacobel = {45.0};
	
	//Price for laThick table
	private static Double[] pLacomat = {45.0};
	
	//Price for sThick table
	private static Double[] pSatin = {32.0};
	
	//Price for mirThick table
	private static Double[] pMirror = {21.5,28.0,35.0,42.0};
	
	//Price for vSGThick table
	private static Double[] pVSG = {55.0,40.0,52.0};
	
	//Price for oThick table
	private static Double[] pOrnament = {30.0};
	
	//Price for rThick table
	private static Double[] pRobax = {600.0};
	
	public static Double[] getPFloat()
	{
		return pFloat;
	}
	
	public static Double[] getPOPWhite()
	{
		return pOPWhite;
	}
	
	public static Double[] getPAntisol()
	{
		return pAntisol;
	}
	
	public static Double[] getPDarkGrey()
	{
		return pDarkGrey;
	}
	
	public static Double[] getPReflex()
	{
		return pReflex;
	}
	
	public static Double[] getPLacobel()
	{
		return pLacobel;
	}
	
	public static Double[] getPLacomat()
	{
		return pLacomat;
	}
	
	public static Double[] getPSatin()
	{
		return pSatin;
	}
	
	public static Double[] getPMirror()
	{
		return pMirror;
	}
	
	public static Double[] getPVSG()
	{
		return pVSG;
	}
	
	public static Double[] getPOrnament()
	{
		return pOrnament;
	}
	
	public static Double[] getPRobax()
	{
		return pRobax;
	}
	
}
