
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * MaFrame.java
 * @author Alexandre Schweizer
 * 18 juin 2019
 *
 */
public class MaFrame extends JFrame{
	
	private JPanel sud = new JPanel() ;
	private JPanel milieu = new JPanel() ;
	private JPanel haut = new JPanel() ;
	private int isEnabled=0 ;
	private int btnMisClicked=0 ;
	
	private JButton offOn = new JButton("OFF") ;
	private JButton btnM = new JButton("M") ;
	private JTextField champText = new JTextField("") ;
	private JSlider slider = new JSlider() ;
	
	private JButton image = new JButton() ;
	private JButton image2 = new JButton() ;
	
	
	public MaFrame() {
		
		super("Ugly BoomBox") ;
		setSize(400, 250) ;
		setLocation(400, 300) ;
		
		btnM.setBackground(Color.WHITE) ;
		
		
		//désactive le bouton fermer
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				offOn.addActionListener(new btnOffOn());
				btnM.addActionListener(new btnM());
				
				
				champText.setPreferredSize(new Dimension(100, 24)) ;
				
				
				//Choix de l'image pour remplacer le boutton
				image.setIcon(new ImageIcon("C:\\Users\\al_sc\\POO\\RevisionsModule\\src\\Module18GUI\\speaker.jpg")) ;
				image2.setIcon(new ImageIcon("C:\\Users\\al_sc\\POO\\RevisionsModule\\src\\Module18GUI\\speaker.jpg")) ;
				//Affiche que le boutton est sélectionné
				image.setFocusPainted(false) ;
				image2.setFocusPainted(false) ;
				//Désactive la bordure du boutton pour ne voir que l'image
				image.setBorderPainted(false) ;
				image2.setBorderPainted(false) ;
				image.setOpaque(false) ;
				image2.setOpaque(false) ;
				image.setContentAreaFilled(false) ;
				image2.setContentAreaFilled(false) ;
				
				
				//Définition du slider
				slider.setMaximum(105) ;
				slider.setMinimum(88) ;
				slider.setValue(88) ;
				slider.setPaintTicks(true) ;
				slider.setPaintLabels(true) ;
				slider.setEnabled(false) ;
				slider.setMinorTickSpacing(10) ;
				slider.setMajorTickSpacing(20) ;
				slider.addChangeListener(new ChangeListener() {
				      public void stateChanged(ChangeEvent event) {
				        champText.setText("" + ((JSlider)event.getSource()).getValue()) ;
				      }
				    }) ; 
				
				
				/* On ajoute un gridbagLauout au panel */
				milieu.setLayout(new GridBagLayout()) ;
				/* Le gridBagConstraints va définir la position et la taille des éléments */
				GridBagConstraints gc = new GridBagConstraints() ;
				gc.fill = GridBagConstraints.BOTH ;
				// insets définir la marge entre les composant new Insets(margeSupérieure, margeGauche, margeInférieur, margeDroite)
				gc.insets = new Insets(0, 0, 0, 0) ;
				
				//Défini les case en x et y
				gc.weightx = 3 ;
				gc.weighty = 2  ;
				int compteur=0 ;
				for (int j = 0; j < 3; j++) 
				{
					for (int i = 0; i < 2; i++) 
					{
						gc.gridy = j ;
						gc.gridx = i ;
						
						JButton btn = new JButton("88") ;
						compteur++ ;
						btn.addActionListener(new btnFrequence(btn)) ;
						milieu.add(btn, gc) ;
						
					}
				}
				haut.add(offOn) ;
				haut.add(champText) ;
				haut.add(btnM) ;
				haut.add(slider) ;
				
				add(haut, BorderLayout.NORTH) ;
				add(milieu,BorderLayout.CENTER) ;
				add(image2,BorderLayout.EAST) ;
				add(image,BorderLayout.WEST) ;
				add(sud,BorderLayout.SOUTH) ;//Add au panel de base
				
			
			}
			
			public void changeTxtBtn(JButton aChanger,String txt)
			{
				aChanger.setText(txt) ;
			}
			
			class btnOffOn implements ActionListener
			{
				
				public void actionPerformed(ActionEvent e) {
					if (isEnabled == 0 ) {
						champText.setText("88") ;
						offOn.setText("ON") ;
						slider.setEnabled(true) ;
						btnM.setEnabled(true) ;
						isEnabled = 1 ;
					}
					else
					{
						champText.setText("") ;
						offOn.setText("OFF") ;
						slider.setEnabled(false) ;
						btnM.setEnabled(false) ;
						isEnabled=0 ;
					}
					

				}
				
			}
			
			class btnM implements ActionListener
			{
				public void actionPerformed(ActionEvent e) {

					if (btnMisClicked == 0) {
						btnM.setBackground(Color.BLACK);
						btnMisClicked = 1 ;
					}
					else 
					{	btnM.setBackground(Color.WHITE);
						btnMisClicked = 0 ;
					}
				
				}
				
			}
			
			class btnFrequence implements ActionListener
			{
				JButton leBtn ;
				public btnFrequence(JButton leBtn) {
					this.leBtn = leBtn ;
				}
				public void actionPerformed(ActionEvent e) {
					if (isEnabled == 1 && btnMisClicked == 1) 
					{
						leBtn.setText(champText.getText()) ;
						btnM.setBackground(Color.WHITE) ;
						btnMisClicked=0 ;
					}
					else if(isEnabled == 1)
					{				
						champText.setText(leBtn.getText()) ;
						slider.setValue(Integer.parseInt(leBtn.getText())) ;
						
					}
				}
				
			}
			


			
		}



