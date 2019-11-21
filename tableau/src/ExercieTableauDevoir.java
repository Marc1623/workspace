import java.util.*;
public class ExercieTableauDevoir {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		
		
		int [] tableau = {2} ;
		
		int somme=0;
		double moyenne;
		int max=tableau[0];
		int cpt=0;
		
		for(int i=0; i < tableau.length; i++){
			
			System.out.println(tableau[i]);
			somme+=tableau[i];
			
			if(tableau[i]>max){
				max = tableau[i];
			}
			
		}
		moyenne=somme/tableau.length;
		
		
		for(int j=0; j < tableau.length; j++){
			if(tableau[j]>moyenne){
				cpt++;}
		
		}
		
		System.out.println("la somme vaut : "+somme);
		
		
		System.out.println("la moyenne vaut : "+moyenne);
		
		System.out.println("le max vaut : "+max);
		
		System.out.println("Le nombre de valeur suppérieur à la moyenne est de : "+cpt);
		



	}

}
