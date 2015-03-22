import java.awt.EventQueue;

import javax.swing.JFrame;


public class Testww {

	   public static void main(String[] args)
	   {
	      EventQueue.invokeLater(new Runnable()
	         {
	            public void run()
	            {
	            	ValuationControler frame = new ValuationControler();
	             
	            }
	         });
	   }

}
