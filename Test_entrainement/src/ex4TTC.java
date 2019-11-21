import java.util.*;

public class ex4TTC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double prix;
		double prixtva;
		double remise;
		double prixnet;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("inscrire le prix hors taxe");
		prix = scan.nextDouble();
		
		prixtva = prix+(prix*7.6/100);
		System.out.println("le prix TTC vaut "+ prixtva);
		
		if(prixtva>=1000){
			remise = (1/100*prixtva) ;}
		else
			if(prixtva>=2000){
				remise= (3/100*prixtva) ;}
			else {
				if(prixtva>=1){
					remise = (5/100*prixtva) ;}
				else{
					remise = 0;}
				}
		System.out.println("la remise vaut " + remise);
		prixnet= prixtva-remise;
		System.out.println("le prix net vaut " + prixnet);

			
		
		
		
		

	}

}
