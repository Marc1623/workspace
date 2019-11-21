import java.util.*;
public class ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int tab[][]= creationMatrice();
		remplissageauto(tab);
		afficheTab2D(tab);
		PointCol(tab);
		
		if(PointCol(tab) != 20)
			System.out.print("Point col valant " + PointCol(tab) );
		

	}
	public static int [][] creationMatrice(){
		Scanner scan = new Scanner (System.in);
		 
		int ligne;
		int colonne;
		
		System.out.println("Combien de ligne");
		ligne = scan.nextInt();
		System.out.println("Combien de colonne");
		colonne = scan.nextInt();
		
		int [][]v= new int [ligne][colonne];
		return v;
	}
	public static int[][] remplissageauto(int[][] v){
		
		for(int i=0; i<v.length;i++){
			for(int j=0 ; j<v[0].length; j++){
				v[i][j]= (int) (Math.random()*9)+1;
			}
		}
		return  v;
	}
	
	public static void afficheTab2D (int [][] v){
		
		for(int i=0 ; i<v.length ; i++){
			System.out.println();
			for(int j=0 ; j< v[0].length ; j++){
				System.out.print(v[i][j] + "\t");
			}
		}
	}
	
	public static int PointCol(int [][] v){
		
		int nombre;
		int max=0;
		int min=10;
		
		for(int i = 0 ; i<v.length;i++){
			if(v[i][0] > max)
				max = v[i][0];
		
			for(int j=0 ; j< v[0].length; j++){
				if(v[0][j] < min)
					min = v[0][j];
			}
		}
		if (min == max )
			nombre = min;
		else 
			nombre= 20;
		
		return nombre;
			
	}
	
}
