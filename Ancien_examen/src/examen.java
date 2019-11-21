import java.util.*;
public class examen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]t = createTab2D();
		int[]tableau = createTab();

	}

	public static void afficheTab2D(int[][] x) {

		for (int i = 0; i < x.length; i++) {
			System.out.println();

			for (int j = 0; j < x[0].length; j++) {

				System.out.print(x[i][j] + " \t ");
			}
		}
	}

	public static void remplirRandomTab2D(int[][] tableau) {

		for (int i=0; i<(tableau.length); i++)
			for(int j=0;j<(tableau[0].length);j++)
				tableau[i][j] = (int) (Math.random()*10) + 1;
	}
	public static void remplirTab(int[] tableau) {
		for (int i=0; i<(tableau.length-1); i++)
			tableau[i] = 0;
	}

	public static void afficheTab1D(int[] tab) {

		for (int i=0; i<tab.length; i++) {
			System.out.print(tab[i]);
		}	
	}

	public static void remplirTab2DSansRepetition(int[][] tableau) {
		int max = tableau.length*tableau[0].length;			

		int once[][] = new int[tableau.length][tableau[0].length];
		for (int i=0; i<(once.length); i++)
			for(int j=0;j<(once[0].length);j++) {
				once[i][j] = max;
				max--;
			}
		//afficheTab2D(once);
		System.out.println(" ");
		int x=1,y=1;

		for (int i=0; i<(tableau.length); i++)
			for(int j=0;j<(tableau[0].length);j++) {

				do {
					x = (int)(tableau.length*Math.random());
					y = (int)(tableau[0].length*Math.random());

				}while(tableau[x][y]!=0);
				//System.out.println("X : "+x+" Y : "+y);
				tableau[x][y]=once[i][j];
			}
	}

	public static int[][] createTab2D() {
		Scanner input = new Scanner(System.in);
		int ligne =0;
		int colonne = 0;
		System.out.println("Entrez la taille des lignes du tableau : ");
		ligne = input.nextInt();
		System.out.println("Entrez la taille des colonnes du tableau : ");
		colonne = input.nextInt();
		int tabM[][] = new int[ligne][colonne];
		return tabM;
	}

	public static int[] createTab() {
		Scanner input = new Scanner(System.in);
		int ligne =0;
		System.out.println("Entrez la taille du tableau : ");
		ligne = input.nextInt();
		int tabM[] = new int[ligne];
		return tabM;
	}

}
