import java.util.*;
public class AbdelCainStat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int jet1, jet2, jet3, numTirage ;
		int nbre ;
		int nbCain=0, nbAbel=0 ;			// initialisation des compteurs
		int nbCoupPartie, nbreParties ;
		int max = 3 ;						// ou 0
		double dureeMoyennePartie=0.0 ;		// � discuter
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Nombre de parties d�sir�es : ") ;
		nbreParties = scan.nextInt() ;
		
		// on pourrait saisir le nombre de tirages
		for (numTirage = 1 ; numTirage <= nbreParties ; numTirage++){
			// Pile = 1 et face = 0
			jet1 = (int) (Math.random()*2) ;
			jet2 = (int) (Math.random()*2) ;
			
			nbCoupPartie = 2 ;		// r�initialiser � chaque partie
						
			do{
				// 3�me tirage
				jet3 = (int) (Math.random()*2) ;
				++nbCoupPartie ;
				
				// pr�paration au test 
				nbre = jet1*100 + jet2*10 + jet3 ;
				
				// me pr�parer � la prochaine it�ration
				jet1 = jet2 ;
				jet2 = jet3 ;
			} while (nbre != 111 && nbre != 100) ;
			
			// discuter variable pseudo-r�elle (pas meilleure solution :-()
			dureeMoyennePartie += nbCoupPartie ;
			
			if (nbCoupPartie > max)
				max = nbCoupPartie ;
			
			if (nbre == 111)				// PPP et Cain gagne
				++nbCain ;
			else
				++nbAbel ;
		}
		
		System.out.println("Cain a gagn� " + nbCain + "fois.") ;
		System.out.println("Abel a gagn� " + nbAbel + "fois.") ;
		System.out.println("Nbre de coups moyen: " + dureeMoyennePartie/nbreParties) ;
		System.out.println("Dur�e partie la + longue: " + max) ;
		
		scan.close();
	}
}


	
