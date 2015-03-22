import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Handler implements ActionListener {
	ValuationFrameMobile frame = new ValuationFrameMobile();
	FloatValuation evaluation = new FloatValuation();
public void actionPerformed(ActionEvent e) {
	evaluation.setHeight(Double.parseDouble(frame.getfWidth().getText()));
  }
}