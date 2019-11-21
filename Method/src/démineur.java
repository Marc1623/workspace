import java.util.*;
public class démineur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] tab;
		tab = new char[6][6];
		
		initialiser(tab);
		bombe(tab);
		grille(tab);
		affiche(tab);
	}

	public static void bombe(char[][] tab) {

		int ligne;
		int colonne;

		for (int i = 0; i < 8; i++) {
			colonne = (int) (6 * Math.random() + 1);
			ligne = (int) (6 * Math.random() + 1);
			do {

				colonne = (int) (5 * Math.random() + 1);
				ligne = (int) (5 * Math.random() + 1);

			} while (tab[ligne][colonne] == '*');
			tab[ligne][colonne] = '*';
		}

	}

	public static void affiche(char[][] tab) {

		for (int i = 0; i < tab.length; i++) {

			for (int j = 0; j < tab[i].length; j++) {

				System.out.print(tab[i][j] + " ");
			}
			System.out.println();

		}

	}
	public static void initialiser(char[][]tab){
		
		for (int i = 0; i < tab.length; i++) {

			for (int j = 0; j < tab[i].length; j++) {

				tab[i][j] ='0';
			}

		}
		
	}

	public static void grille(char[][] tab) {
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (tab[i][j] == '*') {
					for (int k = (i - 1); k <= (i + 1); k++){
						for (int l = (j - 1); l <= (j + 1); l++){
							if (k >= 0 && l >= 0 && k < tab.length && l < tab[i].length){
								if (tab[k][l] != '*'){
									tab[k][l]++;
								}
							}
						}
					}
				}
			}
		}

	}
}

