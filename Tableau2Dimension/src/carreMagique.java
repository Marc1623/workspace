import java.util.*;
public class carreMagique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// impair? focntionne que si impair
		// définir la première case
		// remplir (taille x taille)   boule for
		// -
		// - calcul prochaine case ->Î

		int n ;
		Scanner input = new Scanner(System.in) ;
		System.out.println("Give the size of the magic square : (odd)") ;
		n = input.nextInt() ;
		//If the size is odd we display the magic square
		if (n%2 == 1)
			displayMagicSquare(magicSquare(n)) ;
	}
	/**
	 * Display the magic square
	 * @param square
	 */
	public static void displayMagicSquare(int [][] square) {
		for (int i=0 ; i<square.length ; i++) {
			for (int j=0 ; j<square[i].length ; j++)
				System.out.printf("%3d ", (square[i][j])) ;
			System.out.println() ;
		}
	}
	/**
	 * fill the magic square
	 * @param size
	 * @return
	 */
	public static int [][] magicSquare(int size) {
		int [][] square = new int [size][size] ;
		
		// creation of the square
		int row = size / 2 - 1 ;
		int column = size / 2 ;
		
		
		//a for loop to place the numbers
		for (int i=1 ; i<=size*size ; i++){
			square[row][column] = i ;
			//use of the modulo to always stay in the array
			row = (row-1+size) % size ;
			column = (column+1) % size ;
			
			
			if (square[row][column] != 0) { // one if is enough
			column = (column-1+size) % size ;
			row = (row-1+size) % size ;
		}
		}
		return square ;


	

}

}
