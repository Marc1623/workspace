import java.util.*;


public class ex6alternativimbriquee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int a;
		int b;
		int c;
		int sol1, sol2;
		int discr;
		
		System.out.print("entrez nombre a : ");
		a=scan.nextInt();
		System.out.print("entrez nombre b : ");
		b=scan.nextInt();
		System.out.print("entrez nombre c : ");
		c=scan.nextInt();
		
		    
		
		if(a != 0){
			discr = b*b-4*a*c;
			if (discr>0){
				sol1 = (int) (((-b) - Math.sqrt(discr))/(2*a));
				sol2 = (int) (((-b) + Math.sqrt(discr))/(2*a));
				
				System.out.println("2 solutions : "+ sol1 + "et " + sol2);
				
			}
			else 
				if (discr ==0){
					sol1 = -b/2/a;
					System.out.println("1 solutions double : "+ sol1);	
				}
				else
					System.out.println("pas de solutions");	
		}
		else
			System.out.println("Equation du premier degré !");
		
			

	}

}
