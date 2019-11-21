import java.util.*;
public class ExerciceSuppBoucleEx3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner (System.in);
		
		int nbcalcul, a, b,resultat; 
		double pourcentage;
		int reussi=0;
		System.out.println("Entrer le nombre de calculs désirés");
		nbcalcul=scan.nextInt();
		
		for(int i=0 ; i<nbcalcul ; i++){
			a= (int) (Math.random()*13)  + 2 ;
			b= (int) (Math.random()*12)  + 1 ;
			
			System.out.println(a +" * "+b+" = ");
			resultat=scan.nextInt();
			
			if(resultat == a*b){
				++reussi;
			}
		
		
		}
		System.out.println(reussi);
		pourcentage = (double)reussi/nbcalcul*100;
		System.out.print("Pourcentage de reussite : "+pourcentage+" %");
		
		
		
	}

}
