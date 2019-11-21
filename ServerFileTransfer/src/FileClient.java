import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class FileClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		try {
			Socket sock = new Socket("192.168.43.66", 5555);
			
			byte[] mybytearray = new byte [6000000];
			InputStream is = sock.getInputStream();
			
			//write a file on the disk
			FileOutputStream fos = new FileOutputStream("C:\\temp\\received.txt");
			
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int bytesRead = is.read(mybytearray);
			int current = bytesRead;
			
			do {
				
				bytesRead = is.read(mybytearray, current, (mybytearray.length-current));
				if (bytesRead >=0)
					current += bytesRead;
				
			}while (bytesRead > -1);
			
			bos.write(mybytearray, 0, current);
			bos.flush();
			bos.close();
			sock.close();
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
