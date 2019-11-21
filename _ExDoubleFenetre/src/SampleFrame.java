import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SampleFrame extends JFrame{
	
	private JTextField field = new JTextField();
	private JButton buttonOk = new JButton("ok");
	private JPanel panel_south = new JPanel();
	
	private JLabel label1 = new JLabel ("Hello");
	
	public SampleFrame(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setTitle("DoubleFenêtre");
		
		Ecouteur ecouteur = new Ecouteur();
		
		buttonOk.addActionListener(ecouteur);
		
		panel_south.add(buttonOk);
		add(panel_south,BorderLayout.SOUTH);
		
		add(field,BorderLayout.CENTER);
		
		pack();
	}
	
	class Ecouteur implements ActionListener {
		public void actionPerformed (ActionEvent e ){
			
				OtherFrame o = new OtherFrame(field.getText());
			
				o.setVisible(true);
			
		}
	}
}

