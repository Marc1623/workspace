import java.util.*;
public class Permutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner (System.in);
		
		/*
		int [] t = {2,5,7,1,3,8,6,2,3} ;
		
		int k;
		System.out.print("deplacement de combien ?");
		k = scan.nextInt();
		
		for(int i=0 ; i<t.length ; i++){
			System.out.print(" "+t[i]);
		}
		*/

		int temp;
		int n=0;
		System.out.print("combien de case ?");
		n = scan.nextInt();
		
		int k=0;
		System.out.print("combien dlplacement ?");
		k=scan.nextInt();
		
		int [] tab={2,5,7,1,3,8,6,2,3};
		tab = new int [n];
		
		
		
		temp = tab[n-1];
		
		for(int i= n-1 ; i>0 ; i--){
			tab[i]=tab[i-1];
			System.out.print(""+tab[i]);
		}
	
		tab[0]=temp;
	}

}
