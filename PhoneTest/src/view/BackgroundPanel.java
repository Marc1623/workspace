package view;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridBagLayout;
 
import javax.swing.ImageIcon;
import javax.swing.JPanel;
 
public class BackgroundPanel extends JPanel {
 
    private static final long serialVersionUID = 1L;
    private ImageIcon background;
   
    public BackgroundPanel(String fileName) {
        super();
        this.setLayout(new GridBagLayout());
        this.background = new ImageIcon(fileName);
    }
 
    public void setBackground(ImageIcon background) {
        this.background = background;
    }
 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background.getImage(), 0, 0, this);
    }
}