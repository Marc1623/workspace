import java.util.*;
public class TP5_03_ex4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		
		int etoile,i;
		//Exercice A
		System.out.println("a)");
		//On commence avec 0 étoile, on augmente le nombre d'étoile à chaque tour
		for(etoile=0; etoile<11;++etoile) {
			//On incérmente l'affichage par rapport aux nombre d'éoiles
			for(i=0;i<etoile;++i) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Exercice B
		System.out.println("b)");
		//On débute avec 10 étoile et on décrémente un par un
		for(etoile=10; etoile>0;etoile--) {
			//On affiche le nombre d'étoile demandé et on décrémente
			for(i=etoile;i>0;i--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("c)");
		//Start avec 10 étoiles et décremente jusqu'à 0
		for(etoile=10; etoile>0;etoile--) {
			//Affiche les blanc en premier
			for(i=10;i>etoile;i--) {
				System.out.print(" ");
			}
			//Affiche le nombre d'étoile
			for(i=etoile;i>0;i--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("d)");
		//Start avec 10 étoiles et décremente jusqu'à 0
		for(etoile=0; etoile<11;++etoile) {
			
			//Affiche les blanc
			for(i=10;i>etoile;i--) {
				System.out.print(" ");
			}
			//Affiche le nombre d'étoile
			for(i=0;i<etoile;++i) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
