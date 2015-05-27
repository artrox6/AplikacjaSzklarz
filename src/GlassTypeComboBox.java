import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;


public class GlassTypeComboBox extends JComboBox implements ActionListener {
	JComboBox cGlassType = new JComboBox();
	private Double[] tempGlassPrice={};
	private Double[] tempGlassThick={};
	GlassTypeComboBox()
		{
			cGlassType = new JComboBox();
			for (int i = 0; i < GlassTypeTable.getGFTable().length; i++ )
			{
			cGlassType.addItem(GlassTypeTable.getGTable(i).getGName());
			}
			cGlassType.addActionListener(glassSelect);
		
			
		}
	
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
