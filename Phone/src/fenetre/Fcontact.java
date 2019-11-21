package fenetre;

import java.awt.*;

import javax.swing.*;

public class Fcontact extends JFrame{

// private static String filename = "data/contact.data";
	
private JPanel panelButton = new JPanel();
private JPanel panelNom = new JPanel();
private JPanel panelPrenom = new JPanel();
private JPanel panelNumero = new JPanel();
private JPanel panelmail = new JPanel();
private JPanel panelCodePostal = new JPanel();
private JPanel panelContact = new JPanel();
private JPanel panelMenu = new JPanel();

private JButton buttonOk = new JButton("ok");
private JButton buttonChangeDiscard = new JButton ("Discard Changes");

private JLabel nom = new JLabel ("Nom");
private JLabel prenom = new JLabel ("Prénom");
private JLabel phonenumber = new JLabel ("Numéro Téléphone");
private JLabel mailadresse = new JLabel ("Adresse mail");
private JLabel codePostal = new JLabel ("Code postal / Ville");

private JTextField nomField = new JTextField (20);
private JTextField prenomField = new JTextField (20);
private JTextField phonenumberField = new JTextField (20);
private JTextField mailadresseFiel = new JTextField (20);
private JTextField codePostalField = new JTextField (20);



	public Fcontact() {
		
		this.setSize(480,800);
		this.setTitle("NewContact");
		
		
		
		add(panelMenu);
		panelMenu.setBackground(Color.YELLOW);
		
		add(panelNom);
		panelNom.add(nom);
		panelNom.add(nomField);
		
		add(panelPrenom);
		panelPrenom.add(prenom);
		panelPrenom.add(prenomField);
		
		add(panelNumero);
		panelNumero.add(phonenumber);
		panelNumero.add(phonenumberField);
		
		add(panelmail);
		panelmail.add(mailadresse);
		panelmail.add(mailadresseFiel);
		
		add(panelCodePostal);
		panelCodePostal.add(codePostal);
		panelCodePostal.add(codePostalField);
		
		add(panelButton);
		
		panelButton.add(buttonOk);
		panelButton.add(buttonChangeDiscard);
		
		/*add(panelContact);
		panelContact.add(filename);*/
		
	}
}
