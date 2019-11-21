import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;


public class MaFrame extends JFrame {
	
	public MaFrame {
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	addWindowListener(new EcouteurWindow());
	addMouseListener(new EcouteurMouse());
	addKeyListener(new EcouteurKey());
	}

}
