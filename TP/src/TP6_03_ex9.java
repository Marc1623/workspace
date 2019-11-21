import java.util.*;
public class TP6_03_ex9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		
		
		int menu,boisson,pizza,salade,sorti=0 ;
		
		
		do{
		
		
		System.out.println("Veuillez choisir un element ci-dessous : ");
		System.out.println("");
		System.out.println("1. Prix des boissons");
		System.out.println("2. Prix des pizzas");
		System.out.println("3. Prix des salades");
		System.out.println("4. sortir du menu");
		
		
		
		
			
			menu = scan.nextInt();
				
		switch (menu){
		case 1 :
			System.out.println("1. Jus d'orange");
			System.out.println("2. Fendant (bouteille)");
			System.out.println("3. Whisky (bouteille");
			boisson =scan.nextInt();
			switch (boisson){
			case 1 :
				System.out.println("Le prix d'un jus d'orange est de 2 Frs");
				break;
			case 2 :
				System.out.println("2Le prix d'un Fendant (bouteille) est de 8 Frs");
				break;
			case 3 :
				System.out.println("Le prix d'un Whisky est de 70 Frs");
			break; }
		break;
		
		case 2 :
			System.out.println("1. Margarita");
			System.out.println("2. 4 saisons");
			System.out.println("3. Calzone");
			pizza = scan.nextInt();
			switch (pizza){
			case 1 :
				System.out.println("Le prix d'une Margarita est de 13 Frs");
				break;
			case 2 :
				System.out.println("Le prix d'une 4 saisons est de 16 Frs");
				break;
			case 3 :
				System.out.println("Le prix d'une Calzone est de 16 Frs");
				break; }
		break;
		
		case 3 : 
			System.out.println("1. Verte");
			System.out.println("1. Melée");
			System.out.println("1. Niçoise");
			salade = scan.nextInt();
			switch (salade){
			case 1 :
				System.out.println("le prix d'une salade verte est de 5 FRS");
				break;
			case 2 :
				System.out.println("le prix d'une salade mêlée est de 7 FRS");
				break;
			case 3 :
				System.out.println("le prix d'une salade niçoise est de 8 FRS");
				break;}
		break;
		
		case 4 :
			System.out.println("Voulez-vous vraiment quitter ? ");
			System.out.println("1 pour oui , 2 pour non");
			sorti=scan.nextInt();
			
			
			
		}
		}while (sorti != 1);

	}

}
