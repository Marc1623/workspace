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
		
		System.out.println("mettre une pi�ce");
		
		while(somme<pc){
			System.out.println("valeur de la pi�ce : "+ (piece= scan.nextInt()));
			System.out.println("vous avez entr� : " + (somme+=piece)); }
			
				
		System.out.println("bon caf� !");
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
				System.out.println("pi�ces impossible");
		}
			
		System.out.println(p10 + " pi�ces de 10ct");
		System.out.println(p20 + " pi�ces de 20ct");
		System.out.println(p50 + " pi�ces de 50ct");
		System.out.println(p100 + " pi�ces de 1 fr");
		System.out.println(p200 + " pi�ces de 2 fr");
	
		
		
		
		

	}

}
