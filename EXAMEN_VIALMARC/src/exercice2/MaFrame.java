package exercice2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class MaFrame extends JFrame {

	private JButton buttonC = new JButton("C");
	private JButton buttonM10 = new JButton("-10");
	private JButton buttonM1 = new JButton("-1");
	private JButton buttonP1 = new JButton("+1");
	private JButton buttonP10 = new JButton("+10");
	private JButton buttonBuy = new JButton("Buy");
	
	private JLabel jlabel = new JLabel();
	
	 private boolean clicOperateur = false, update = false;
	
	private String operateur = "";
	private double chiffre1;
	
	private JLabel ecran = new JLabel();
	
	public MaFrame (){
        setTitle("Tickets");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        
        
       buttonC.setBounds(10, 50, 60, 50);
        buttonC.addActionListener(new ButtonListener());
       add(buttonC);
        
       buttonM10.setBounds(70, 50, 60, 50);
        buttonM10.addActionListener(new ButtonListener());
       add(buttonM10);
         
       buttonM1.setBounds(130, 50, 60, 50);
        buttonM1.addActionListener(new ButtonListener());
       add(buttonM1);
          
       buttonP1.setBounds(190, 50, 60, 50);
        buttonP1.addActionListener(new ButtonListener());
       add(buttonP1);
           
       buttonP10.setBounds(250, 50, 60, 50);
        buttonP10.addActionListener(new ButtonListener());
       add(buttonP10);
        
       buttonBuy.setBounds(10, 100, 300, 50);
       buttonP10.addActionListener(new ButtonListener());
       add(buttonBuy);
       
       
	}
	
	 public class ButtonListener implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	           
	 
	 if (((JButton) e.getSource()).getText().equals("-10")){
         JFrame jFrame = new JFrame("-10");
         jlabel.setText("-10");
         jFrame.add(jlabel);
         jFrame.pack();
         jFrame.setVisible(true);
         jFrame.setLocationRelativeTo(null);
     }
      
     if(((JButton) e.getSource()).getText().equals("-1")){
         JFrame jFrame = new JFrame("-1");
         jlabel.setText("-1");
         jFrame.add(jlabel);
         jFrame.pack();
         jFrame.setVisible(true);
         jFrame.setLocationRelativeTo(null);
     }
     
         if(((JButton) e.getSource()).getText().equals("+1")){
             JFrame jFrame = new JFrame("+1");
             jlabel.setText("+1");
             jFrame.add(jlabel);
             jFrame.pack();
             jFrame.setVisible(true);
             jFrame.setLocationRelativeTo(null);
     }
         
         if(((JButton) e.getSource()).getText().equals("+10")){
             JFrame jFrame = new JFrame("+10");
             jlabel.setText("+10");
             jFrame.add(jlabel);
             jFrame.pack();
             jFrame.setVisible(true);
             jFrame.setLocationRelativeTo(null);
     }
  }	 
	        
	 //Listener affecté au bouton de remise à zéro
	  class ResetListener implements ActionListener {
	    public void actionPerformed(ActionEvent arg0){
	      clicOperateur = false;
	      update = true;
	      chiffre1 = 0;
	      operateur = "";
	      ecran.setText("");
	    }
	  }   
	 
}
  
	

