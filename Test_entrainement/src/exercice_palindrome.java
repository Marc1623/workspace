import java.util.*;
public class exercice_palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
int u, d, c, m, dm; // unit�, dizaine, centaines, etc..
		
		System.out.println("Veuillez saisir un nombre à 5 chiffres");
		int nbre = scan.nextInt();
	
	
		while(nbre<10000 || nbre>99999){
			System.out.println("Veuillez saisir un nombre à 5 chiffres");
			nbre = scan.nextInt();
		}
		
		u = nbre%10;
		d = nbre/10%10;
		c = nbre/100%10;
		m = nbre/1000%10;
		dm = nbre/10000%10;		
		
		System.out.println(dm + "-" + m + "-" + c + "-" + d + "-" + u);
				
		if(dm == u && m == d)
			System.out.print("Ce nombre est un palindrome");
		else
			System.out.print("Ce nombre n'est pas un palindrome");


	}

}
