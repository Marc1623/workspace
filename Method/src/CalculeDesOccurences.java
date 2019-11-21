import java.util.*;
public class CalculeDesOccurences {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ecrire une méthode java qui calcule les occurences de nombres d'une matrice 
		 * (remplie aléatoirement avec des nombres de 1 à 10)*/
		 
		
		int [][]tab = new int [3][7];
		
		
		remplieTab2D(tab); 
		afficheTab2D(tab);
		System.out.println();
		occurenceTab(tab);
		
		afficheTab(occurenceTab(tab));
		
			
		
		

	}
	
	public static void afficheTab2D (int [][] v){
		
		for(int i=0 ; i<v.length ; i++){
			System.out.println();
			for(int j=0 ; j< v[0].length ; j++){
				System.out.print(v[i][j] + "\t");
			}
		}
	}
	
	public static void remplieTab2D (int [][] v){
		for(int i=0 ; i<v.length ; i++){
			for(int j=0 ; j < v[0].length ; j++){
				v[i][j]= (int) (Math.random()*10)  + 1;
			}
		}
	}
	
	public static int[] occurenceTab (int v[][]){
		int res[] = new int [10];
		
		for(int i=0 ; i< v.length; i++){
			for(int j=0; j< v[0].length ; j++){
				++res[v[i][j]-1];
			}
		}
		return res;
	}
	
	public static void afficheTab(int []v){
		
		for(int i=0 ; i<v.length;i++){
			System.out.println("le chiffre "+ (i+1) + " est apparue "+ v[i]+" fois");
		}
	}
	

}
