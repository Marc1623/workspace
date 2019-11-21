import java.util.*;
public class MarcVial1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]tab = createTab2D();
		
		remplitAleatoireMatrice(tab);
		afficheTab2D(tab);
		
		System.out.println("La moyenne est de : " + moyenneColonne(tab));
		
	//	calculePlusGrand(tab);
	}
	
	public static int[][] createTab2D() {
		Scanner input = new Scanner(System.in);
		int ligne =0;
		int colonne = 0;
		System.out.println("Nombre de lignes : ");
		ligne = input.nextInt();
		System.out.println("nombre de colonnes : ");
		colonne = input.nextInt();
		int tabM[][] = new int[ligne][colonne];
		return tabM;
	}
	
	public static void remplitAleatoireMatrice(int[][] tableau) {

		for (int i=0; i<(tableau.length); i++)
			for(int j=0;j<(tableau[0].length);j++)
				tableau[i][j] = (int) (Math.random()*10) + 1;
	}
	
	public static void afficheTab2D(int[][] x) {

		for (int i = 0; i < x.length; i++) {
			System.out.println();

			for (int j = 0; j < x[0].length; j++) {

				System.out.print(x[i][j] + " \t ");
			}
		}
		System.out.println();
	}
	
	public static double moyenneColonne(int[][] arg) {
		
		Scanner saisie = new Scanner(System.in);
		int colonne=0;
		double moyenne;
		do{
		System.out.println("Quelle colonne voulez-vous traiter ? ");
		colonne = saisie.nextInt();}while(colonne>arg.length-1);
		colonne=colonne-1;
		int somme=0;
			
			for (int j = 0; j < arg.length; j++) {
				somme += arg[j][colonne];
			}
		System.out.println("pour la colonne : " + (colonne+1));
		moyenne = (double) somme / arg.length;
		System.out.println();
		
		return moyenne;
	}
	/*
	
	  public static void calculePlusGrand(int[][] tableau){
		Scanner scan = new Scanner(System.in);
		int cpt=0;
		int colonne=0;
		System.out.print("veuillez resaisir la colonne");
		colonne = scan.nextInt();
	
		for(int i = 0 ; i<tableau.length; i++){
			
			for (int j=colonne ; j<tableau.length;){
				if(tableau[i][j]> moyenneColonne(tableau)){
					cpt++;}
				
			}
		}
		System.out.println("il y a "+cpt+" chiffre plus grand que la moyenne");
		
	}
	
	*/

}
