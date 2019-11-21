import java.util.*;
public class caréémagique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner saisie = new Scanner(System.in);
		
		int taille ;
		
		do{
		System.out.println("Choisissez la taille du tableau (impair) : ");
		taille = saisie.nextInt();
		} while ((taille%2==0));	//Pour choisir que les nombres impairs

		int[][] t = new int[taille][taille];
		int valeur = 1;
		int ligneBase = taille / 2 - 1;
		int colonneBase = taille / 2;

		t[ligneBase][colonneBase] = valeur; // Affiche 1 dans la case au dessus
											// du centre

		for (int i = 0; i < (t.length * t[0].length) - 1; i++) {
			ligneBase--;
			colonneBase++;

			if (ligneBase == -1) {
				ligneBase = t.length - 1;
			}

			if (colonneBase == t[0].length) {
				colonneBase = 0;
			}

			if (t[ligneBase][colonneBase] != 0) { // Si il y a déjà une valeur dans la cellule on se décale
			
				ligneBase = (ligneBase - 1 + t.length) % t.length;
				colonneBase = (colonneBase - 1 + t.length) % t.length;
			}
		
			t[ligneBase][colonneBase] = ++valeur;
			
		}
		t[0][0]=3;
		affiche(t);
		System.out.println();
		System.out.println("La somme de cette colonne  est de "+sommeColonnes(t));
		System.out.println("La somme de cette ligne est de "+sommeLignes(t));
		System.out.println("La somme des diagonales est de "+sommeDiagonale(t));

	}

	public static void affiche(int[][] x) {

		for (int i = 0; i < x.length; i++) {
			System.out.println();

			for (int j = 0; j < x[0].length; j++) {

				System.out.print(x[i][j] + " \t ");
			}
		}
	}
	
	public static int sommeColonnes(int[][] arg) {
		
		Scanner saisie = new Scanner(System.in);
		int colonne=0;
		do{
		System.out.println("Choisissez la colonne dont vous voulez calculer la somme : ");
		colonne = saisie.nextInt();}while(colonne>arg.length-1);
		int somme=0;
			
			for (int j = 0; j < arg.length; j++) {
				somme += arg[j][colonne];
			}

		
		return somme;
	}
	
	public static int sommeLignes(int[][] arg) {
	        
		Scanner saisie = new Scanner(System.in);
		int ligne =0 ;
		do{
		System.out.println("Choisissez la ligne dont vous voulez calculer la somme : ");
		ligne = saisie.nextInt();}while(ligne>arg[0].length-1);
		int somme = 0 ;
	         
	        for (int j=0 ; j<arg[0].length ; j++)
	            somme += arg[ligne][j] ;
	         
	
		return somme;
	}
	
    // Méthode calculant la somme des diagonales d'une matrice carrée
    // ! Elle retourne -1 si les sommes des diagonales sont différentes
    public static int sommeDiagonale(int [][]x){
        int somme1=0, somme2=0 ;
        int k=x.length - 1 ;
         
        for (int i=0 ; i<x.length ; i++, k--){
            somme1 += x[i][i] ;
            somme2 += x[k][i] ;
        }
         
        if (somme1 == somme2)
            return somme1 ;
         
        return -1 ;
    }
 
 
}


