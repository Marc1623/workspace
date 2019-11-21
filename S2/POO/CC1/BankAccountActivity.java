package CC1;

public class BankAccountActivity {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client client1 = new Client ("liam","weber","03.12.1998");
		Client client2 = new Client ("Jason","weber","03.12.1998");
		
		CompteCourant compte1 = new CompteCourant(client1, 1000);
		CompteCourant compte2 = new CompteCourant(client2, 5000);
		
		compte1.transfert(500, compte2);
	}
 
}
