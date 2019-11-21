import java.util.*;
public class FouDuRoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int [][]t = new int[8][8];
		
		remplirTab2D(t);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ligne ");
		int ligne = input.nextInt();
		System.out.println("Colonne ");
		int colonne = input.nextInt();
		
		ligne--;
		colonne--;
		
		HD(t,ligne,colonne);
		BD(t,ligne,colonne);
		HG(t,ligne,colonne);
		BG(t,ligne,colonne);

		afficheTab2D(t);
		
	}
	
	public static void remplirTab2D(int[][] tableau) {
		
		for (int i=0; i<(tableau.length-1); i++)
			for(int j=0;j<(tableau[0].length-1);j++)
				tableau[i][j] = 0;
			}
	public static void afficheTab2D(int[][] tableau) {

			for (int i=0; i<tableau.length; i++) {
				System.out.println(" ");
				for(int j=0;j<tableau[0].length;j++)
				System.out.print(tableau[i][j]+" ");
			}
		}
	public static void HD(int[][] tableau, int Ligne, int Colonne) {
		
		while(Ligne>=0 && Colonne<tableau.length){
				tableau[Ligne][Colonne]=1;
				Ligne--;
				Colonne++;
			}
	}
	public static void BD(int[][] tableau, int Ligne, int Colonne) {
		
		while(Ligne<tableau.length && Colonne<tableau.length){
				tableau[Ligne][Colonne]=1;
				Ligne++;
				Colonne++;
			}
	}
	public static void HG(int[][] tableau, int Ligne, int Colonne) {
		
		while(Ligne>=0  && Colonne>=0 ){
				tableau[Ligne][Colonne]=1;
				Ligne--;
				Colonne--;
			}
	}
	public static void BG(int[][] tableau, int Ligne, int Colonne) {
	
		while(Ligne<tableau.length && Colonne>=0 ){
				tableau[Ligne][Colonne]=1;
				Ligne++;
				Colonne--;
			}
}
	

}

