import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Maframe extends JFrame{

	private JLabel selection = new JLabel("Selection:");
	private JLabel pasta = new JLabel("pasta");
	private JLabel burger = new JLabel("burger");
	private JLabel salad = new JLabel("salad");
	private JLabel fish = new JLabel("fish and chips");
	private JLabel drinks = new JLabel("drinks");
	
	
	private JLabel price = new JLabel("Price:");
	private JLabel pastap = new JLabel("10.0 CHF");
	private JLabel burgerp = new JLabel("12.0 CHF");
	private JLabel saladp = new JLabel("6.0 CHF");
	private JLabel fishp = new JLabel("12.0 CHF");
	private JLabel drinksp = new JLabel("2.0 CHF");
	
	private JLabel amount = new JLabel("Amount:");
	private JTextField un = new JTextField("");
	private JTextField deux = new JTextField("");
	private JTextField trois = new JTextField("");
	private JTextField quatre = new JTextField("");
	private JTextField cinq = new JTextField("");
	
	
	private JButton buy = new JButton("buy");
	
	public Maframe(){
		
		setTitle("Tickets");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null); 
        setBackground(Color.BLACK);
        
        
        add(selection);
        selection.setBounds(10, 10, 80, 20);
        
        add(pasta);
        pasta.setBounds(10, 40, 80, 20);
        
        add(burger);
        burger.setBounds(10, 70, 80, 20);
        
        add(salad);
        salad.setBounds(10, 100, 80, 20);
        
        add(fish);
        fish.setBounds(10, 130, 80, 20);
        
        add(drinks);
        drinks.setBounds(10, 160, 80, 20);
        
        add(price);
        price.setBounds(100, 10, 80, 20);
        
        add(pastap);
        pastap.setBounds(100, 40, 80, 20);
        
        add(burgerp);
        burgerp.setBounds(100, 70, 80, 20);
        
        add(fishp);
        fishp.setBounds(100, 100, 80, 20);
        
        add(saladp);
        saladp.setBounds(100, 130, 80, 20);
        
        add(drinksp);
        drinksp.setBounds(100, 160, 80, 20);
        
        add(buy);
        buy.setBounds(200, 200, 100, 100);
        
        add(amount);
        amount.setBounds(190, 10, 80, 20);
        
        add(un);
        un.setBounds(190, 40, 80, 20);
        
        add(deux);
        deux.setBounds(190, 70, 80, 20);
        
        add(trois);
        trois.setBounds(190, 100, 80, 20);
        
        add(quatre);
        quatre.setBounds(190, 130, 80, 20);
        
        add(cinq);
        cinq.setBounds(190, 160, 80, 20);
        
	}
}
