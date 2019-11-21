import java.util.*;
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		int numColonne=0;
		
		do{
		System.out.println("Quelle colonne voulez-vous traiter ?");
		System.out.println("3 pour la consommation électrique");
		System.out.println("4 pour la consommation d'essence");
		numColonne = scan.nextInt() ;
		}while(numColonne != 3 && numColonne != 4 );

	}

}
