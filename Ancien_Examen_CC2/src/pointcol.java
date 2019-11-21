import java.util.*;
public class pointcol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[][] tab=createTab();
		
		remplirTab2D(tab);
		afficheTab2D(tab);
		pointCol(tab);
	}

	public static int[][] createTab() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ligne ");
		int ligne = input.nextInt();
		System.out.println("Colonne ");
		int colonne = input.nextInt();
		int tabM[][] = new int[ligne][colonne];
		return tabM;
		}
	
	public static void remplirTab2D(int[][] tableau) {
			
		for (int i=0; i<(tableau.length); i++)
			for(int j=0;j<(tableau[0].length);j++)
				tableau[i][j] = (int) (Math.random()*9) + 1;
		}
	
	public static void afficheTab2D(int[][] tableau) {

		for (int i=0; i<tableau.length; i++) {
			System.out.println(" ");
			for(int j=0;j<tableau[0].length;j++)
			System.out.print(tableau[i][j]+" \t");
		}
	}
	
	public static void pointCol(int[][] tableau)
    {
        for (int i = 0; i < tableau.length; i++) {
            int ligneMax = tableau[i][0];
            int posCol = 0;
            boolean pointCol = true;
 
            //Trouver le plus grand chiffre de la ligne             
            for (int j = 1; j < tableau[i].length; j++) {
                if(tableau[i][j] > ligneMax)
                {
                	ligneMax = tableau[i][j];
                	posCol = j;
                }
            }
            //Check si c'est la plus grande valeur de la colonne
            for (int j = 0; j < tableau.length; j++)
                if(tableau[j][posCol] < ligneMax)
                	pointCol = false;
             
            if(pointCol)//Si true affiche
                System.out.println("Point col est : "+ligneMax+" à la position : "+i+","+posCol);
        }
    }
	
	public static void afficheTab(int[] tableau) {
		System.out.println(" ");
		for (int i=0; i<tableau.length; i++) {
				System.out.println("Le chiffre max ou min de la ligne ou colonne: "+(i+1)+" est "+tableau[i]);
		}
	}
}

	
