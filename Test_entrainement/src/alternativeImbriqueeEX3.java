import java.util.*;

public class alternativeImbriqueeEX3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int nbheure;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("inscrire le nombre d'heure supp");
		nbheure = scan.nextInt();
		
		if(nbheure>40){
			System.out.println("votre prime est de 500 Frs");}
			else{
				if(nbheure>30 && nbheure<=40){
					System.out.println("votre prime est de 400 Frs");}
				else{
					if(nbheure>20 && nbheure<=30){
						System.out.println("votre prime est de 300 Frs");}
					else{
						if(nbheure>10 && nbheure<=20){
							System.out.println("votre prime est de 200 Frs");}
						else{
							System.out.println("votre prime est de 100 Frs");}
						
							
						}
					}
				}
				
		
		

	}
}

