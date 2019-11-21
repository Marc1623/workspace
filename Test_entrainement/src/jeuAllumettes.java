import java.util.*;
public class jeuAllumettes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nbAllum, nbTire, numJoueur ;
		String joueur1, joueur2, joueurEnCours ;
		boolean repete = true ;
		
		Scanner saisie = new Scanner(System.in) ;
		
		do {
			System.out.println("Nombre d'allumettes du jeu ? ") ;
			nbAllum = saisie.nextInt() ;
		} while (nbAllum <= 0) ;			// saisie "contr�l�e" du nombre d'allumettes
		
		System.out.println("Nom du joueur 1 ? ") ;
		joueur1 = saisie.next();
		System.out.println("Nom du joueur 2 ? ") ;
		joueur2 = saisie.next();
		
		numJoueur = 0 ; 					// c'est le joueur 1 qui commence 
		joueurEnCours = joueur1 ;			// (on pourrait tirer au hasard)
		
		do{
			do{								// boucle de saisie des allumettes restantes
				System.out.println("Il reste " + nbAllum + " allumettes.") ;
				System.out.println(joueurEnCours + ", veuillez tirer des allumettes: ") ;
				nbTire = saisie.nextInt() ;
				
				if (nbTire < 1 || nbTire > 4 || nbTire>nbAllum){
					System.out.println("tirer entre 1 et 4 allumettes") ;
					repete = true ;
				}
				else
					repete = false ;
			} while (repete == true) ;
			
			nbAllum -= nbTire ;				// on enl�ve 'physiquement' les allumettes
			
			numJoueur = (numJoueur + 1)%2 ;	// alternance des joueurs
			
			if (numJoueur == 0)				// test utile uniquement pour l'affichage
				joueurEnCours = joueur1 ;	// du prochain joueur qui va jouer
			else
				joueurEnCours = joueur2 ;
		} while (nbAllum > 0) ;
		
		// c'est joueurEnCours qui a gagn� car on a chang� les joueurs � la fin de la boucle 
		System.out.println(joueurEnCours + " a gagn� !") ;
	}
}
