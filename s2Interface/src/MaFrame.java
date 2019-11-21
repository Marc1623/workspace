import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;

public class MaFrame extends JFrame {
	
	//création de textes
	
	private JLabel label = new JLabel("Hello World !");
	private JLabel label2 = new JLabel("Bonjour le monde !");
	private JLabel label3 = new JLabel("Liam me chie dans les bottes.");
	private JLabel label4 = new JLabel("Top 1 ou rien");
	private JLabel label5 = new JLabel("Fofo c'est du passé");
	
	//création panels
	
	private JPanel panel = new JPanel();
	private JPanel panel_buttons = new JPanel();
	
	//boutons
	
	private JButton button_ok = new JButton("OK");
	private JButton button_cancel = new JButton("Cancel");
	
	//boîte de vérification
	
	private JCheckBox check = new JCheckBox();
	
	//textes à écrire dans une case
	
	private JTextField field = new JTextField(20);
	private String a[] = {"First", "Second", "Third"};
	private JComboBox box = new JComboBox(a);
	
	//slider
	
	private JSlider slider = new JSlider();

	public MaFrame() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//nom de la case
		setTitle("Exemple");
		
		label2.setOpaque(true);
		label2.setBackground(Color.PINK);
		
		//ajout des éléments dans les panels
		
		panel.add(label);
		panel.add(label2);
		panel.add(check);
		panel.add(field);
		panel.add(box);
		panel.add(slider);
		panel_buttons.add(button_ok);
		panel_buttons.add(button_cancel);
		
		//ajout des panels dans l'interface
		
		add(panel);
		add(panel_buttons, BorderLayout.SOUTH);
		add(label3, BorderLayout.WEST);
		add(label4, BorderLayout.EAST);
		add(label5, BorderLayout.NORTH);
		
	}
}