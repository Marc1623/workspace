import java.util.Scanner;


public class bouclediviseur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		
		int nbdiviseur=0,nombre=0,cpt=1,divisible=0;
		
		
		System.out.print("veuillez inscrire un nombre : ");
		nombre = scan.nextInt();
		
		while (cpt<=nombre){
			
			divisible=nombre%cpt;
			cpt++;
			if(divisible==0){
				nbdiviseur++;
			}
			
			
		}
		System.out.print(nombre + " a "+ nbdiviseur +" diviseurs ");
	}

}
