import java.util.*;
public class matricetransposé {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] tab=createTab();
		
		remplirTab2D(tab);
			
		afficheTab2D(tab);
		
	}
	
	public static int[][] createTab() {
		Scanner input = new Scanner(System.in);
		int ligne =0;
		int colonne =0;
		System.out.println("Ligne : ");
	    ligne = input.nextInt();
	    System.out.println("Colonne :");
	    colonne = input.nextInt();
	
		int tabM[][] = new int[ligne][colonne];
		return tabM;
		}
	
	public static void afficheTab2D(int[][] tableau) {

		for (int i=0; i<tableau.length; i++) {
			System.out.println(" ");
			for(int j=0;j<tableau[0].length;j++)
			System.out.print(tableau[i][j]+" \t");
		}
	}
	
	public static void remplirTab2D(int[][] tableau) {
		int max = tableau.length*tableau[0].length;			
	
		int once[][] = new int[tableau.length][tableau[0].length];
		for (int i=0; i<(once.length); i++)
			for(int j=0;j<(once[0].length);j++) {
				once[i][j] = max;
				max--;
			}
		
		afficheTab2D(once);
		System.out.println(" ");
		int x=1,y=1;
		
		for (int i=0; i<(tableau.length); i++)
			for(int j=0;j<(tableau[0].length);j++) {
				
				do {
					 x = (int)(tableau.length*Math.random());
					 y = (int)(tableau[0].length*Math.random());
					
				}while(tableau[x][y]!=0);
				System.out.println("X : "+x+" Y : "+y);
				
				tableau[x][y]=once[i][j];
			}
		}

}

		
