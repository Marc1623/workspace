package distributedProgramming;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class ExploreNetworkInterfaceDemo {

    public static void main(String[] args) throws UnknownHostException{
    	
    	Enumeration<NetworkInterface> allni;
    	
        try{
/*
            //list of all interfaces
            

            System.out.println("------>All interfaces");

            //get all the interfaces of your machine
            allni = NetworkInterface.getNetworkInterfaces();
            while(allni.hasMoreElements()){
                NetworkInterface nix = allni.nextElement();

                //get the interfaces names
                System.out.println("interface name : "+ nix.getName());
            }

            System.out.println("----->Up interfaces");
   */

            //get all the interfaces of your machine
            allni = NetworkInterface.getNetworkInterfaces();
            while(allni.hasMoreElements()){
                NetworkInterface nix = allni.nextElement();

                //get the interfaces names if connected
                if(nix.isUp()){
                    System.out.println("interface name : "+ nix.getName());
                    
                    Enumeration<InetAddress> InterfaceAddresses = nix.getInetAddresses();
                    
                    while(InterfaceAddresses.hasMoreElements()) {
                    	InetAddress ia = InterfaceAddresses.nextElement();
                    	System.out.println("IP  : "+ ia.getHostAddress());
                    }
                }
            }
            
            InetAddress ServerAddress;
            String AddressName = "www.facebook.com";
            ServerAddress = InetAddress.getByName(AddressName);
            System.out.println("The IP address of : " +ServerAddress);
            
        }catch (SocketException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    
}
