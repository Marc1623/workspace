import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class ClientConnect {

		
		
		public static void main(String[] args) {

			Socket clientSocket;
			InetAddress serverAddress;
	        String serverName = "192.168.43.169";
	        
			try {
				serverAddress = InetAddress.getByName(serverName);
				System.out.println("Get the address of the server : "+ serverAddress);

				//Ask the server to create a new socket
				clientSocket = new Socket(serverAddress,45000);

				System.out.println("We got the connexion to  "+ serverAddress);
				System.out.println("now dying....");
				
				//writing
				PrintWriter pw = new PrintWriter( clientSocket.getOutputStream());
				
				//send information
				pw.println("HELLO FDP");
				
				pw.flush();
				
				//reading
				BufferedReader buffin = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				String in = buffin.readLine();
				
				pw.close();
				buffin.close();
				clientSocket.close();

			}catch (UnknownHostException e) {

				e.printStackTrace();

			}catch (IOException e) {

				e.printStackTrace();
			}
		}

	}