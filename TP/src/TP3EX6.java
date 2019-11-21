import java.util.Scanner;


public class TP3EX6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double poids=0, taille ;
		int genre,age;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Si vous êtes un homme tapper 1 si vous êtes une femme tapper 2 ");
		genre=scan.nextInt();
		
		System.out.println("Inscrire votre taille");
		taille=scan.nextDouble();
		
		System.out.println("Inscrire votre age");
		age=scan.nextInt();
		
		
		if(genre==1){
			poids = taille-100-((taille-150)/4)+((age-20)/4);}
			else
				if(genre==2){
					poids=taille-100-((taille-150)/2.5)+((age-20)/6);}
		
		System.out.println("votre poids idéal est de "+ poids + " Kg");
							
		

	}

}
