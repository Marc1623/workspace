import java.util.*;
public class leCompteEstBonMathieu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tirage[] = new int[6];
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 25, 50, 75, 100 };
		int resultat=0;
		int cpt=0;
		//int objectif=initializeNumberToReach();
		int objectif=1000;
		System.out.println("Nombre à atteindre : "+objectif);
		
		
		initializeRandom(tirage, number);
		
		afficheNbres(tirage, number);

		
		
		do{
		resultat=(calcule(tirage, number));
		cpt++;
		if(resultat==objectif)
			System.out.println("Gagné ! :-)");
		if(cpt == 5 )
			System.out.println("Perdu :-(");
		}while(resultat!=objectif && cpt<5);
	
		
		// choix();
		// play();
	}

	public static void initializeRandom(int[] tableau, int[] number) {

		int temp = 0;
		int cpt = 0;

		do {
			temp = (int) (Math.random() * 14) + 1;
			if (number[temp] != 0) {
				tableau[cpt] = number[temp];
				number[temp] = 0;
				cpt++;
			}
		} while (cpt != 6);

	}

	public static int initializeNumberToReach() {
		int upperBound = 999;
		int lowerBound = 100;
		int objectif = lowerBound
				+ (int) (Math.random() * ((upperBound - lowerBound) + 1));
		return objectif;
	}

	public static void afficheNbres(int[] tirage, int[] nombres) {

		for (int i = 0; i < tirage.length; i++) {
			System.out.print(tirage[i] + "\t");
		}
		System.out.println();
		/*
		 * for (int i = 0; i < nombres.length; i++) {
		 * System.out.print(nombres[i]+"\t"); }
		 */
		System.out.println();

	}

	public static int calcule(int []tirage, int [] number) {

		boolean check = false;
		int chiffre1=0, chiffre2 = 0;
		char operateur;
		
		Scanner input = new Scanner(System.in);
		do {

			System.out.println("Chiffre 1 : ");
			chiffre1 = input.nextInt();
			for (int i = 0; i < tirage.length; i++) {
				if (chiffre1 == tirage[i]) {
					check = true;
					tirage[i] = 0;
				}
			}
		} while (check == false);
	
		
		afficheNbres(tirage, number);
		do{
		System.out.println("Opérateur (+, -, *, /) : ");
		operateur = input.next().charAt(0);
		}while(operateur!='+'&&operateur!='-'&&operateur!='*'&&operateur!='/');
		afficheNbres(tirage, number);
		check=false;
		
		do{
		System.out.println("Chiffre 2 : ");
		chiffre2 = input.nextInt();
		for (int i = 0; i < tirage.length; i++) {
			if (chiffre2 == tirage[i]) {
				check = true;
				tirage[i] = 0;
			}
		}
	} while (check == false);
		
		
		int resultat=0;
		
		switch (operateur){
		
		case '+' : resultat = chiffre1+chiffre2 ;
		break;
		case '-' : resultat = chiffre1-chiffre2 ;
		break;
		case '*' : resultat = chiffre1*chiffre2 ;
		break;
		case '/' : resultat = chiffre1/chiffre2 ;
		break;
		}
		
		System.out.println("Resultat : " + resultat);
		boolean flag=false;
		for (int i = 0; i < tirage.length; i++) {
			if (tirage[i]==0 && flag==false){
				tirage[i]=resultat;
			flag=true;
			}
		}
		
		afficheNbres(tirage, number);
		return resultat;

	}

}
