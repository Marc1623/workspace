import java.util.*;
public class Ex1_Moquette {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String [][]tab = creeCarreau();
		afficheCarreau(tab);
		
		 
		changeMotif(tab);
		afficheCarreau(tab);
		
		
		afficheMoquette(tab);
	}
	
	public static String [][] creeCarreau(){
		
		Scanner input = new Scanner(System.in);
		int ligne =0;
		int colonne = 0;
		System.out.println("Hauteur du carreau : ");
		ligne = input.nextInt();
		System.out.println("Largeur du carreau : ");
		colonne = input.nextInt();
		
		String[][] matrice = new String [ligne][colonne];
		
		System.out.print("Motif : ");
		String motif = input.next();
		
		for(int i =0 ; i< matrice.length; i++){
			for(int j=0;j<matrice[0].length;j++){
				matrice[i][j]= motif;
			}
		}
		return matrice;
	}
	
	
	
	
	public static void afficheCarreau(String [][] x) {

		for (int i = 0; i < x.length; i++) {
			System.out.println();

			for (int j = 0; j < x[0].length; j++) {

				System.out.print(x[i][j]);
			}
		}
		System.out.println();
	}
	
	public static String[][] changeMotif (String [][]x){
		Scanner scan = new Scanner (System.in);
		int ligne;
		int colonne;
		String motif;
		System.out.println("Modification du carreau : ");
		System.out.println("Ligne : ");
		ligne = scan.nextInt();
		System.out.println("colonne : ");
		colonne = scan.nextInt();
		System.out.print("motif : ");
		motif = scan.next();
		
		x[ligne-1][colonne-1] = motif;
		
		return x;
	}
	
	
	public static void afficheMoquette(String [][]x){
		Scanner scan = new Scanner (System.in);
		int nbHauteur;
		int nbLargeur;
		
		System.out.println("Affiche de la moquette : ");
		System.out.print("Nombre de carreau en hauteur : " );
		nbHauteur = scan.nextInt();
		System.out.print("Nombre de carreau en largeur : " );
		nbLargeur = scan.nextInt();
		
		for(int m=0;m< nbHauteur; m++){
			for(int t=0; t<x.length;t++){
				System.out.println();
				for(int i =0; i<nbLargeur;i++){	
					for(int j=0 ; j< x[0].length; j++){
						System.out.print(x[i][j]);
			}
					System.out.print("\t");
		}
		}
			System.out.println();
		}
		
	}

}
