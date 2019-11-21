import java.util.*;
public class Exemple_class {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]t = new int [4][5];
		int i, j, compteur =1 ;
		
		
		//initialiser
		for(i=0; i<4 ; i++){			//4 ou t.lenght
			for (j=0 ; j<5; j++){		// 5 ou t[0].lenght
				t[i][j]= compteur++;		
			}
		}
		
		// afficher
		for(i=0; i<4 ; i++){	//4 ou t.lenght
			System.out.println();
			for (j=0 ; j<5; j++){		// 5 ou t[0].lenght
				System.out.print(t[i][j]+" ");
		} 
		}

	}

}
