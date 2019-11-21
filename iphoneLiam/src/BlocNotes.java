import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
/**
 * 
 * @author Vincent
 * Class BlocNotes which allows you to create, edit and delete notes
 *
 */

public class BlocNotes extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private static String fileName = "data/note.data";

	private GUI gui;
	static ColorScheme cs = new ColorScheme();
	
	////JButtons/////////////////////////////////////////
	protected JButton newNote = new JButton("New note");
	private JButton back = new JButton("Back");
	private JButton back2 = new JButton("Back");
	private JButton save = new JButton("Save");
	private JButton saveNew = new JButton("Save");
	private JButton cancel = new JButton("Cancel");
	protected JButton delete = new JButton("Delete");
	protected JButton edit = new JButton("Edit");
	private JButton addContact = new JButton("Add contact informations");
	protected JButton returnComment = new JButton("Return Comment");

	////Style////////////////////////////////////////////
	
	static ExpertSettings s = new ExpertSettings(null);
	String defFont = s.getSetting(4,2);
	static int defFontSizeButton = Integer.parseInt(s.getSetting(0,2));
	static int defFontSizeList = Integer.parseInt(s.getSetting(1,2));
	static int defFontSizeTF = Integer.parseInt(s.getSetting(2,2));
	static int defFontSize = Integer.parseInt(s.getSetting(3,2));
	static Border emptyBorder = BorderFactory.createEmptyBorder();
	static Color fg = cs.c2(); // Default foreground color
	static Color fg2 = cs.c1(); // Warning foreground color
	static Color bg = cs.c1(); // Default background color
	static Color bg2 = cs.c2(); // Warning background color
	
	////JTextField and Area////////////////////////////////////////////
	
	protected JTextField oldTitle = new JTextField("Write your title here");
	protected JTextField newTitle = new JTextField("Write your title here");
	protected JTextArea oldText = new JTextArea();
	protected JTextArea newText = new JTextArea();
	
	////JPanels////////////////////////////////////////////

	protected JPanel contentPanel = new JPanel();
	protected JPanel homePagePanel = new JPanel();
	protected JPanel newPanel = new JPanel();
	protected JPanel oldPanel = new JPanel();
	protected JPanel emptyPanel = new JPanel();

	////Other////////////////////////////////////////////
	
	protected static JList noteList = new JList();
	protected static BlocNotesSerialized[] noteData;
	protected CardLayout cardLayout = new CardLayout();
	
	////String arrays////////////////////////////////////////////
	
	protected String[] listContent = {"Empty","New","Old"};
	protected String[] titleList;
	protected String[] chain;
	protected String[] splitedNote = new String[1];

	/**
	 * Constructor
	 * @param gui object that allows you to do things with other classes
	 */
	public BlocNotes(GUI gui){		
		Border emptyBorder = BorderFactory.createEmptyBorder();

		this.gui = gui;

		StartingPanel startingPanel = new StartingPanel();
		NewNotePanel newNotePanel = new NewNotePanel();
		OldNotePanel oldNotePanel = new OldNotePanel();
		ContentPanel ContentPanel = new ContentPanel();
		
		setStyle();

		this.add(homePagePanel);
		this.add(contentPanel);
	}
	
	/**
	 * Setting styles for the components
	 */
	
	private void setStyle(){
		
		//Formatting Panels
		homePagePanel.setBackground(cs.c1());
		newPanel.setBackground(cs.c1());
		oldPanel.setBackground(cs.c1());
		emptyPanel.setBackground(cs.c1());
		
		//Formatting List
		noteList.setBackground(cs.c2());
		noteList.setForeground(cs.c1());
		noteList.setFont(new Font(defFont, Font.BOLD, defFontSizeList));
		
		//Formatting TextFields
		newTitle.setPreferredSize(new Dimension (250,30));
		newTitle.setFont(new Font(defFont, Font.PLAIN, defFontSizeTF));
		oldTitle.setPreferredSize(new Dimension(250,30));
		oldTitle.setFont(new Font(defFont, Font.PLAIN, defFontSizeTF));
		
		//Formatting TextArea
		newText.setFont(new Font(defFont, Font.PLAIN, defFontSizeTF));
		newText.setLineWrap(true);
		oldText.setFont(new Font(defFont, Font.PLAIN, defFontSizeTF));
		oldText.setLineWrap(true);
		
		//Formatting Buttons
		newNote.setFont(new Font(defFont, Font.PLAIN, defFontSizeButton));
		newNote.setBackground(cs.c1());
		newNote.setForeground(cs.c5());

		back.setFont(new Font(defFont, Font.PLAIN, defFontSizeButton));
		back.setBackground(cs.c1());
		back.setForeground(cs.c5());
		
		back2.setFont(new Font(defFont, Font.PLAIN, defFontSizeButton));
		back2.setBackground(cs.c1());
		back2.setForeground(cs.c5());
		
		save.setFont(new Font(defFont, Font.PLAIN, defFontSizeButton));
		save.setBackground(cs.c1());
		save.setForeground(cs.c5());
		
		saveNew.setFont(new Font(defFont, Font.PLAIN, defFontSizeButton));
		saveNew.setBackground(cs.c1());
		saveNew.setForeground(cs.c5());
		
		cancel.setFont(new Font(defFont, Font.PLAIN, defFontSizeButton));
		cancel.setBackground(cs.c1());
		cancel.setForeground(cs.c5());
		
		delete.setFont(new Font(defFont, Font.PLAIN, defFontSizeButton));
		delete.setBackground(cs.c1());
		delete.setForeground(cs.c5());
		
		edit.setFont(new Font(defFont, Font.PLAIN, defFontSizeButton));
		edit.setBackground(cs.c1());
		edit.setForeground(cs.c5());
		
		addContact.setFont(new Font(defFont, Font.PLAIN, defFontSizeButton));
		addContact.setBackground(cs.c1());
		addContact.setForeground(cs.c5());
		
		returnComment.setFont(new Font(defFont, Font.PLAIN, defFontSizeButton));
		returnComment.setBackground(cs.c1());
		returnComment.setForeground(cs.c5());
	}
	
	
	/**
	 * Show and hide specific JButtons in different cases
	 */
	
	private void showDefaultButtons(){
		newNote.setVisible(false);
		noteList.setEnabled(false);
		edit.setVisible(false);
		delete.setVisible(false);
		back.setVisible(false);
		returnComment.setVisible(false);
		
		saveNew.setVisible(true);
		cancel.setVisible(true);
		addContact.setVisible(true);
	}

	private void showNewButtons(){
		saveNew.setVisible(false);
		cancel.setVisible(false);
		addContact.setVisible(false);
		returnComment.setVisible(false);
		
		edit.setVisible(true);
		delete.setVisible(true);
		back.setVisible(true);
		newNote.setVisible(true);
		noteList.setEnabled(true);
	}


	/**
	 * Read the file in order to create an array from data contained in the file
	 */
	public void readingFile(){
		try{
			int buffLength = 0;
			BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
			while ((buff.readLine())!= null ){
				buffLength++;
			}
			chain = new String[buffLength];
			buff.close();
		}catch (Exception e){
			System.out.println("Reading error");
			System.out.println(e.toString());
		}

		try{
			String line;
			String enterLine;
			int num = 0;
			
			BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

			while ((line = buff.readLine())!= null ){
				if(line.contains("#Enter")){
					enterLine = line;
					enterLine = enterLine.replaceAll("#Enter", "\r\n");
					chain[num] = enterLine;
				}
				else{
					chain[num] = line ;
				}
				num++;
			}
			buff.close(); 
			updateList();
		}		
		catch (Exception e){
			System.out.println("Reading error");
			System.out.println(e.toString());
		}
	}
	
	/**
	 * Write the content of the array in the file
	 */
	
	public void writingFile(){
		String text = "";
		try {
			PrintWriter outputFile = new PrintWriter(new BufferedWriter (new FileWriter (fileName, false)));
			for (int i = 0; i<chain.length; i++){
				if(chain[i]!= null){
					if(!chain[i].contains("#delete")){
						if(chain[i].contains("\n")){
							text = chain[i];
							text = text.replaceAll("[\r\n]+"," #Enter ");
							chain[i] = text;
						}
						outputFile.println(chain[i]); 	
					}
				}
			}
			outputFile.close();
		}catch (Exception e){
			System.out.println("Writing error");
			System.out.println(e.toString());
		}
	}
	
	/**
	 * Updates the JList
	 */

	protected void updateList(){
		titleList = new String[chain.length];
		noteData = new BlocNotesSerialized[chain.length];
		for(int i = 0; i<chain.length; i++){
			if(chain[i]!=null){
				if(!chain[i].contains("#delete")){
					splitedNote = chain[i].split(" - ", 2);
					noteData[i] = new BlocNotesSerialized(splitedNote[0], splitedNote[1]);
					titleList[i] = splitedNote[0];
				}
			}
		}
		noteList.setListData(titleList);
	}

	private void addInChain(){
		String temp[] = new String[chain.length+1];
		for(int i = 0; i<chain.length;i++){
			temp[i] = chain[i];
		}

		temp[chain.length] = newTitle.getText() + " - " + newText.getText();
		chain = new String[temp.length];
		chain = temp;

		updateList();
	}

	private void EditChain(String title, String text, int num) {
		for(int i = 0; i<chain.length; i++){
			if(chain[i] != null ){
				if(i==num){
					chain[i] = title + " - " + text ;
				}
			}
		}
		updateList();
	}

	class NewAction implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			cardLayout.show(contentPanel, listContent[1]);
			showDefaultButtons();
		}			
	}

	class SaveAction implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(newTitle.getText().length()==0){
				newTitle.setBackground(cs.c3());
			}else{
				addInChain();
				newTitle.setText(null);
				newText.setText(null);
				noteList.setEnabled(true);
				newNote.setVisible(true);
				cardLayout.show(contentPanel, listContent[0]);
				showNewButtons();
			}
		}	
	}

	class EditAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			oldTitle.setEditable(true);
			oldText.setEditable(true);
			showDefaultButtons();
		}
	}

	class EditSaveAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			try{
				if(e.getSource().equals(cancel)){
					oldTitle.setText(noteData[noteList.getSelectedIndex()].getTitle());
					oldText.setText(noteData[noteList.getSelectedIndex()].getText());
				}else{
					EditChain(oldTitle.getText(),oldText.getText(),noteList.getSelectedIndex());
				}
				oldTitle.setEditable(false);
				oldText.setEditable(false);
				showNewButtons();
			}catch(Exception ex){
				System.out.println("Edit error");
				System.out.println(ex.toString());
			}
		}
	}

	class DeleteAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			EditChain("#delete", "#delete", noteList.getSelectedIndex());
			newNote.setVisible(true);
			cardLayout.show(contentPanel, listContent[0]);
		}
	}

	class CancelAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			showNewButtons();
			newTitle.setText(null);
			newText.setText(null);
			cardLayout.show(contentPanel, listContent[0]);
		}
	}

	class ListListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			oldTitle.setText(noteData[noteList.getSelectedIndex()].getTitle());
			oldText.setText(noteData[noteList.getSelectedIndex()].getText());
			cardLayout.show(contentPanel, listContent[2]);
		}
	}
	
	class ContactListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			setVisible(false);
			gui.cardLayout.show(gui.content, gui.listContent[1]);
			gui.contacts.addButton.setVisible(false);
			gui.contacts.editButton.setVisible(false);
			gui.contacts.deleteButton.setVisible(false);
			gui.contacts.returnContact.setVisible(true);
		}
	}
	
	class ReturnComment implements ActionListener{
		public void actionPerformed(ActionEvent e){	
			try {
				if(!(noteList.getSelectedIndex() == -1)){
					String temp = noteData[noteList.getSelectedIndex()].getTitle();
					setVisible(false);
					gui.cardLayout.show(gui.content, gui.listContent[1]);
					gui.contacts.commentTF.setText(temp);

					showDefaultButtons();
					noteList.setSelectedIndex(-1);
					noteList.clearSelection();
				} 
					gui.contacts.setVisible(true);
					gui.blocNote.setVisible(false);
					showDefaultButtons();
			} catch (Exception f){
				System.out.println("Error returning comment");
				System.out.println(f.toString());
			}
		}
	}


	class ContentPanel{
		public ContentPanel(){
			contentPanel.setLayout(cardLayout);
			contentPanel.add(emptyPanel, listContent[0]);
			contentPanel.add(newPanel, listContent[1]);
			contentPanel.add(oldPanel, listContent[2]);
		}
	}

	class StartingPanel{
		public StartingPanel(){
			Border emptyBorder = BorderFactory.createEmptyBorder();
			JScrollPane scrollPane = new JScrollPane(noteList);
			JPanel ButtonPanel = new JPanel(new FlowLayout());
			scrollPane.setBorder(emptyBorder);
			scrollPane.setBackground(cs.c2());
			ButtonPanel.setBackground(cs.c2());
			ButtonPanel.add(newNote);
			ButtonPanel.add(addContact);
			ButtonPanel.add(returnComment);

			noteList.addMouseListener(new ListListener());
			addContact.addActionListener(new ContactListener());
			newNote.addActionListener(new NewAction());
			returnComment.addActionListener(new ReturnComment());

			homePagePanel.setLayout(new BorderLayout());
			homePagePanel.add(scrollPane);
			homePagePanel.add(ButtonPanel, BorderLayout.SOUTH);
			
			addContact.setVisible(false);
			returnComment.setVisible(false);
		}
	}

	class NewNotePanel{
		public NewNotePanel(){
			save.addActionListener(new SaveAction());
			back2.addActionListener(new CancelAction());
			newPanel.add(newTitle, BorderLayout.NORTH);
			newPanel.add(newText, BorderLayout.NORTH);
			newPanel.add(save, BorderLayout.NORTH);
			newPanel.add(back2, BorderLayout.NORTH);
		}
	}

	class OldNotePanel{
		public OldNotePanel(){
			oldTitle.setEditable(false);
			oldText.setEditable(false);
			saveNew.setVisible(false);
			cancel.setVisible(false);

			back.addActionListener(new CancelAction());
			edit.addActionListener(new EditAction());
			saveNew.addActionListener(new EditSaveAction());
			delete.addActionListener(new DeleteAction());
			cancel.addActionListener(new EditSaveAction());

			oldPanel.add(oldTitle, BorderLayout.NORTH);
			oldPanel.add(oldText, BorderLayout.CENTER);
			oldPanel.add(edit);
			oldPanel.add(delete);
			oldPanel.add(back);
			oldPanel.add(saveNew);
			oldPanel.add(cancel);
			
			oldPanel.setBackground(cs.c2());
		}
	}
}