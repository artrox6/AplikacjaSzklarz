
public class GlassThickness {
		//Glass thickness for Float type glass
	private	static Double[] fThick = {2.0,3.0,4.0,6.0,8.0,10.0,12.0,19.0};
		//Glass thickness for lacobel type glass
	private static Double[] lThick = {4.0};
		//Frame thicknes for double glazing glass
	private static Double[] dgFrameThick = {6.0,8.0,10.0,12.0,16.0,20.0};


	public static Double[] getfThick()
		{
			return fThick;
		}
	
	public static Double[] getlThick()
		{
			return lThick;
		}
	public static Double[] getdgFrameThick()
		{
			return dgFrameThick;
		}
}