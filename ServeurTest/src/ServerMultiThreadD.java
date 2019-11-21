
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Enumeration;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ServerMultiThreadD {

    private static Logger myLogger;

    public static void main(String[] args) {
        try {
            myLogger = Logger.getLogger("testing");
            FileHandler fileHandler;

            fileHandler = new FileHandler("./my.log", true);
            myLogger.addHandler(fileHandler);

            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

            myLogger.log(Level.INFO, "this is an INFO message");
            myLogger.log(Level.WARNING, "this is a WARNING message");
            myLogger.log(Level.SEVERE, "this is a SEVERE message");

            myLogger.info("this is an JADE JE TAIME message");
            myLogger.warning("this is a WARNING message");
            myLogger.severe("this is a SEVERE message");

            myLogger.setLevel(Level.INFO);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Socket srvSocket = null;
        InetAddress localAddress = null;
        ServerSocket mySkServer;
        String interfaceName = "eth1";
        int ClientNo = 1;

        try {
            NetworkInterface ni = NetworkInterface.getByName(interfaceName);
            Enumeration<InetAddress> inetAddresses = ni.getInetAddresses();
            while (inetAddresses.hasMoreElements()) {
                InetAddress ia = inetAddresses.nextElement();

                if (!ia.isLinkLocalAddress()) {
                    if (!ia.isLoopbackAddress()) {
                        System.out.println(ni.getName() + "->IP: " + ia.getHostAddress());
                        localAddress = ia;
                    }
                }
            }

            //Warning : the backlog value (2nd parameter is handled by the implementation
            mySkServer = new ServerSocket(45007, 10, localAddress);
            System.out.println("Default Timeout :" + mySkServer.getSoTimeout());
            System.out.println("Used IpAddress :" + mySkServer.getInetAddress());
            System.out.println("Listening to Port :" + mySkServer.getLocalPort());

            //wait for a client connection
            while (true) {
                Socket clientSocket = mySkServer.accept();
                System.out.println("connection request received");
                Thread t = new Thread(new AcceptClientD(clientSocket, ClientNo));
                ClientNo++;
                //starting the thread
                t.start();
            }

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}