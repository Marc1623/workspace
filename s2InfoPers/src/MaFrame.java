import java.awt.*;
import javax.swing.*;

public class MaFrame extends JFrame{
	
	// création de texte
	private JLabel label1 = new JLabel ("Nom");
	private JLabel label2 = new JLabel ("prenom");
	private JLabel label3 = new JLabel ("marié");
	private JLabel label4 = new JLabel ("ville");
	
	// création de panel
	private JPanel panel = new JPanel();
	private JPanel panel_buttons = new JPanel();
	
	//boutons
	
	private JButton button_ok = new JButton("OK");
	private JButton button_cancel = new JButton("Cancel");
	
	//bouton
	private JButton bouton1 = new JButton("1");
	private JButton bouton2 = new JButton("2");
	private JButton bouton3 = new JButton("3");
	private JButton bouton4 = new JButton("4");
	private JButton bouton5 = new JButton("5");
	private JButton bouton6 = new JButton("6");
	private JButton bouton7 = new JButton("7");
	private JButton bouton8 = new JButton("8");
	
	public MaFrame(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		/* changer le layout */
		setLayout(new FlowLayout());
		setLayout(new GridLayout(5,2));
		
		panel.add(label1);
		add(bouton1);
		
		panel.add(label2);
		add(bouton2);
		
		panel.add(label3);
		add(bouton3);
		
		panel.add(label4);
		add(bouton4);
		
		add(button_ok);
		add(button_cancel);
		
		
		pack();
	}
	

}
