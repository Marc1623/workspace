import java.util.*;
public class loto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int [][]loto = {{0, 17, 0, 32, 40, 0, 64, 0, 84}, 
				{5, 0, 26, 34, 0, 52, 0, 78, 0},
				{0, 18, 27, 0, 49, 0, 65, 0, 90}} ;
		int nbCoups ;

		// affiche la carte 
		affiche(loto) ;
		System.out.println() ;

		// - �crire une m�thode joue() qui joue jusqu'� ce que toute 
		// la grille soit remplie 
		// - dans cette m�thode, vous �crirez les diff�rentes actions
		// avec des m�thodes
		// 		- tirage() pour saisir un nombre
		//      - verifieNombreTire() qui v�rifie si le nombre tir�
		//		  appara�t sur la carte
		nbCoups = joue(loto) ; 		

		System.out.println("Vous avez gagn� apr�s " + nbCoups + " tirages.") ;
	}

	public static int joue(int [][]t) {
		int nbCoups=0 ; 
		int nbTire=0 ;
		int nbre ;
		int []nombre = new int[90] ;	// tableau initialis� � 0
		boolean trouve ;

		do {
			nbre = tirage(nombre) ;
			++nbCoups ;
			trouve = verifieNombreTire(nbre, t) ;

			if (trouve)
				++nbTire ;
		} while (nbTire<15) ;

		return nbCoups ;
	}

	public static int tirage(int []t) {
		int nbre ;

		do {
			nbre = (int) (Math.random()*90 + 1) ;
		} while (t[nbre-1]!=0) ;

		t[nbre-1] = nbre ;

		return nbre ;
	}

	public static boolean verifieNombreTire(int nbre, int [][]t) {
		int i, j ;

		for (i=0 ; i<3 ; i++)
			for (j=0 ; j<9 ; j++)
				if (t[i][j] == nbre)
					return true ;

		return false ;
	}

	public static void affiche(int [][]t){
		String nbEspace ;
		System.out.println("Voici la grille de loto");

		for (int i=0 ; i<3 ; i++) {
			System.out.println();

			for (int j=0 ; j<9 ; j++) {
				if (t[i][j]<10)
					nbEspace = "  " ;
				else
					nbEspace = " " ;

				System.out.print(nbEspace + t[i][j]);
			}
		}

	}

}
