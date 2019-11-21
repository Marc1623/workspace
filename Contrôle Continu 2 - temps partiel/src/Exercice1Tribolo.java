import java.util.*;
public class Exercice1Tribolo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int billet[] = new int[6];
		remplirTab(billet);
		afficheTab(billet);
		checkBillet(billet);
		
	}
	public static void remplirTab(int[] tableau) {
		Scanner input= new Scanner(System.in);
		
		for (int i=0; i<(tableau.length); i++)
				tableau[i] = input.nextInt();
	}
	
	public static void afficheTab(int[] tableau) {
		System.out.println(" ");
		for (int i=0; i<tableau.length; i++) {
				System.out.print(tableau[i]+" \t");
		}
	}
	
	public static void checkBillet(int[] tableau) {
		int j=0;
		int egal = 0;
		
		do {
			egal = 0;
		for (int i=0; i<tableau.length; i++) {
			if (tableau[j]==tableau[i])
				egal++;	
		}
		j++;
		}while(j<6 && egal<2);
		
		if (egal>2)
			System.out.println("\n Billet gagnant");
		else 
			System.out.println("\n Billet perdant");
	}

}
		
