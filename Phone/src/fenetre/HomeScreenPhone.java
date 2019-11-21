package fenetre;

import java.awt.*;


import javax.swing.*;


public class HomeScreenPhone extends JFrame {
	
	private JPanel panelBackgroundButton = new JPanel ();
	private JPanel panelHaut = new JPanel ();
	private JPanel panelImage = new JPanel();
	
	private JButton buttonCentral = new JButton ("Menu");
	
	private JLabel lab = new JLabel(new ImageIcon("C:/Users/marcv/workspace/Phone/liamphoto.jpg"));
	
	public HomeScreenPhone(){
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.setSize(480,800);
		this.setTitle("Home Screen Phone");
		
		add(panelBackgroundButton,BorderLayout.SOUTH);
		panelBackgroundButton.add(buttonCentral);
		panelBackgroundButton.setBackground(Color.BLACK);
		
		add(panelHaut);
		
		panelHaut.setBackground(Color.BLACK);
		
		add(panelImage);
		panelImage.add(lab);
		lab.setSize(HEIGHT, MAXIMIZED_HORIZ);
	}
	
	/*panel_south.add(buttonOk);
	panel_south.add(buttonClose);
	add(panel_south,BorderLayout.SOUTH);*/

	

}
