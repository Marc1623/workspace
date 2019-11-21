import java.io.IOException;
import java.net.*;

public class ServeurSide {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket myListeningSocket;
		Socket servSocket = null;
		String interfaceName = "wlan2";
		int port = 5556;
		
		
		try {
			System.out.println("Starting Listening");
			myListeningSocket = new ServerSocket(port);
			
			servSocket = myListeningSocket.accept();
			
			System.out.println("one CLient is connected" + servSocket.getRemoteSocketAddress());
			
			servSocket.close();
			myListeningSocket.close();
			
			System.out.println("Closing Socket");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
