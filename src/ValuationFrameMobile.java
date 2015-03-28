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

/**
 * Class that build GUI, for mobile devices.
 * Only action performed in this class set starting values of TextFields on 0.
 * Rest of actions are included to ValuationControler Class.
 */

public class ValuationFrameMobile extends JFrame implements ActionListener
	{
	
		private JTextField fWidth;
		private JTextField fHeight;
		private JTextField fPrice;
		private JTextField fArea;
		private JTextField fPriceV;
		private JComboBox <String> cGlassType;
		private JComboBox <Integer> cThickness;
		private JButton bValuate;
		//Constructing Float Valuation Object
		public FloatValuation glassSheet = new FloatValuation();
		
		// GUI constructor 
		
		public ValuationFrameMobile()
			{
			//Declaring Buttons
				
				bValuate = new JButton("Valuate");
				bValuate.addActionListener(this);
				
			//Declaring ComboBox	
				
				cGlassType = new JComboBox();
				cGlassType.addItem(GlassTypeTable.getGTable(0).getGName());
				cGlassType.addItem(GlassTypeTable.getGTable(1).getGName());
				cGlassType.addItem(GlassTypeTable.getGTable(2).getGName());
				cGlassType.addItem(GlassTypeTable.getGTable(3).getGName());
				cGlassType.addItem(GlassTypeTable.getGTable(4).getGName());
				cGlassType.addItem(GlassTypeTable.getGTable(5).getGName());
				cGlassType.addItem(GlassTypeTable.getGTable(6).getGName());
				cGlassType.addItem(GlassTypeTable.getGTable(7).getGName());
				cGlassType.addItem(GlassTypeTable.getGTable(8).getGName());
				cGlassType.addItem(GlassTypeTable.getGTable(9).getGName());
				cGlassType.addItem(GlassTypeTable.getGTable(10).getGName());
				cGlassType.addItem(GlassTypeTable.getGTable(11).getGName());

				
				cThickness = new JComboBox(GlassThickness.getfThick());
				
			//Declaring TextFields	

				fWidth = new JTextField();
				fWidth.setText(String.valueOf(glassSheet.getWidth()));
				fWidth.addActionListener(this);
				
				fHeight = new JTextField();
				fHeight.setText(String.valueOf(glassSheet.getHeight()));
				fHeight.addActionListener(this);
				
				fPrice = new JTextField();
				fPrice.setText(String.valueOf(glassSheet.getPrice()));
				fPrice.addActionListener(this);
				
				fArea = new JTextField();
				fArea.setText(String.valueOf(glassSheet.getArea()));
				fArea.addActionListener(this);
				
				fPriceV = new JTextField();
				fPriceV.setText(String.valueOf(glassSheet.getPriceV()));
				fPriceV.addActionListener(this);
				
			//Declaring Labels
				
				JLabel lWidth = new JLabel("Width");
				JLabel lHeight = new JLabel("Height");
				JLabel lPrice = new JLabel("Price");
				JLabel lArea = new JLabel("Area");
				JLabel lPriceV = new JLabel("Valuation Price");
				JLabel lGlassType = new JLabel("GlassType");
				JLabel lThickness = new JLabel("Thickness");
				
				/**
				 * Constructing Gridbag Layout 2x8
				 */
				
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
				constraints.ipadx = 100;
				constraints.ipady = 2;
				constraints.insets = new Insets(5,5,5,5); 
				add(lWidth,constraints);
			
			//Labels Constraints
			
				constraints.gridx = 0;
				constraints.gridy = 1;
				add(lHeight,constraints);
			
				constraints.gridx = 0;
				constraints.gridy = 2;
				add(lPrice,constraints);
			
				constraints.gridx = 0;
				constraints.gridy = 3;
				add(lArea,constraints);
				
				constraints.gridx = 0;
				constraints.gridy = 4;
				add(lGlassType,constraints);
			
				constraints.gridx = 0;
				constraints.gridy = 5;
				add(lThickness,constraints);
			
				constraints.gridx = 0;
				constraints.gridy = 6;
				add(lPriceV,constraints);
			
			//ComboBox Constraints	
			
				constraints.gridx = 1;
				constraints.gridy = 4;
				add(cGlassType,constraints);
			
	
				constraints.gridx = 1;
				constraints.gridy = 5;
				add(cThickness,constraints);
			
			 //TextField Constraints
			
				constraints.gridx = 1;
				constraints.gridy = 0;
				add(fWidth,constraints);
			
				constraints.gridx = 1;
				constraints.gridy = 1;
				add(fHeight,constraints);
				
				constraints.gridx = 1;
				constraints.gridy = 2;
				add(fPrice,constraints);
				
				constraints.gridx = 1;
				constraints.gridy = 3;
				add(fArea,constraints);
				
				constraints.gridx = 1;
				constraints.gridy = 6;
				add(fPriceV,constraints);
				
				constraints.gridx = 0;
				constraints.gridy = 7;
				constraints.gridwidth = 2;
				constraints.gridheight = 1;
				add(bValuate,constraints);
				
			}

		@Override
		//After pushing enter or button program use values from TextFields and start to count Area and PriceV
		public void actionPerformed(ActionEvent e) {
			Object source = e.getSource();
				if (source == bValuate)
					{
						glassSheet.setWidth(Double.parseDouble(fWidth.getText()));
						glassSheet.setHeight(Double.parseDouble(fHeight.getText()));
						glassSheet.setPrice(Double.parseDouble(fPrice.getText()));
						glassSheet.setArea(glassSheet.countArea());
						glassSheet.setPriceV(glassSheet.countValuationPrice());
						fArea.setText(String.valueOf(glassSheet.getArea()));
						fPriceV.setText(String.valueOf(glassSheet.getPriceV()));
					}
				if (source == fWidth)
					{
						glassSheet.setWidth(Double.parseDouble(fWidth.getText()));
						glassSheet.setHeight(Double.parseDouble(fHeight.getText()));
						glassSheet.setPrice(Double.parseDouble(fPrice.getText()));
						glassSheet.setArea(glassSheet.countArea());
						glassSheet.setPriceV(glassSheet.countValuationPrice());
						fArea.setText(String.valueOf(glassSheet.getArea()));
						fPriceV.setText(String.valueOf(glassSheet.getPriceV()));
					}
				else if (source == fHeight)
					{
						glassSheet.setWidth(Double.parseDouble(fWidth.getText()));
						glassSheet.setHeight(Double.parseDouble(fHeight.getText()));
						glassSheet.setPrice(Double.parseDouble(fPrice.getText()));
						glassSheet.setArea(glassSheet.countArea());
						glassSheet.setPriceV(glassSheet.countValuationPrice());
						fArea.setText(String.valueOf(glassSheet.getArea()));
						fPriceV.setText(String.valueOf(glassSheet.getPriceV()));
					}
				else if (source == fPrice)
					{
						glassSheet.setWidth(Double.parseDouble(fWidth.getText()));
						glassSheet.setHeight(Double.parseDouble(fHeight.getText()));
						glassSheet.setPrice(Double.parseDouble(fPrice.getText()));
						glassSheet.setArea(glassSheet.countArea());
						glassSheet.setPriceV(glassSheet.countValuationPrice());
						fArea.setText(String.valueOf(glassSheet.getArea()));
						fPriceV.setText(String.valueOf(glassSheet.getPriceV()));
					}
				else if (source == fArea)
					{
						glassSheet.setWidth(Double.parseDouble(fWidth.getText()));
						glassSheet.setHeight(Double.parseDouble(fHeight.getText()));
						glassSheet.setPrice(Double.parseDouble(fPrice.getText()));
						glassSheet.setArea(glassSheet.countArea());
						glassSheet.setPriceV(glassSheet.countValuationPrice());
						fArea.setText(String.valueOf(glassSheet.getArea()));
						fPriceV.setText(String.valueOf(glassSheet.getPriceV()));
						;
					}
				else if (source == fPriceV)
					{
						glassSheet.setWidth(Double.parseDouble(fWidth.getText()));
						glassSheet.setHeight(Double.parseDouble(fHeight.getText()));
						glassSheet.setPrice(Double.parseDouble(fPrice.getText()));
						glassSheet.setArea(glassSheet.countArea());
						glassSheet.setPriceV(glassSheet.countValuationPrice());
						fArea.setText(String.valueOf(glassSheet.getArea()));
						fPriceV.setText(String.valueOf(glassSheet.getPriceV()));
					}
				
			}
			
		}
