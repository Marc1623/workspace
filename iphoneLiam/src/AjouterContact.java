

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AjouterContact extends JFrame {

    private JButton bAjouter = new JButton("Ajouter");
    private JButton bAnnuler = new JButton("Annuler");

    private JLabel nom = new JLabel("Nom");
    private JLabel prenom = new JLabel("Prénom");
    private JLabel phonenumber = new JLabel("Numéro");
    private JLabel mailadresse = new JLabel("Email");
    private JLabel codePostal = new JLabel("CP / Ville");

    private JTextField nomField = new JTextField(20);
    private JTextField prenomField = new JTextField(20);
    private JTextField phonenumberField = new JTextField(20);
    private JTextField mailadresseField = new JTextField(20);
    private JTextField codePostalField = new JTextField(20);

    public AjouterContact() {

        this.setSize(480, 800);
        this.setTitle("NewContact");
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        Font font = new Font("Monospaced", Font.BOLD, 18);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(null);

        nom.setFont(font);
        add(nom);
        nomField.setFont(font);
        add(nomField);

        prenom.setFont(font);
        add(prenom);
        prenomField.setFont(font);
        add(prenomField);

        phonenumber.setFont(font);
        add(phonenumber);
        phonenumberField.setFont(font);
        add(phonenumberField);

        mailadresse.setFont(font);
        add(mailadresse);
        mailadresseField.setFont(font);
        add(mailadresseField);

        codePostal.setFont(font);
        add(codePostal);
        codePostalField.setFont(font);
        add(codePostalField);

        bAjouter.setFont(font);
        add(bAjouter);
        bAjouter.addActionListener(new Ajouter_Click());
        bAnnuler.setFont(font);
        add(bAnnuler);
        bAnnuler.addActionListener(new Annuler_Click());

        Insets insets = getInsets();
        Dimension size = nom.getPreferredSize();
        nom.setBounds(25 + insets.left, 15 + insets.top, size.width, size.height);

        size = nomField.getPreferredSize();
        nomField.setBounds(150 + insets.left, 15 + insets.top, size.width, size.height);

        size = prenom.getPreferredSize();
        prenom.setBounds(25 + insets.left, 60 + insets.top, size.width, size.height);

        size = prenomField.getPreferredSize();
        prenomField.setBounds(150 + insets.left, 60 + insets.top, size.width, size.height);

        size = phonenumber.getPreferredSize();
        phonenumber.setBounds(25 + insets.left, 105 + insets.top, size.width, size.height);

        size = phonenumberField.getPreferredSize();
        phonenumberField.setBounds(150 + insets.left, 105 + insets.top, size.width, size.height);

        size = mailadresse.getPreferredSize();
        mailadresse.setBounds(25 + insets.left, 150 + insets.top, size.width, size.height);

        size = mailadresseField.getPreferredSize();
        mailadresseField.setBounds(150 + insets.left, 150 + insets.top, size.width, size.height);

        size = codePostal.getPreferredSize();
        codePostal.setBounds(25 + insets.left, 195 + insets.top, size.width, size.height);

        size = codePostalField.getPreferredSize();
        codePostalField.setBounds(150 + insets.left, 195 + insets.top, size.width, size.height);

        size = bAjouter.getPreferredSize();
        bAjouter.setBounds(125 + insets.left, 650 + insets.top, size.width, size.height);

        size = bAnnuler.getPreferredSize();
        bAnnuler.setBounds(225 + insets.left, 650 + insets.top, size.width, size.height);

    }

    class Ajouter_Click implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class Annuler_Click implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
