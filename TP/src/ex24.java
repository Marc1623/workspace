import java.util.Scanner;


public class ex24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nombre1;
		int nombre2;
		int somme;
		int moyenne;
		int produit;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Inscrire le premier nombre");
		nombre1 = scan.nextInt();
		
		System.out.println("inscrire le deuxième nombre");
		nombre2=scan.nextInt();
		
		somme=nombre1+nombre2;
		System.out.println("la somme vaut : "+somme);
		
		moyenne=(nombre1+nombre2)/2;
		System.out.println("la moyenne est de : "+moyenne);
		
		produit = nombre1*nombre2;
		System.out.println("le produit vaut : "+produit);
		
		if(nombre1<nombre2){
			System.out.println("le plus petit est : "+nombre1);}
		else
			System.out.println("le plus petit est : "+nombre2);
		
		if(nombre1<nombre2){
			System.out.println("le plus grand est : "+nombre2);}
			else
				System.out.println("le plus grand est : "+nombre1);
		
		
		
		
	}

}
