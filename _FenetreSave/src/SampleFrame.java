import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SampleFrame extends JFrame{
	private JLabel label = new JLabel();
	private JTextField field = new JTextField();
	private JButton buttonOk = new JButton("ok");
	private JPanel panel_south = new JPanel();
	
	private JLabel label1 = new JLabel ("Hello");
	
	public SampleFrame(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setTitle("Principal");
		
		Ecouteur ecouteur = new Ecouteur();
		
		buttonOk.addActionListener(ecouteur);
		
		panel_south.add(buttonOk);
		add(panel_south,BorderLayout.SOUTH);
		
		add(field,BorderLayout.CENTER);
		
		pack();
	}
	public void setText(String text){
		label.setText(text);
	}
	
	class Ecouteur implements ActionListener {
		public void actionPerformed (ActionEvent e ){
			
				Secondaire o = new Secondaire(SampleFrame.this);
			
				o.setVisible(true);
			
		}
	}
}
