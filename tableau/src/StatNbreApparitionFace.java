import java.util.*;
public class StatNbreApparitionFace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
//		int de[] = new int [6] ;
		//int numTirage, i, nbre ;
	//	int i ;
		// volontairement j'utilise i dans deux contextes diff�rents
		// m�me si pour programmer proprement j'utiliserai une autre
		// variable de comptage
		/*for (numTirage=1 ; numTirage<=6000; numTirage++){
			nbre = (int) (Math.random()*6) ;
			++de[nbre] ;
		}*/
			
		// volontairement j'utilise i dans deux contextes diff�rents
		// m�me si pour programmer proprement j'utiliserai une autre
		// variable de comptage
/*		for (i=1 ; i<=60000 ; i++)
			++de[(int) (Math.random()*6)] ;
						
		for (i=0 ; i<6 ; i++)
			System.out.println((i + 1) + " appara�t " + de[i] + " fois.") ;
	*/	
		
		int []cpt = new int[6] ;
		int faceDe ;
		double pourcent ;
		
		for (int nbTirage=0; nbTirage<1000000; nbTirage++){
			faceDe = (int) (Math.random()*6) ;
			
			//cpt[faceDe] = cpt[faceDe] + 1 ;
			++cpt[faceDe] ;
		}
		
		for (int i=0 ; i<cpt.length ; i++){
			System.out.println("la face " + (i+1) + " est apparue " + cpt[i] + " fois") ;
			
			pourcent = (double) cpt[i]/1000000*100 ;
			System.out.println("Pourcentage de " + (i+1) + " : " + pourcent + "%") ;
		}


		
		
		
		
		
	}
}
