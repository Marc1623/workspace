import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SampleFrame extends JFrame{
	
	private JTextField field = new JTextField(25);
	private JButton buttonOk = new JButton("ok");
	private JPanel panel_south = new JPanel();
	private JButton buttonClose = new JButton("Close");
	
	public SampleFrame(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Ecouteur ecouteur = new Ecouteur();
		
		buttonOk.addActionListener(ecouteur);
		buttonClose.addActionListener(ecouteur);
		
		add(field);
		panel_south.add(buttonOk);
		panel_south.add(buttonClose);
		add(panel_south,BorderLayout.SOUTH);
		
		pack();
	}
	
	class Ecouteur implements ActionListener {
		public void actionPerformed (ActionEvent e ){
			if(e.getSource()==buttonOk)
				System.out.println("hello "+ field.getText());
			else 
				dispose();
		}
	}
	/*
	class EcouteurClose implements ActionListener {
		public void actionPerformed (ActionEvent e){
			dispose();
		}
	}
	*/
}