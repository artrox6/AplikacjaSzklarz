import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * Controller class that includes all listeners connected to TextFields,ComboBoxes and buttons.
 */
public class ValuationControler {
	ValuationControler()
	{
		ValuationFrameMobile frame = new ValuationFrameMobile();
		frame.setTitle("ValuationFrameMobilet");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	class FieldAction implements ActionListener
		{
		 public void actionPerformed(ActionEvent event)
	      {
			 
			 Object eventSource = event.getSource();
	        
	        if (eventSource==frame.getfWidth());
	        {
	        	System.out.println("dziala");
	        }
	      }
		}
	}
}
