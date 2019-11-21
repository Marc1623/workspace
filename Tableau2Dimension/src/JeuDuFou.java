import java.util.*;
public class JeuDuFou {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int ligne = 3, colonne =1 ,cptplus=0 ;
		
		int [][]tab = new int [8][8];
		
		//tab[ligne-1][colonne-1]= 2 ;
		
		int resteLigne, resteColonne;
		resteColonne = tab[0].length - colonne;
		resteLigne = tab.length - ligne;
		
		int avantLigne,avantColonne;
		avantLigne = ligne ;
		avantColonne = colonne ;
		
		while (resteColonne!=0 && resteLigne!=0) {
           		
			tab[ligne+cptplus][colonne+cptplus] = 1;
			cptplus++;
			resteColonne--;
			resteLigne--;
		}
		
		cptplus =1;
		while (avantLigne!=0 && avantColonne !=0) {
			tab[ligne-cptplus][colonne-cptplus]=1;
			cptplus++;
			avantLigne--;
			avantColonne--;
		}
		
		cptplus =0;
		while (avantLigne!=0 && resteColonne !=0) {
			tab[ligne-cptplus][colonne-cptplus]=1;
			cptplus++;
			avantLigne--;
			resteColonne--;
		}
		
		/*
		
			for(int j=0 ; j<tab.length;j++){
				tab[ligne+cptplus][colonne+cptplus]= 1;
				if(cptplus<(tab.length-colonne-1))
					cptplus++;
		}
		*/
		
		
		tab[ligne][colonne]= 2 ;
		
		for(int i=0 ; i<tab.length ; i++){
			System.out.println();
			for(int j=0 ; j< tab[0].length; j++){
				System.out.print(tab[i][j]+" ");
			}
		}
	}

}
