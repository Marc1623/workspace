import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Secondaire extends JDialog {
	
	private JTextField field = new JTextField();
	private JButton buttonOk = new JButton("save");
	private JLabel label = new JLabel();
	private SampleFrame sampleFrame;
	
	public Secondaire(SampleFrame sampleFrame){
		
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.sampleFrame = sampleFrame;
		
		buttonOk.addActionListener(new OtherButton());
		
		add(label);
		
		pack();
	}
	
	public class OtherButton implements ActionListener{
		public void actionPerformed (ActionEvent e){
			sampleFrame.setText(text)
			
		}
	}

}

