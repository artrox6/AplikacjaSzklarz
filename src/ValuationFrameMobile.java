import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ValuationFrameMobile extends JFrame implements ActionListener
	{
	private JTextField fWidth;
	private JTextField fHeight;
	private JTextField fPrice;
	private JTextField fArea;
	private JTextField fPriceV;
	private JComboBox <Integer> cGlassType;
	private JComboBox <Integer> cThickness;
	private JButton bValuate;
	FloatValuation GlassSheet = new FloatValuation();
	public ValuationFrameMobile()
		{
		
		bValuate = new JButton("Valuate");
		cGlassType = new JComboBox(new Integer[]{10000,10001,10002,10003});
		cThickness = new JComboBox(new Integer[]{2,4,5,6,8,10,12,19});
		fWidth = new JTextField();
		fWidth.setText(String.valueOf(GlassSheet.getWidth()));
		
		fHeight = new JTextField();
		fHeight.setText(String.valueOf(GlassSheet.getHeight()));
		
		fPrice = new JTextField();
		fPrice.setText(String.valueOf(GlassSheet.getPrice()));
		fArea = new JTextField();
		fArea.setText(String.valueOf(GlassSheet.getArea()));
		fPriceV = new JTextField();
		fPriceV.setText(String.valueOf(GlassSheet.getPriceV()));
		JLabel lWidth = new JLabel("Width");
		JLabel lHeight = new JLabel("Height");
		JLabel lPrice = new JLabel("Price");
		JLabel lArea = new JLabel("Area");
		JLabel lPriceV = new JLabel("Valuation Price");
		JLabel lGlassType = new JLabel("GlassType");
		JLabel lThickness = new JLabel("Thickness");

		GridBagLayout layout = new GridBagLayout();
		setLayout(layout);
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.weightx = 60;
		constraints.weighty = 60;
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.fill = GridBagConstraints.CENTER;
		constraints.ipadx = 100;
		constraints.ipady = 2;
		constraints.insets = new Insets(5,5,5,5); 
		add(lWidth,constraints);
		
		//Labels Constraints
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.fill = GridBagConstraints.CENTER;
		add(lHeight,constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.fill = GridBagConstraints.CENTER;
		add(lPrice,constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.fill = GridBagConstraints.CENTER;
		add(lArea,constraints);
			
		constraints.gridx = 0;
		constraints.gridy = 4;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.fill = GridBagConstraints.CENTER;
		add(lGlassType,constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 5;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.fill = GridBagConstraints.CENTER;
		add(lThickness,constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 6;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.fill = GridBagConstraints.CENTER;
		add(lPriceV,constraints);
		
		//ComboBox Constraints	
		
		constraints.gridx = 1;
		constraints.gridy = 4;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.fill = GridBagConstraints.CENTER;
		add(cGlassType,constraints);
		

		constraints.gridx = 1;
		constraints.gridy = 5;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.fill = GridBagConstraints.CENTER;
		add(cThickness,constraints);
		
		 //TextField Constraints
		
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		add(fWidth,constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		add(fHeight,constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		add(fPrice,constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		add(fArea,constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 6;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		add(fPriceV,constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 7;
		constraints.gridwidth = 2;
		constraints.gridheight = 1;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		add(bValuate,constraints);
		bValuate.addActionListener(this);
		}
	public void actionPerformed(ActionEvent e)
	{
		GlassSheet.setWidth(Double.parseDouble(fWidth.getText()));
		GlassSheet.setHeight(Double.parseDouble(fHeight.getText()));
		GlassSheet.countArea();
		fArea.setText(String.valueOf(GlassSheet.getArea()));
	}
	
	}