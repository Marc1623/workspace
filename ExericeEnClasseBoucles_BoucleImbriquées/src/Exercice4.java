import java.util.*;
public class Exercice4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner (System.in);
		
		int nbligne;
		
		
		System.out.print("nbligne");
		nbligne=scan.nextInt();
		
		
		for(int i=1; i<=nbligne;i++ ){
			
			System.out.println("*");
			System.out.print(" ");
			for(int j= 1; j<nbligne ; j++){
				
				System.out.print("*");
				System.out.print(" ");
			}
			
			
			
		}

	}

}
