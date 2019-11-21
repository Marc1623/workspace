import javax.swing.*;


public class OtherFrame extends JFrame {
	
	private JLabel label = new JLabel();
	
	public OtherFrame(String text){
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		label.setText(text);
		
		add(label);
		
		pack();
	}
	
	public void setText(String text){
		label.setText(text);
	}

}
