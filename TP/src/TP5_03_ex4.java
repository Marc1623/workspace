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
		//On commence avec 0 �toile, on augmente le nombre d'�toile � chaque tour
		for(etoile=0; etoile<11;++etoile) {
			//On inc�rmente l'affichage par rapport aux nombre d'�oiles
			for(i=0;i<etoile;++i) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Exercice B
		System.out.println("b)");
		//On d�bute avec 10 �toile et on d�cr�mente un par un
		for(etoile=10; etoile>0;etoile--) {
			//On affiche le nombre d'�toile demand� et on d�cr�mente
			for(i=etoile;i>0;i--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("c)");
		//Start avec 10 �toiles et d�cremente jusqu'� 0
		for(etoile=10; etoile>0;etoile--) {
			//Affiche les blanc en premier
			for(i=10;i>etoile;i--) {
				System.out.print(" ");
			}
			//Affiche le nombre d'�toile
			for(i=etoile;i>0;i--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("d)");
		//Start avec 10 �toiles et d�cremente jusqu'� 0
		for(etoile=0; etoile<11;++etoile) {
			
			//Affiche les blanc
			for(i=10;i>etoile;i--) {
				System.out.print(" ");
			}
			//Affiche le nombre d'�toile
			for(i=0;i<etoile;++i) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
