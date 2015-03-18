import javax.swing.JFrame;


public class Test
{
	public static void main(String[] args)
	{
		JFrame frame = new ValuationFrameMobile();
		frame.setBounds(400, 300, 200, 400);
		
		
		frame.setTitle("Valuation Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
