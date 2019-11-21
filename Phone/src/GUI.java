package jPhone;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * 
 * @author Olivier GOTTET
 * @Version: 1.0
 * Created: 29.05.2015 - Last Update: 07.06.2015
 * GUI contains panels and elements and is the user interface (start screen)
 * 
 */

public class GUI extends JFrame{
	private static final long serialVersionUID = 1L;

	protected CardLayout cardLayout = new CardLayout();
	protected Contact contacts = new Contact(this);
	protected BlocNotes blocNote = new BlocNotes(this);
	protected Settings setup = new Settings(this);
	protected ExpertSettings expertSetup = new ExpertSettings(this);

	// Configuration starts here	
	String defFont = expertSetup.getSetting(4,2);
	int textFontSize = Integer.parseInt(expertSetup.getSetting(3,2));
	int textInputFontSize = Integer.parseInt(expertSetup.getSetting(2,2));
	int buttonFontSize = Integer.parseInt(expertSetup.getSetting(0,2));
	int listFontSize = Integer.parseInt(expertSetup.getSetting(1,2));
	String statusImageL = "/Images/sbLeft.png";
	String statusImageR = "/Images/sbRight.png";
	String backgroundImage = "/Images/background.jpg";
	String homeButtonImage = "/Images/" + expertSetup.getSetting(5,2).toLowerCase() + "/home.png";
	String rotateButtonImage = "/Images/" + expertSetup.getSetting(5,2).toLowerCase() + "/rotate.png";
	String contactButtonImage = "/Images/" + expertSetup.getSetting(5,2).toLowerCase() + "/contact.png";
	String notesButtonImage = "/Images/" + expertSetup.getSetting(5,2).toLowerCase() + "/note.png";
	String snakeButtonImage = "/Images/" + expertSetup.getSetting(5,2).toLowerCase() + "/snake.png";
	String settingsButtonImage = "/Images/" + expertSetup.getSetting(5,2).toLowerCase() + "/settings.png";
	// Configuration ends here

	protected JPanel content = new JPanel();
	protected JPanel statusBar = new JPanel(); // Contains the network + battery info, rotate + homebutton
	private JPanel menuPanel = new JPanel(); // Contains the (empty) startscreen including the dock
	private JLabel statusLeft = new JLabel(new ImageIcon(getClass().getResource(statusImageL)));
	private JLabel statusRight = new JLabel(new ImageIcon(getClass().getResource(statusImageR)));
	private JLabel backgroundPanel = new JLabel(new ImageIcon(getClass().getResource(backgroundImage))); // background image of the startscreen

	private JButton homeButton = new JButton(new ImageIcon(getClass().getResource(homeButtonImage)));
	private JButton contactButton = new JButton(new ImageIcon(getClass().getResource(contactButtonImage)));
	private JButton rotateButton = new JButton (new ImageIcon(getClass().getResource(rotateButtonImage)));
	private JButton noteButton = new JButton(new ImageIcon(getClass().getResource(notesButtonImage)));
	private JButton settingsButton = new JButton(new ImageIcon(getClass().getResource(settingsButtonImage)));
	//	private JButton snakeButton = new JButton(new ImageIcon(getClass().getResource(snakeButtonImage)));

	protected String[] listContent = {"Menu", "Contacts", "BlocNote", "settings", "Snake"};

	/**
	 * 
	 * Constructor called from the main method, adds the panels and buttons to the frame GUI
	 * @see Settings#readSettings()
	 * 
	 */

	public GUI(){
		super("jPhone");

		boolean isExpert = false;
		if("on".equals(expertSetup.getSetting(6,2))){
			isExpert = true;
		}

		// Formatting home + rotate buttons
		homeButton.setBorderPainted(false); 
		homeButton.setContentAreaFilled(false); 
		homeButton.setFocusPainted(false); 
		homeButton.setOpaque(false);
		rotateButton.setBorderPainted(false); 
		rotateButton.setContentAreaFilled(false); 
		rotateButton.setFocusPainted(false); 
		rotateButton.setOpaque(false);
		
		// Setting up start screen
		menuPanel.setLayout(null);
		menuPanel.add(contactButton);
		menuPanel.add(noteButton);
		//menuPanel.add(albumButton);
		menuPanel.add(settingsButton);
		menuPanel.add(backgroundPanel);
		menuPanel.setBackground(Color.BLACK);
		statusBar.add(statusLeft);
		statusBar.add(homeButton);
		statusBar.add(rotateButton);
		statusBar.add(statusRight);
		statusBar.setBackground(Color.BLACK);

		contacts.readContact(); // Read contacts
		blocNote.readingFile(); // Read file from the note

		// Adding the listeners
		homeButton.addActionListener(new menuListener(0));
		contactButton.addActionListener(new menuListener(1));
		noteButton.addActionListener(new menuListener(2));
		//albumButton.addActionListener(new menuListener(3));
		settingsButton.addActionListener(new menuListener(3));
		rotateButton.addActionListener(new RotateScreen());

		// Setting up the cardlayout
		content.setLayout(cardLayout);
		content.add(menuPanel, listContent[0]); // Adds the Menu
		content.add(contacts, listContent[1]); // Adds the contacts
		content.add(blocNote, listContent[2]); // Adds the bloc Notes
		//content.add(snake, listContent[3]); // Adds the snake 
		if (isExpert) {
			content.add(expertSetup, listContent[3]); // Adds the settings	
		} else {
			content.add(setup, listContent[3]); // Adds the settings	
		}

		// Arranging status bar + content to build the start screen
		this.addWindowListener(new WindowListener());
		this.getContentPane().add(statusBar,BorderLayout.NORTH);
		this.getContentPane().add(content, BorderLayout.CENTER);
		this.setSize(800, 480);
		this.setResizable(false); // User cannot resize the screen
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);				

