import java.util.*;
public class ExerciceSuppBoucleEx1Liam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner input = new Scanner(System.in);
		
		int nbTerme; 
		double pi=0.0 ;
		double denominateur = 1 ;
		int cpt=0 ;
		
		System.out.println("Nombre de termes : ");
		nbTerme = input.nextInt();
		
		for (int i = 1 ; nbTerme>i ; i++){
			
			
			cpt = (cpt + 1)%2;
			if (cpt==0){
				pi = pi - (4.0/denominateur);
				denominateur+=2 ;
			}
			else
				pi = pi + (4.0/denominateur) ;
				denominateur+=2 ;
			
		}
		System.out.println(pi);


	}

}
