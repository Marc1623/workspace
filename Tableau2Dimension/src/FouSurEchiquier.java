import java.util.*;
public class FouSurEchiquier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int ligne , colonne;
		System.out.print(" ligne");
		ligne = scan.nextInt();
		System.out.print("colonne");
		colonne = scan.nextInt();
		
		int somme = ligne + colonne;
		int diff = ligne - colonne;
		
		int tab[][] = new int [8][8];
		
		ligne--;
		colonne--;
		
		for(int i = 0 ; i< tab.length; i++){
			for (int j=0 ; j< tab[0].length;j++){
				if( i - j == diff || i + j == somme)
					tab[i][j]=1;
				else
					tab[i][j]=0;
			}
		}
		tab[ligne][colonne]=2;
		
		for(int i=0 ; i<tab.length ; i++){
			System.out.println();
			for(int j=0; j<tab[0].length ; j++){
				System.out.print(tab[i][j]+ "  " );
			}
		}

	}

}