		arrangeGUI();
	}

	/**
	 * 
	 * @Version: 1.0
	 * Created: 29.05.2015 - Last Update: 07.06.2015
	 * menuListener listens menu button actions and shows the called panel
	 * 
	 */

	class menuListener implements ActionListener{

		int i = 0; // Variable to represent the choosen menu item id

		public menuListener(int menuItem){
			i = menuItem;
		}

		public void actionPerformed(ActionEvent e) {
			cardLayout.show(content, listContent[i]);
		}

	}

	/**
	 * 
	 * WindowListener to listen events that are occuring on the screen
	 * 
	 */

	class WindowListener extends WindowAdapter{

		/**
		 * 
		 * Calling the following methods at closing of the windows: WriteData
		 * @see Settings#writeSettings()
		 * 
		 */

		public void windowClosing(WindowEvent e){
			blocNote.writingFile();
			contacts.writeContact();
		}

	}

	/**
	 * 
	 * Class to rotate the jPhone screen
	 *
	 */

	class RotateScreen implements ActionListener{

		/**
		 * 
		 * Called method when clicked on the rotate button
		 * 
		 */

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			arrangeGUI();

		}
	}

	/**
	 * 
	 * Method used to replace all GUI elements on the new screen size
	 * 
	 */

	public void arrangeGUI (){
		Dimension dim = new Dimension (800, 480);
		Dimension dimNew = new Dimension(480, 800);
		// Detects if the screen has already been rotated, it's rotating screen back to it's initial resolution
		if(getSize().equals(dimNew) || contacts.getSize().equals(dimNew)|| blocNote.getSize().equals(dimNew) || 
		   setup.getSize().equals(dimNew) || expertSetup.getSize().equals(dimNew)){
			setSize(dim);

			// Contact app
			contacts.setLayout(null);
			contacts.topPanel.setBounds(0, 0, 320, 400);
			contacts.bottomPanel.setBounds(320, 0, 480, 400);
			//contacts.dim = new Dimension(400, 20); // width of form in horizontal view
			contacts.setStyles();

			// Bloc Note app
			blocNote.setLayout(null);
			blocNote.homePagePanel.setBounds(0,0, 400, 400);
			blocNote.contentPanel.setBounds(400, 0, 400, 400);
			blocNote.emptyPanel.setBounds(400, 10,400, 400);
			blocNote.newPanel.setBounds(400, 10, 400, 400);
			blocNote.oldPanel.setBounds(400, 10, 400, 400);
			blocNote.newText.setPreferredSize(new Dimension(390,200));
			blocNote.oldText.setPreferredSize(new Dimension(390,200));
			
			// Album app
			//	album.setLayout(null);
			//	album.albumPanel.setBounds(0, 0, 300, 300);
			
			
			// Settings app
			setup.setLayout(null);
			setup.editSettingsP.setLayout(new GridLayout(0,1));
			setup.editSettingsP.setBounds(0, 0, 800, 470);
			setup.setStyles();
			expertSetup.setLayout(null);
			expertSetup.rightPanel.setBounds(300, 0, 600, 500);
			expertSetup.leftPanel.setBounds(0, 0, 300, 600);
			expertSetup.dim = new Dimension(400, 20); // width of form in horizontal view
			expertSetup.setStyles();

			// GUI - Start screen
			backgroundPanel.setBounds(0, 0, 800, 400);
			contactButton.setBounds(50, 20, 50, 50);
			noteButton.setBounds(50, 120, 50, 50);
			//albumButton.setBounds(50, 220, 50, 50);
			settingsButton.setBounds(50, 220, 50, 50);

			// Flip view back
		}else{
			setSize(dimNew);

			// Contact app
			contacts.setLayout(null);
			contacts.topPanel.setBounds(0, 0, 475, 200);
			contacts.bottomPanel.setBounds(0, 200, 475, 505);
			contacts.setStyles();

			// Bloc Note app
			blocNote.setLayout(null);
			blocNote.homePagePanel.setBounds(0,0, 470, 300);
			blocNote.contentPanel.setBounds(0, 300, 470, 500);
			blocNote.emptyPanel.setBounds(10, 300,470, 500);
			blocNote.newPanel.setBounds(10, 300, 470, 500);
			blocNote.oldPanel.setBounds(10, 300, 470, 500);
			blocNote.newText.setPreferredSize(new Dimension(460,200));
			blocNote.oldText.setPreferredSize(new Dimension(460,200));
			
			// Album app
			//album.setLayout(null);
			//album.albumPanel.setBounds(0, 0, 300, 300);
			
			// Settings app
			setup.setLayout(null);
			setup.editSettingsP.setBounds(0, 0, 470, 800);
			setup.setStyles();
			expertSetup.setLayout(null);
			expertSetup.leftPanel.setBounds(0, 0, 470, 200);
			expertSetup.rightPanel.setBounds(0, 200, 470, 600);
			expertSetup.dim = new Dimension(400, 30); // width of form in vertical view
			expertSetup.setStyles();

			// GUI - Start screen
			backgroundPanel.setBounds(0, 0, 480, 720);
			contactButton.setBounds(45, 650, 50, 50);
			noteButton.setBounds(155, 650, 50, 50);
			//albumButton.setBounds(265, 650, 50, 50);
			settingsButton.setBounds(265, 650, 50, 50);
		}
	}
}