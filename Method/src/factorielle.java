import java.util.*;
public class factorielle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.print("quelle factorielle voulez-vous?");
		int saisi = scan.nextInt();

		long resultat = factorielle(saisi);

		System.out.print(resultat);

	}

	
	
	
	
	
	public static long factorielle (int nombre ){

		long calcul=1;
		
		for (int i = 1 ; i<=nombre; i++){

			calcul = calcul*i;
		}
		
		
		return calcul;

		
	}

	

	
}
