import java.net.Socket;

public class PortFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i= 5500; i < 6000; i++) {
			try {
				Socket s = new Socket("127.0.0.1", i);
				System.out.println("port trouvé :  " + i);
				s.close();
			}catch(Exception e) {
				System.out.println("port non trouvé "+i);
			}
		}
		
		
	}

}
