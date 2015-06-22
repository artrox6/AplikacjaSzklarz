import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
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
		private DefaultComboBoxModel model;
		private JTextField fWidth;
		private JTextField fHeight;
		private JTextField fPrice;
		private JTextField fArea;
		private JTextField fPriceV;
		private JComboBox <String> cGlassType;
		private JComboBox <Double> cThickness;
		private JButton bValuate;
		private DrawingPanel dPane;
		private ShapeToolBar toolBar;
		private Double[] tempGlassPrice={};
		private Double[] tempGlassThick={};
		private String[] StringTGlassThick;
		private String[] StringTGlassPrice;
		private Double[] temp={};
		//Constructing Float Valuation Object
		public FloatValuation glassSheet = new FloatValuation();
		
		// GUI constructor 
		public FloatValuation getGlass()
		{
			return glassSheet;
		}
		public ValuationFrameMobile()
			{
			
				
			
			
			
			//Creating Action Listener Object
				
				CountAction count = new CountAction();
				GlTypeAction glassSelect = new GlTypeAction();
				ThickAction thickSelect = new ThickAction();
				AreaAction area = new AreaAction();
			//Declaring ComboBox	
				
				cGlassType = new JComboBox();
				for (int i = 0; i < GlassTypeTable.getGFTable().length; i++ )
				{
				cGlassType.addItem(GlassTypeTable.getGTable(i).getGName());
				}
				cGlassType.addActionListener(glassSelect);
				
				cThickness = new JComboBox(tempGlassThick);
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
				fArea.addActionListener(area);
				
				fPriceV = new JTextField();
				fPriceV.setText(String.valueOf(glassSheet.getPriceV()));
				fPriceV.addActionListener(count);
				
			//Declaring Buttons
				
				bValuate = new JButton("Valuate");
				bValuate.addActionListener(count);
				
				toolBar = new ShapeToolBar();
				
				dPane = new DrawingPanel();
				dPane.getMouse().setToolbar(toolBar);
				
				
				
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
				constraints.weightx = 0;
				constraints.weighty = 0;
				constraints.gridx = 0;
				constraints.gridy = 1;
				constraints.gridwidth = 1;
				constraints.gridheight = 1;
				constraints.fill = GridBagConstraints.HORIZONTAL;
				constraints.ipadx = 40;
				constraints.ipady = 2;
				constraints.insets = new Insets(5,5,5,5); 
				add(lWidth,constraints);
			
			//Labels Constraints
			
				constraints.gridx = 0;
				constraints.gridy = 2;
				add(lHeight,constraints);
			
				constraints.gridx = 0;
				constraints.gridy = 3;
				add(lPrice,constraints);
			
				constraints.gridx = 0;
				constraints.gridy = 4;
				add(lArea,constraints);
				
				constraints.gridx = 0;
				constraints.gridy = 5;
				add(lGlassType,constraints);
			
				constraints.gridx = 0;
				constraints.gridy = 6;
				add(lThickness,constraints);
			
				constraints.gridx = 0;
				constraints.gridy = 7;
				add(lPriceV,constraints);
			
			//ComboBox Constraints	
			
				constraints.gridx = 1;
				constraints.gridy = 5;
				add(cGlassType,constraints);
			
	
				constraints.gridx = 1;
				constraints.gridy = 6;
				add(cThickness,constraints);
			
			 //TextField Constraints
			
				constraints.gridx = 1;
				constraints.gridy = 1;
				add(fWidth,constraints);
			
				constraints.gridx = 1;
				constraints.gridy = 2;
				add(fHeight,constraints);
				
				constraints.gridx = 1;
				constraints.gridy = 3;
				add(fPrice,constraints);
				
				constraints.gridx = 1;
				constraints.gridy = 4;
				add(fArea,constraints);
				
				constraints.gridx = 1;
				constraints.gridy = 7;
				add(fPriceV,constraints);
				
				constraints.gridx = 0;
				constraints.gridy = 8;
				constraints.gridwidth = 2;
				constraints.gridheight = 0;
				add(bValuate,constraints);
				
				constraints.gridx = 2;
				constraints.gridy = 1;
				constraints.gridwidth = 6;
				constraints.gridheight = 6;
				add(dPane,constraints);
				
				constraints.gridx = 2;
				constraints.gridy = 0;
				constraints.gridwidth = 2;
				constraints.gridheight = 1;
				add(toolBar,constraints);
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
		
		private class AreaAction implements ActionListener
			{
			public void actionPerformed(ActionEvent e)
				{	glassSheet.setWidth(Double.parseDouble(fWidth.getText()));
					glassSheet.setHeight(Double.parseDouble(fHeight.getText()));
					glassSheet.setPrice(Double.parseDouble(fPrice.getText()));
					glassSheet.setArea(Double.parseDouble(fArea.getText()));
					glassSheet.setPriceV(glassSheet.countValuationPrice());
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
					
						tempGlassThick=(GlassTypeTable.getGTable(cGlassType.getSelectedIndex()).getThickness());
						String[] StringTGlassThick= new String[tempGlassThick.length];
						for (int i = 0; i < tempGlassThick.length; i++ )
						{
							StringTGlassThick[i] = String.valueOf(tempGlassThick[i]);
						}
						
						DefaultComboBoxModel model = new DefaultComboBoxModel(StringTGlassThick);
						cThickness.setModel(model);
						tempGlassPrice=(GlassTypeTable.getGTable(cGlassType.getSelectedIndex()).geGTPrice());
						fPrice.setText(String.valueOf((tempGlassPrice[0])));
				
					
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
