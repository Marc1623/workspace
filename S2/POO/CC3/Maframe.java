package CC3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Maframe extends JFrame {

	private JButton buttonFrame = new JButton("Open a new Frame");
	private JButton buttonDialog = new JButton("Open a new Dialog");
	
	private JPanel panelCentre = new JPanel();
	private JPanel panelWest = new JPanel();
	private JPanel panelEast = new JPanel();
	
	
	
	String color[]={"Blue","Red","Yellow","Pink","Cyan","Gray"};        
    JComboBox cb = new JComboBox(color); 
    
    
	
	public Maframe (){
		
		this.setTitle("MainFrame");
		this.setSize(400, 400);
		
		panelCentre.add(buttonFrame);
		add(panelCentre, BorderLayout.CENTER);
		
		panelEast.add(buttonDialog);
		add(panelEast,BorderLayout.EAST);
		
		panelWest.add(cb);
		add(panelWest,BorderLayout.WEST);
		
		
		Ecouteur ecouteur = new Ecouteur();
		buttonFrame.addActionListener(ecouteur);
		
		
		
		       
		   
	}
	
	class Ecouteur implements ActionListener {
		public void actionPerformed (ActionEvent e ){
			if(e.getSource()==buttonFrame){
				JFrame frame = new JFrame();
				JTextField field = new JTextField("I'm a JFrame");
			}
				
			else 
				dispose();
		}
}
