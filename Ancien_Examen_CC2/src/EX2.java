import java.util.*;
public class EX2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int tab[][] = new int [6][6];
		
		int nbBombe=0;
		int ligne,colonne;
		
		
		for(int i=0 ; i<tab.length; i++){
			for(int j=0 ; j< tab[0].length; j++){
				if(nbBombe < 8){
				ligne = (int) (Math.random()*6);
				colonne = (int) (Math.random()*6);
				tab [ligne][colonne]= 8;
				nbBombe++;}
			}
		}
		
		for(int i=0; i < tab.length ; i++){
			for(int j = 0 ; i< tab[0].length; j++){
				
				if(tab[i][j] == 0){
					if(tab[i+1][j] != 0)
						++tab[i][j];
					if(tab[i][j+1] != 0)
						++tab[i][j];
					if(tab[i-1][j] != 0)
						++tab[i][j];
					if(tab[i][j-1] != 0)
						++tab[i][j];
				}
			}
		}
		
		afficheTab2D(tab);
		

	}
	
	
	public static void afficheTab2D (int [][] v){
		
		for(int i=0 ; i<v.length ; i++){
			System.out.println();
			for(int j=0 ; j< v[0].length ; j++){
				System.out.print(v[i][j] + " ");
			}
		}
	}

}
