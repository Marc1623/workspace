package CC3Raph;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private String [] color = {"Blue", "Red", "Yellow", "Pink", "Cyan", "Gray", "Black", "Green"};
    private JList jList = new JList(color);
    private JButton jButtonFrame = new JButton("Open a new Frame");
    private JButton jButtonDialog = new JButton("Open a new Dialog");

    public MainFrame (){
        setTitle("MainFrame");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);

        jList.setBounds(10,10, 60, 150);
        add(jList);

        jButtonFrame.setBounds(85, 60, 140, 50);
        jButtonFrame.addActionListener(new ButtonListener());
        add(jButtonFrame);

        jButtonDialog.setBounds(245, 60, 140, 50);
        jButtonDialog.addActionListener(new ButtonListener());
        add(jButtonDialog);
    }

    public class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedColor = "";
            if (jList.getSelectedValue()!=null)
                selectedColor = jList.getSelectedValue().toString();
            JLabel jLabel = new JLabel();
            switch (selectedColor){
                case "Blue":
                    jLabel.setForeground(Color.blue);
                    break;
                case "Red":
                    jLabel.setForeground(Color.red);
                    break;
                case "Yellow":
                    jLabel.setForeground(Color.yellow);
                    break;
                case "Pink":
                    jLabel.setForeground(Color.pink);
                    break;
                case "Cyan":
                    jLabel.setForeground(Color.cyan);
                    break;
                case "Gray":
                    jLabel.setForeground(Color.gray);
                    break;
                case "Green":
                    jLabel.setForeground(Color.green);
                    break;
                case "Black":
                default:
                    jLabel.setForeground(Color.black);
            }

            if (((JButton) e.getSource()).getText().equals("Open a new Frame")){
                JFrame jFrame = new JFrame("jFrame");
                jLabel.setText("I'am a JFrame !");
                jFrame.add(jLabel);
                jFrame.pack();
                jFrame.setVisible(true);
                jFrame.setLocationRelativeTo(null);
            }
            else {
                JDialog jDialog = new JDialog();
                jLabel.setText("I'am a JDialog !");
                jDialog.setTitle("JDialog");
                jDialog.add(jLabel);
                jDialog.pack();
                jDialog.setVisible(true);
                jDialog.setLocationRelativeTo(null);
            }

        }
    }
}
