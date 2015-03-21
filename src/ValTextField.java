import javax.swing.JTextField;


public class ValTextField extends JTextField{

	double value;
	
	ValTextField(double value)
	{
		new JTextField(toString().valueOf(value));
	}
}
