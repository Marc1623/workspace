import java.awt.*;
import javax.swing.*;

public class MaFrame extends JFrame{
	
	// création de texte
	private JLabel label1 = new JLabel ("Hello");
	private JLabel label2 = new JLabel ("world");
	
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
		setLayout(new GridLayout(4,2));
		
		
		
		add(bouton1);
		add(bouton2);
		add(bouton3);
		add(bouton4);
		add(bouton5);
		add(bouton6);
		add(bouton7);
		add(bouton8);
		
		
		pack();
	}
	

}
