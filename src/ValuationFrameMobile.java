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
		private JComboBox <Double> cThickness;
		private JButton bValuate;
		private Double[] tempGlassPrice={};
		private Double[] tempGlassType={};
		private Double[] temp={};
		//Constructing Float Valuation Object
		public FloatValuation glassSheet = new FloatValuation();
		
		// GUI constructor 
		
		public ValuationFrameMobile()
			{
			
				
			
			
			
			//Creating Action Listener Object
				
				CountAction count = new CountAction();
				GlTypeAction glassSelect = new GlTypeAction();
				ThickAction thickSelect = new ThickAction();
			//Declaring ComboBox	
				
				cGlassType = new JComboBox();
				for (int i = 0; i < GlassTypeTable.getGFTable().length; i++ )
				{
				cGlassType.addItem(GlassTypeTable.getGTable(i).getGName());
				}
				cGlassType.addActionListener(glassSelect);
				
				cThickness = new JComboBox(tempGlassType);
				cThickness.addActionListener(thickSelect);
			
			//Declaring TextFields	
				
				fWidth = new JTextField();
				fWidth.setText(String.valueOf(glassSheet.getWidth()));
				fWidth.addActionListener(count);
				
				fHeight = new JTextField();
				fHeight.setText(String.valueOf(glassSheet.getHeight()));
				fHeight.addActionListener(count);
				
				fPrice = new JTextField();
				fPrice.setText(String.valueOf(glassSheet.getPrice()));
				fPrice.addActionListener(count);
				
				fArea = new JTextField();
				fArea.setText(String.valueOf(glassSheet.getArea()));
				fArea.addActionListener(count);
				
				fPriceV = new JTextField();
				fPriceV.setText(String.valueOf(glassSheet.getPriceV()));
				fPriceV.addActionListener(count);
				
			//Declaring Buttons
				
				bValuate = new JButton("Valuate");
				bValuate.addActionListener(count);
				
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

	
		//After pushing enter or button program use values from TextFields and start to count Area and PriceV
		private class CountAction implements ActionListener
			{
			public void actionPerformed(ActionEvent e)
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
		//After Selecting Glass type in combo box set max size and price for m^2
		private class GlTypeAction implements ActionListener
			{
			public void actionPerformed(ActionEvent e)
				{
				
				if(cGlassType.getSelectedItem().equals(GlassTypeTable.getGTable(cGlassType.getSelectedIndex()).getGName()))
					{
						
						tempGlassType=(GlassTypeTable.getGTable(cGlassType.getSelectedIndex()).getThickness());
						cThickness.removeAllItems();
						tempGlassPrice=(GlassTypeTable.getGTable(cGlassType.getSelectedIndex()).geGTPrice());
						fPrice.setText(String.valueOf((tempGlassPrice[0])));
					for (int i = 0; i < tempGlassType.length; i++ )
						{
						cThickness.addItem(GlassTypeTable.getGTable(cGlassType.getSelectedIndex()).getThickness(i));
						}
					
					}
					
				}
			}
		private class ThickAction implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				
			
				
				
				if (cThickness!= null)
				{
				fPrice.setText(String.valueOf((tempGlassPrice[cThickness.getSelectedIndex()])));
				glassSheet.setPriceV((tempGlassPrice[cThickness.getSelectedIndex()]));
				}
				
				
			}
		}
	}
