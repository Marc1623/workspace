package exercice2_new;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener {

	public MyFrame myframe;
	
	private JButton buttonC = new JButton("C");
	private JButton buttonM10 = new JButton("-10");
	private JButton buttonM1 = new JButton("-1");
	private JButton buttonP1 = new JButton("+1");
	private JButton buttonP10 = new JButton("+10");
	private JButton buttonBuy = new JButton("Buy");
	
	private JLabel labelCompteur = new JLabel();
	
	int compteur;
	
	JPanel panelBoutton = new JPanel ();
	JPanel panelCompteur = new JPanel ();
	
	
	
	
	public MyFrame (){
		
        setTitle("Tickets");
        setSize(600, 185);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null); 
        
        
		
		//panelBoutton
		
		
		add(panelBoutton);
		panelBoutton.setLayout(null);
		panelBoutton.setBounds(0, 70, 600, 185);
		panelBoutton.setBackground(Color.YELLOW);
		
		
		panelBoutton.add(buttonC);
		buttonC.setBounds(20, 20, 70, 30);
		buttonC.addActionListener(this);
		
		panelBoutton.add(buttonM10);
		buttonM10.setBounds(100, 20, 70, 30);
		buttonM10.addActionListener(this);
		
		panelBoutton.add(buttonM1);
		buttonM1.setBounds(180, 20, 70, 30);
		buttonM1.addActionListener(this);
		
		panelBoutton.add(buttonP1);
		buttonP1.setBounds(260, 20, 70, 30);
		buttonP1.addActionListener(this);
		
		panelBoutton.add(buttonP10);
		buttonP10.setBounds(340, 20, 70, 30);
		buttonP10.addActionListener(this);
		
		panelBoutton.add(buttonBuy);
		buttonBuy.setBounds(420, 20, 70, 30);
		buttonBuy.addActionListener(this);
		
		
		
		
		//panelCompteur
		
		add(panelCompteur);
		panelCompteur.setLayout(null);
		panelCompteur.setBounds(0, 0, 600, 70);
		panelCompteur.setBackground(Color.RED);
		
		panelCompteur.add(labelCompteur);
		labelCompteur.setBounds(320, 25, 600, 30);
		labelCompteur.setText(compteur+"");
		// labelCompteur.setBackground(Color.CYAN);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		switch (((JButton) e.getSource()).getText()){
			case "C" :
				compteur = 0;
				labelCompteur.setText(compteur+"");
				break;
			case "-10" :
				if (compteur>=10){
                    compteur-=10;
                    labelCompteur.setText(compteur+""); }
                break;
			case "-1" :
				if (compteur >=1){
					compteur-=1;
					labelCompteur.setText(compteur+"");
				}
				break;
			  case "+1":
                  if (compteur<100){
                      compteur+=1;
                      labelCompteur.setText(compteur+"");
                  }
                  break;
              case "+10":
                  if (compteur<=90){
                      compteur+=10;
                      labelCompteur.setText(compteur+"");
                  }
                  break;
              case "Buy" :
            	  Object[] options = {"Yes", "No", "Cancel"};
            	  int x = JOptionPane.showOptionDialog(myframe,
                          "Do you want to buy "+compteur+" Ticket(s) ?", "Select an Option",
                          JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                          null, options, options[2]);

                  if (x==0){
                      compteur=0;
                      labelCompteur.setText(compteur+"");}
                      break;
                
			
		
		
		}
		
		
	}
	
	
}
