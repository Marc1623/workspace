import java.util.*;
public class Moyenne_matrice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int matrice[][] ;
		int totLigne, totColonne, numColonne ;
		double moyCol ;
		int nbPlusGrand ;
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("Nombre de lignes: ") ;
		totLigne = input.nextInt() ;
		System.out.println("Nombre de colonnes: ") ;
		totColonne = input.nextInt() ;
		
		// remplissage et affichage de la matrice du tableau 
		matrice = remplitAleatoireMatrice(totLigne, totColonne) ;
		afficheMatrice(matrice) ;
		
		// entrer un num�ro de colonne
		System.out.println("Quelle colonne voulez-vous traiter ?");
		numColonne = input.nextInt() ;
		
		// calculer la moyenne de la colonne 
		// ajuster le num�ro de colonne utilisateur 
		// � celui du stockage Java
		moyCol = moyenne(numColonne-1, matrice) ;
		
		// calculer nbre au-dessus de moyenne de la colonne trait�e
		nbPlusGrand = calculePlusGrand(moyCol, numColonne-1, matrice) ;

		System.out.println("Pour la colonne: " + numColonne);
		System.out.println("La moyenne est de : " + moyCol);
		System.out.println("Et il y a " + nbPlusGrand + " valeur(s) sup�rieure(s) � la moyenne");
		input.close() ;
	}
	
	/**
	 * M�thode qui calcule le nombre d'�l�ments d'une colonne
	 * d'une matrice sup�rieurs � la moyenne de la colonne
	 * @param moy: moyenne de la colonne
	 * @param numCol: num�ro de la colonne � traiter
	 * @param matrice: matrice � traiter
	 * @return : le nombre d'�l�ments sup�rieurs � la moyenne
	 */
	public static int calculePlusGrand(double moy, int numCol, int [][]matrice) {
		int compteur=0 ;
		
		for (int i=0 ; i<matrice.length ; i++)
			if (matrice[i][numCol] > moy)
				++compteur ;
		
		return compteur ;
	}
	
	public static double moyenne(int col, int [][]matrice) {
		int i ;
		double somme = 0.0 ;

		for (i=0 ; i < matrice.length ; i++)
			somme += matrice[i][col] ;
		
		return somme/matrice.length ;
	}
	
	public static int[][] remplitAleatoireMatrice(int nbLi, int nbCol) {
		int ligne, colonne ;
		int matrice[][] = new int[nbLi][nbCol] ;
		
		for (ligne=0 ; ligne < nbLi ; ligne++)
			for (colonne=0 ; colonne < nbCol ; colonne++)
				matrice[ligne][colonne] = (int) (Math.random()*10 + 1) ;

		return matrice ;
	}
	
	public static void afficheMatrice(int matrice[][]){
		for (int i=0 ; i < matrice.length ; i++){
			for (int j=0 ; j < matrice[0].length ; j++)
				if (matrice[i][j] < 10)
					System.out.print("  " + matrice[i][j]) ;
				else
					System.out.print(" " + matrice[i][j]) ;
			
			System.out.println();
		}
	}

	}


