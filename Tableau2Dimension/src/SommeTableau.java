import java.util.*;
public class SommeTableau {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]t = new int[4][5];
		int i, j, somme = 0;

		//initialiser
		for(i = 0; i < t.length - 1; i++)			//4 = t.length
			for(j = 0; j < t[0].length - 1; j++)	//5 = t[0].length
				t[i][j] = (int) (Math.random()*10 + 1);

		//somme des lignes
		for(i = 0; i < t.length - 1 ; i++){
			somme = 0 ;
			for(j = 0; j < t[0].length - 1; j++){
				somme += t[i][j] ;
			}
			t[i][t[0].length - 1] = somme ;
		}

		//somme des colonnes 
		for(i = 0; i < t[0].length; i++){
			somme = 0 ;
			for(j = 0; j < t.length - 1; j++){
				somme += t[j][i] ;
			}
			t[t.length - 1][i] = somme ;	
		}

		//afficher
		for(i = 0; i < t.length; i++){
			System.out.println("");
			for(j = 0; j < t[0].length; j++)		
				System.out.print(t[i][j] + "\t");
		}
	}

}
