import java.util.*;
public class Exercice2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		double   total = 0.0;
		int n=1;
		
		System.out.print(" nombre");		
		n=scan.nextInt();
		
		
		for(int i=1 ; i<(n+1) ; i++){
			
			 total+=(double) 1/i;
			
		}
		
		System.out.println(total);
	}

}
