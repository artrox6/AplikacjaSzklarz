import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class Test
{
	public static void main(String[] args)
	{
	
	JFrame frame = new ValuationFrameMobile();
	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension screenSize = kit.getScreenSize();
	int screenWidth = screenSize.width;
	int screenHeight = screenSize.height;
	frame.setSize(screenWidth / 2, screenHeight / 2);
	frame.setLocationByPlatform(true);
	frame.setTitle("Valuation Frame");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	ValuationFrameMobile qq= new ValuationFrameMobile();
		
	
	/// przekazanie obiekltu wewnetrznego z innej klasy !!!!!!!!!!!!!!!!!!!!!!!
	FloatValuation j = new FloatValuation();
		j = qq.getGlass();
	
		(qq.getGlass()).setWidth(2.0);
	}
}
