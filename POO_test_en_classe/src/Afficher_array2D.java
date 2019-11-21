import java.util.*;

public class Afficher_array2D {


	public static void main(String[] args) {
		
		int array1[][] = { { 1,2, 3}, { 4, 5, 6} };
		int array2[][] = { { 1, 2}, { 3 }, { 4, 5, 6} };
		
		System.out.println("Values in array1 by row are");
		afficheArray(array1);
		
		System.out.println();
		
		System.out.println("Values in array2 by row are");
		afficheArray(array2);

	}
	
	public static void afficheArray (int [][]x){
		for(int i=0; i<x.length;i++){
			System.out.println();
			for(int j=0;j<x[i].length;j++){
				System.out.printf("%3d", (x[i][j]));
			}
		}
	}

}
