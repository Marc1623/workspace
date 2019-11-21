import java.util.*;

public class exerciceBanque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b1000;
		int b200;
		int b100;
		int b50;
		int b20;
		int b10;
		int somme;
		int reste;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inscrire le montant total");
		somme = scan.nextInt();
		
		System.out.print("le nombre de billet de 1000 est de : ");
		b1000 = somme/1000;
		System.out.print(b1000);
		
		reste= somme%1000;
		
		System.out.println("le nombre de billet de 200 est de : ");
		b200= reste/200;
		System.out.println(b200);
		
		reste = reste%200; 
		
		
		
		
		
	}

}
