
import javax.swing.JFrame;

import view.BackgroundPanel;
import view.MyButton;
 
public class Laucher {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        BackgroundPanel back = new BackgroundPanel("C:/Users/marcv/workspace/PhoneTest/photopaysage.jpg");
        MyButton test = new MyButton("Test background", "data/btn.png","data/btnh.png");
         
        window.setTitle("Home_Screen !");
        window.setSize(480, 800);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(back);
        window.setVisible(true);
 
        back.add(test);
    }
}