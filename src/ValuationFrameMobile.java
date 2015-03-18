import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ValuationFrameMobile extends JFrame
	{
	private JTextField fWidth;
	private JTextField fHeight;
	private JTextField fPrice;
	private JTextField fArea;
	private JTextField fPriceV;
	private JComboBox cGlassType;
	private JComboBox cThickness;


	public ValuationFrameMobile()
		{
		fWidth = new JTextField("0");
		JLabel lWidth = new JLabel("Width");
		JLabel lHeight = new JLabel("Height");
		JLabel lPrice = new JLabel("Price");
		JLabel lArea = new JLabel("Area");
		JLabel lPriceV = new JLabel("PriceV");
		JLabel lGlassType = new JLabel("GlassType");
		JLabel lThickness = new JLabel("Thickness");

		GridBagLayout layout = new GridBagLayout();
		setLayout(layout);
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.weightx = 100;
		constraints.weighty = 100;
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		add(lWidth,constraints);
		constraints.gridx = 0;
		constraints.gridy = 1;
		add(lHeight,constraints);
		constraints.gridx = 2;
		constraints.gridy = 0;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		
		add(fWidth,constraints);
		}
	}