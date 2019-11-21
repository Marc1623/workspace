import java.util.*;
public class ExercicePileFace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int jet1, jet2, jet3 ;
		int nbre, nbreJet ;
		boolean cain=false, abel=false ;
				
		// deux premiers tirages avant de commencer
		// � vraiment �valuer
		jet1 = (int) (Math.random()*2) ;	// Pile = 1 et Face = 0
		jet2 = (int) (Math.random()*2) ;
		nbreJet = 2 ;
		
		do {
			jet3 = (int) (Math.random()*2) ;
			++nbreJet ;
			
			// on construit artificiellement un nbre avec les 3 jets
			nbre = jet1*100 + jet2*10 + jet3 ;

/*			if (jet1==1){
				if (jet2==1 && jet3 ==1)
					cain = true ;
				else
					if (jet2==0 && jet3 == 0)
						abel = true ;
			}
	*/			
			// pr�paration du tirage suivant
			jet1 = jet2 ;
			jet2 = jet3 ;
System.out.println(nbre) ;
		//} while(cain == false && abel == false) ;
		} while (nbre != 111 && nbre != 100) ;
		/*if (cain == true)
			System.out.println("Cain a gagn� ") ;
		else
			System.out.println("Abel a gagn� ") ;
		*/
		if (nbre == 111)
			System.out.println("Cain a gagn� ") ;
		else
			System.out.println("Abel a gagn� ") ;
		
		System.out.println(" en " + nbreJet + " jets") ;
	}
}
