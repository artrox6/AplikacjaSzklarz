import java.awt.EventQueue;

import javax.swing.JFrame;


public class Testww {

	   public static void main(String[] args)
	   {
	      EventQueue.invokeLater(new Runnable()
	         {
	            public void run()
	            {
	               JFrame frame = new ValuationFrameMobile();
	               frame.setTitle("ValuationFrameMobilet");
	               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	               frame.setVisible(true);
	            }
	         });
	   }

}
