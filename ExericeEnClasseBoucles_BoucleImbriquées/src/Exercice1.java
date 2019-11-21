import java.util.Scanner;


public class Exercice1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		
	/*	
		int n,a=0, somme=0;
		System.out.print("nombre");
		n=scan.nextInt();
		
		while(a<n){ 
			a++;
			somme+=n;
		}
		System.out.print(" somme = "+somme);
		
		*/
	
	
		int n, a=0,somme=0;
		System.out.print("nombre");
		
		n=scan.nextInt();
		
		do {
			a++;
			somme+=n;
		}while (a<n);
		System.out.print(" somme = "+somme);
		
	}
	
		

}
