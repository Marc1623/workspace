
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;

public class GUI extends JFrame {
    protected Contact contact = new Contact(this);
    protected CardLayout cardLayout = new CardLayout();

    protected JPanel content = new JPanel();
    private JPanel menuPanel = new JPanel();
    protected JPanel statusBar = new JPanel();
    protected JPanel homeBar = new JPanel();

    String backgroundImage = "/Images/background.jpg";
    private JLabel backgroundPanel = new JLabel(new ImageIcon(getClass().getResource(backgroundImage)));

    String contactButtonImage = "/Images/user.png";
    private JButton contactButton = new JButton(new ImageIcon(getClass().getResource(contactButtonImage)));

    String noteButtonImage = "/Images/contract.png";
    private JButton noteButton = new JButton(new ImageIcon(getClass().getResource(noteButtonImage)));

    String meteoButtonImage = "/Images/cloud.png";
    private JButton meteoButton = new JButton(new ImageIcon(getClass().getResource(meteoButtonImage)));

    String calculatorButtonImage = "/Images/calculator.png";
    private JButton calculatorButton = new JButton(new ImageIcon(getClass().getResource(calculatorButtonImage)));

    String homeButtonImage = "/Images/house.png";
    private JButton homeButton = new JButton(new ImageIcon(getClass().getResource(homeButtonImage)));

    private JLabel statusRight = new JLabel();

    protected String[] listContent = {"Menu", "Contacts", "BlocNote", "settings", "Snake"};


    public GUI() {

        menuPanel.setLayout(null);
        menuPanel.add(contactButton);
        menuPanel.add(noteButton);
        menuPanel.add(meteoButton);
        menuPanel.add(calculatorButton);
        menuPanel.add(backgroundPanel);
        menuPanel.setBackground(Color.BLACK);

        statusBar.add(statusRight);
        statusBar.setBackground(Color.YELLOW);

        homeBar.add(homeButton);
        homeBar.setBackground(Color.YELLOW);

        contact.readContact();

        contactButton.addActionListener(new menuListener(1));
        noteButton.addActionListener(new menuListener(2));

        content.setLayout(cardLayout);
        content.add(menuPanel, listContent[0]); // Adds the Menu
        content.add(contact, listContent[1]); // Adds the contacts


        //Arranging status bar + content to build the start screen
        this.addWindowListener(new WindowListener());
        this.getContentPane().add(statusBar,BorderLayout.NORTH);
        this.getContentPane().add(content, BorderLayout.CENTER);
        this.getContentPane().add(homeBar, BorderLayout.SOUTH);
        this.setSize(480, 800);
        this.setResizable(false); // User cannot resize the screen
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        arrangeGUI();

    }

    class menuListener implements ActionListener {

        int i = 0; // Variable to represent the choosen menu item id

        public menuListener(int menuItem){
            i = menuItem;
        }

        public void actionPerformed(ActionEvent e) {
            cardLayout.show(content, listContent[i]);
        }
    }
    class WindowListener extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        contact.writeContact();
    }
  }
    public void arrangeGUI () {

        // Contact app
        contact.setLayout(null);
        contact.topPanel.setBounds(0, 0, 320, 400);
        contact.bottomPanel.setBounds(320, 0, 480, 400);

        contactButton.setBounds(15, 550, 150, 150);
        contactButton.setFocusPainted(false);
        contactButton.setBorderPainted(false);
        contactButton.setContentAreaFilled(false);

        noteButton.setBounds(115, 550, 150, 150);
        noteButton.setFocusPainted(false);
        noteButton.setBorderPainted(false);
        noteButton.setContentAreaFilled(false);

        meteoButton.setBounds(215, 550, 150, 150);
        meteoButton.setFocusPainted(false);
        meteoButton.setBorderPainted(false);
        meteoButton.setContentAreaFilled(false);

        calculatorButton.setBounds(315, 550, 150, 150);
        calculatorButton.setFocusPainted(false);
        calculatorButton.setBorderPainted(false);
        calculatorButton.setContentAreaFilled(false);

        homeButton.setBounds(165, 625, 150, 150);
        homeButton.setFocusPainted(false);
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
    }

}
