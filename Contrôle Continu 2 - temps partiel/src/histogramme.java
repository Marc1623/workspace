import java.util.*;
public class histogramme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
int taille = saisieTaille();
		
		int []tab = aleatoire(taille);
		
		afficheVecteur(tab);
		
		int [][]matrice = histogramme(tab);
		
		afficheMatrice(matrice);
		
		afficheEtoile(matrice);
	}
	
	public static int saisieTaille() {
		Scanner input = new Scanner(System.in);
		int ligne =0;
		System.out.println("Entrez la taille du tableau : ");
	    ligne = input.nextInt();
		
		return ligne;
		}
	
	public static int[] aleatoire(int taille) {
		int cpt=0;
		int tab[] = new int[taille];
		
		for (int i=0; i<(tab.length); i++)
			tab[i] = (int) (Math.random()*10) + 1; //Rempli avec chiffre random
		
		return tab;
		}
	
	public static void afficheVecteur(int[] tableau) {
		System.out.println(" ");
		for (int i=0; i<tableau.length; i++) {
				System.out.print(tableau[i]+" \t"); //Affiche la table
		}
	}
	
	public static int[][] histogramme(int[] tab) {
		int ligne =10;
		int colonne = tab.length;
		int tabM[][] = new int[ligne][colonne];
		int x=0; //cette variable va nous servir de compteur
		
			for(int j=0;j<(tabM[0].length);j++) {
				x=0;
				for (int i=(tabM.length-1); x<tab[j]; i--) { //On initialise i tout en bas du tableau puis on décrémente
					tabM[i][j] = 1;							 //On mets la valeur de tab de la cellule correspondant à la colonne comme max
					x++;									 //On incrémente x à chaque passage, on s'arretera quand on arrive a la valeur de tab
				}
			}
		return tabM;
		}
	
	public static void afficheMatrice(int[][] tableau) {
		System.out.println(" ");

		for (int i=0; i<tableau.length; i++) {
			System.out.println(" ");
			for(int j=0;j<tableau[0].length;j++)
			System.out.print(tableau[i][j]+" ");
		}
	}
	
	public static void afficheEtoile(int[][] tableau) {
		System.out.println(" ");
		
		char etoile[][] = new char[tableau.length][tableau[0].length]; //On crée un tab de char pour pouvoir mettre des étoiles dedans
		
		for(int j=0;j<tableau[0].length;j++)
			for (int i=0; i<tableau.length; i++) {
				if(tableau[i][j]==0) //Si on trouve un 0 on remplace par un espace
					etoile[i][j]=' ';
				else 
					etoile[i][j]='1'; // Si on trouve autre chose on mets 1
		}
		
		for (int i=0; i<etoile.length; i++) {
			System.out.println(" ");
			for(int j=0;j<etoile[0].length;j++)
			System.out.print(etoile[i][j]+" "); //On affiche le nouveau tableau
		}

	}

}
