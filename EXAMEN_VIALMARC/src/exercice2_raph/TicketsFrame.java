package exercice2_raph;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicketsFrame extends JFrame {

    public JLabel jLabelCounter = new JLabel();
    public int compteur;

    public TicketsFrame ticketsFrame;

    private JPanel jPanelCounter = new JPanel();
    private JButton [] jButtons = new JButton[6];
    private String [] boutonName = {"C", "-10", "-1", "+1", "+10","Buy"};
    private ButtonListener buttonListener = new ButtonListener();

    public TicketsFrame (){
        this.ticketsFrame=this;
        setTitle("Tickets");
        setSize(600, 185);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);

        jPanelCounter.setLayout(null);
        jPanelCounter.setBounds(0,0, 600, 30);
        jPanelCounter.setBackground(Color.cyan);
        add(jPanelCounter);

        jLabelCounter.setText(compteur+"");
        jLabelCounter.setBounds(295,0, 30, 30);
        jPanelCounter.add(jLabelCounter);


        int x = 15;
        for (int i = 0; i<(jButtons.length-1); i++){
            jButtons[i] = new JButton(boutonName[i]);
            jButtons[i].setBounds(x, 40, 100, 50);
            jButtons[i].addActionListener(buttonListener);
            add(jButtons[i]);

            x+=115;
        }

        jButtons[5] = new JButton(boutonName[5]);
        jButtons[5].setBounds(0, 100, 600, 50);
        jButtons[5].addActionListener(buttonListener);
        add(jButtons[5]);
    }

    public class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            switch (((JButton) e.getSource()).getText()){
                case "C":
                    compteur=0;
                    jLabelCounter.setText(compteur+"");
                    break;
                case "-10":
                    if (compteur>=10){
                        compteur-=10;
                        jLabelCounter.setText(compteur+"");
                    }
                    break;
                case "-1":
                    if (compteur>=1){
                        compteur-=1;
                        jLabelCounter.setText(compteur+"");
                    }
                    break;
                case "+1":
                    if (compteur<100){
                        compteur+=1;
                        jLabelCounter.setText(compteur+"");
                    }
                    break;
                case "+10":
                    if (compteur<=90){
                        compteur+=10;
                        jLabelCounter.setText(compteur+"");
                    }
                    break;
                case "Buy":
                    Object[] options = {"Yes", "No", "Cancel"};
                    int x = JOptionPane.showOptionDialog(ticketsFrame,
                            "Do you want to buy "+compteur+" Ticket(s) ?", "Select an Option",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                            null, options, options[2]);

                    if (x==0){
                        compteur=0;
                        jLabelCounter.setText(compteur+"");
                    }
                    break;
            }
        }
    }
}
