import java.util.Scanner;


public class Exercice_boucle_cafe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		int somme=0;
		int piece=0;
		int pc;
		
		int reste;
		int p200=0, p100=0, p50=0, p20=0, p10=0,total=0 ;
		
		System.out.println("prix du cafe ?");
		pc=scan.nextInt();
		
		System.out.println("mettre une pièce");
		
		while(somme<pc){
			System.out.println("valeur de la pièce : "+ (piece= scan.nextInt()));
			System.out.println("vous avez entré : " + (somme+=piece)); }
			
				
		System.out.println("bon café !");
		System.out.println("vous avez introduit :" );
		
		
		switch (total){
		case 10 :
			++p10;
			break;
		case 20 :
			++p20;
			break;
		case 50 :
			++p50;
			break;
		case 100 :
			++p100;
			break;
		case 200 :
			++p200;
			break;
			default :
				total=0;
				System.out.println("pièces impossible");
		}
			
		System.out.println(p10 + " pièces de 10ct");
		System.out.println(p20 + " pièces de 20ct");
		System.out.println(p50 + " pièces de 50ct");
		System.out.println(p100 + " pièces de 1 fr");
		System.out.println(p200 + " pièces de 2 fr");
	
		
		
		
		

	}

}
