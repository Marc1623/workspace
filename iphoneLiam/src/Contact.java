

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Contact extends JPanel {


    /**
     *
     * File where the contact data is stored on
     *
     */

    private static String fichierContact = "C:\\Users\\liamw\\IdeaProjects\\Phone\\src\\Data\\contact.txt";

    /**
     *
     * Class used to validate input data
     *
     */

    ///////////////////////////////////////////////////////////////////////////////////////////////
    ////////// Configuration starts here //////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////

    static				String		addButtonName			= "Add new contact";
    static				String		addComment				= "Add comment";
    static				String		returnButtonName		= "Return contact";
    static				String		modButtonName			= "Modify contact";
    static				String		saveButtonName			= "Save contact";
    static				String		updModButtonName		= "Update modified contact";
    static				String		cancelButtonName		= "Cancel";
    static				String		delButtonName			= "Delete contact";
    static				String		nameLabelName			= "Name";
    static				String		firstnameLabelName		= "Firstname";
    static				String		phoneLabelName			= "Phonenumber";
    static				String		emailLabelName			= "Email";
    static				String		addressLabelName		= "Address";
    static				String		zipcityLabelName		= "ZIP / City";
    static				String		commentLabelName		= "Comment";
    static				String		errorMessageCancel		= "Error cancelling the contact!";
    static				String		errorMessageMod			= "An error occured during the modification of the contact. Please correct your input!";
    static				String		errorMessageWrite		= "Error writing to contact file!";
    static				String		errorMessageUpdL		= "Error updating contactlist!";
    static				String		errorMessageReadF		= "Error reading file!";
    static				String		hashtagDeleted			= "#deletedValue";

    ///////////////////////////////////////////////////////////////////////////////////////////////
    ////////// Configuration ends here ////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////

    ContactValidator				ContactValidator		= new ContactValidator();
    private 			GUI			gui;

    // Dimension for textfields and labels
    protected			Dimension	dim						= new Dimension(400, 30);

    // Panels
    protected			JPanel		topPanel				= new JPanel(); // Stores the two top panels
    protected			JPanel		leftPanel				= new JPanel(); // Scroll Pane
    protected			JPanel		rightPanel				= new JPanel(); // Right Panel with buttons + form
    protected			JPanel		rightTopPanel			= new JPanel(); // Buttons
    protected static	JPanel		rightBottomPanel		= new JPanel(); // Form
    protected			JPanel		bottomPanel				= new JPanel(); // Stores the three bottom panels

    // Lists
    @SuppressWarnings("rawtypes")
    protected static	JList		ContactLF				= new JList(); // Contact List Field content

    // Buttons
    protected static	JButton		addButton				= new JButton(addButtonName);
    protected static	JButton		editButton				= new JButton(modButtonName);
    private static		JButton		saveButton				= new JButton(saveButtonName);
    private static		JButton		updContactButton		= new JButton(updModButtonName);
    protected static	JButton		deleteButton			= new JButton(delButtonName);
    private static		JButton		cancelButton			= new JButton(cancelButtonName);
    protected static	JButton		commentButton			= new JButton(addComment);
    protected static 	JButton		returnContact 			= new JButton(returnButtonName);

    // TextFields
    private static JTextField
            nameTF					= new JTextField(),
            firstnameTF				= new JTextField(),
            phoneTF					= new JTextField(),
            emailTF					= new JTextField(),
            addressTF				= new JTextField(),
            zipCityTF				= new JTextField();
    protected JTextField			commentTF				= new JTextField();

    // Labels
    private JLabel					nameLabel				= new JLabel(nameLabelName),
            firstnameLabel			= new JLabel(firstnameLabelName),
            phoneLabel				= new JLabel(phoneLabelName),
            emailLabel				= new JLabel(emailLabelName),
            addressLabel			= new JLabel(addressLabelName),
            zipCityLabel			= new JLabel(zipcityLabelName),
            commentLabel			= new JLabel(commentLabelName);

    private static		String[]	ContactList;
    private static		String[]	ContactDataStreamArray;

    // Array from read file
    protected static ContactManager[] ContactData;

    public Contact(GUI gui) {
        this.gui = this.gui;

        JScrollPane scrollPane = new JScrollPane(ContactLF);
        Border emptyBorder = BorderFactory.createEmptyBorder();
        scrollPane.setBorder(emptyBorder);
        leftPanel.setBorder(emptyBorder);
        ContactLF.setBorder(emptyBorder);

        // Setting up the panels used in the GUI
        topPanel.setLayout(new BorderLayout());
        bottomPanel.setLayout(new BorderLayout());

        // Top Panel
        topPanel.add(scrollPane,BorderLayout.CENTER);

        // Bottom Panel
        bottomPanel.add(rightTopPanel,BorderLayout.NORTH);
        bottomPanel.add(rightBottomPanel,BorderLayout.CENTER);

        // Adding the buttons
        rightTopPanel.add(addButton);
        rightTopPanel.add(returnContact);
        rightTopPanel.add(editButton);
        rightTopPanel.add(saveButton);
        rightTopPanel.add(cancelButton);
        rightTopPanel.add(updContactButton);
        rightTopPanel.add(deleteButton);
        rightTopPanel.add(commentButton);

        ContactLF.addListSelectionListener(new LSListener());

        rightBottomPanel.setLayout(new GridLayout(15, 1, 2, 2));
        rightBottomPanel.add(nameLabel);
        rightBottomPanel.add(nameTF);
        rightBottomPanel.add(firstnameLabel);
        rightBottomPanel.add(firstnameTF);
        rightBottomPanel.add(phoneLabel);
        rightBottomPanel.add(phoneTF);
        rightBottomPanel.add(emailLabel);
        rightBottomPanel.add(emailTF);
        rightBottomPanel.add(addressLabel);
        rightBottomPanel.add(addressTF);
        rightBottomPanel.add(zipCityLabel);
        rightBottomPanel.add(zipCityTF);
        rightBottomPanel.add(commentLabel);
        rightBottomPanel.add(commentTF);
        rightBottomPanel.add(commentButton);

        // Adding both panels
        add(topPanel,BorderLayout.NORTH); // Contact list
        add(bottomPanel,BorderLayout.SOUTH); // Contact data

        // Hiding rightBottomPanel (form)
        rightBottomPanel.setVisible(false);

        // Hiding the buttons
        returnContact.setVisible(false);
        editButton.setVisible(false);
        saveButton.setVisible(false);
        cancelButton.setVisible(false);
        updContactButton.setVisible(false);
        deleteButton.setVisible(false);
        commentButton.setVisible(false);

    }
    public void setEditable(boolean val){
        nameTF.setEditable(val);
        firstnameTF.setEditable(val);
        phoneTF.setEditable(val);
        emailTF.setEditable(val);
        addressTF.setEditable(val);
        zipCityTF.setEditable(val);
        commentTF.setEditable(val);
    }
    public static void showDefaultButtons(){
        addButton.setVisible(true);
        editButton.setVisible(false);
        deleteButton.setVisible(false);
        updContactButton.setVisible(false);
        saveButton.setVisible(false);
        cancelButton.setVisible(false);
        ContactLF.setEnabled(true);
        commentButton.setVisible(false);
    }
    public void setFieldsToNULL(){
        nameTF.setText(null);
        firstnameTF.setText(null);
        phoneTF.setText(null);
        emailTF.setText(null);
        addressTF.setText(null);
        zipCityTF.setText(null);
        commentTF.setText(null);
    }

    public void readContact() {
        String ligne;
        try {
            int buffLength = 0;
            BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream(fichierContact)));
            while ((buff.readLine()) != null) {
                buffLength++;
            }
            ContactDataStreamArray = new String[buffLength];
            buff.close();
        } catch (Exception e) {
            System.out.println(errorMessageReadF);
            System.out.println(e.toString());
        }

        try {
            int buffLength = 0;
            BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream(fichierContact)));
            while ((ligne = buff.readLine()) != null) {
                ContactDataStreamArray[buffLength] = ligne;
                buffLength++;
            }
            buff.close();
            updateList();
            ContactLF.setEnabled(true);
        } catch (Exception e) {
            System.out.println(errorMessageReadF);
            System.out.println(e.toString());
        }
    }
    public void writeContact(){
        try {
            try {
                PrintWriter pw = new PrintWriter(fichierContact);
                for (int i = 0; i<ContactDataStreamArray.length; i++){
                    if(ContactDataStreamArray[i]!= null){
                        if(!ContactDataStreamArray[i].contains("#delete")){
                            pw.println(ContactDataStreamArray[i]);
                        }
                    }
                }
                pw.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }catch (Exception e){
            System.out.println(errorMessageWrite);
            System.out.println(e.toString());
        }
    }
    class ReturnContact implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try {
                if(!(ContactLF.getSelectedIndex() == -1)){
                    String temp =
                            ContactData[ContactLF.getSelectedIndex()].getName() +
                                    ContactData[ContactLF.getSelectedIndex()].getFirstname() + "\nEmail : " +
                                    ContactData[ContactLF.getSelectedIndex()].getEmail() + "\nPhone number : " +
                                    ContactData[ContactLF.getSelectedIndex()].getPhone() + "\nZip and City : " +
                                    ContactData[ContactLF.getSelectedIndex()].getZipcity() + "\nComment : " +
                                    ContactData[ContactLF.getSelectedIndex()].getComment();
                    String temp2 =
                            ContactData[ContactLF.getSelectedIndex()].getName() + " " +
                                    ContactData[ContactLF.getSelectedIndex()].getFirstname();
                    setVisible(false);
                    gui.cardLayout.show(gui.content, gui.listContent[2]);
                    showDefaultButtons();
                    ContactLF.setSelectedIndex(-1);
                    ContactLF.clearSelection();
                    rightBottomPanel.setVisible(false);
                }
                gui.contact.setVisible(false);
                showDefaultButtons();
            } catch (Exception f){
                System.out.println("Error returning informations");
                System.out.println(f.toString());
            }
        }
    }
    class LSListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent evt){
            int i = ContactLF.getSelectedIndex();
            rightBottomPanel.setVisible(true); // Show contact form
            setEditable(false);
            editButton.setVisible(true);
            deleteButton.setVisible(true);
            commentButton.setVisible(true);
            if(i != -1){
                nameTF.setText(ContactData[i].getName());
                firstnameTF.setText(ContactData[i].getFirstname());
                phoneTF.setText(ContactData[i].getPhone());
                emailTF.setText(ContactData[i].getEmail());
                addressTF.setText(ContactData[i].getAddress());
                zipCityTF.setText(ContactData[i].getZipcity());
                commentTF.setText(ContactData[i].getComment());
            }
        }

    }
    public static void updateList(){
        ContactList = new String[ContactDataStreamArray.length];
        ContactData = new ContactManager[ContactDataStreamArray.length];

        String[] tempArray = new String[7];
        try {
            for (int i = 0; i<ContactDataStreamArray.length; i++){
                if(ContactDataStreamArray[i]!= null){
                    // Separating values to 6 values - used separator is - with a leading and ending space
                    tempArray = ContactDataStreamArray[i].split(" - ", 7);
                    // Creating ContactData array contaning the object ContactData with it's informations
                    ContactData[i] = new ContactManager(tempArray[0], tempArray[1], tempArray[2], tempArray[3], tempArray[4], tempArray[5], tempArray[6]);
                    // Generating ContactList content
                    ContactList[i] = tempArray[0] + " " + tempArray[1];
                    if(ContactDataStreamArray[i].contains(hashtagDeleted)){
                        ContactList[i] = null;
                    }
                }
            }
            ContactLF.setListData(ContactList);
            rightBottomPanel.setVisible(false);
        }catch (Exception e){
            System.out.println(errorMessageUpdL);
            System.out.println(e.toString());
        }
    }
    public void addToStream(){
        String temp [] = new String[ContactDataStreamArray.length + 1];

        // Creating temporary array and adding existing contact data
        for(int i=0; i < ContactDataStreamArray.length; i++){
            temp[i] = ContactDataStreamArray[i];

        }
        // Appending the new contact to the last position of the temp array
        temp[ContactDataStreamArray.length] = firstnameTF.getText() + " - "
                + nameTF.getText() + " - " + emailTF.getText() + " - " + phoneTF.getText()
                + " - " + addressTF.getText() + " - " + zipCityTF.getText() + " - "
                + commentTF.getText();

        // Redefining ContactDataStreamArray and putting temp data
        ContactDataStreamArray = new String [temp.length];
        ContactDataStreamArray = temp;

        writeContact();
        updateList();
        showDefaultButtons();
    }
    public void streamMod(String name, String firstname, String email, String phone, String address, String zipcity, String comment, int JListContact) {
        for(int i = 0; i<ContactDataStreamArray.length; i++){
            if(ContactDataStreamArray[i] != null){
                if(i == JListContact){
                    ContactDataStreamArray[i] = firstname + " - " + name + " - " + email + " - " + phone + " - " + address + " - " + zipcity + " - " + comment;
                }
            }
        }
        updateList();
        writeContact();
        ContactLF.setEnabled(true);
        showDefaultButtons();
    }
}

