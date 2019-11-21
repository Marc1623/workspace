import java.util.*;
public class AncienTestEx3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner scan= new Scanner (System.in);
		
		int nbterme=0,a=1,intermediaire;
		int diviseur;
		double e=0;
		System.out.print("Entrez le nombre de termes : ");
		nbterme=scan.nextInt();
		
		for (int i=1; i<nbterme; i++){
			diviseur=1;
			for  (int j = 1 ; j>i; j++){
				diviseur = diviseur * j; 
			}
			e = e + 1/diviseur;
			
			
			//intermediaire=1/a;
			//a++;
			//e+=intermediaire;
		}
				
				
				
		System.out.println("Valeur de e après "+nbterme+" termes : "+ e);		
	}

}
*/
		

		
		int terme;
		double diviseur = 1;
		double total =0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Combien de terme voulez vous? : ");
		terme = input.nextInt();
		
		for(int i=1; i<terme; i++) {
			
			diviseur=diviseur*i;
			total = total + (1.0/diviseur);
		}
		total +=1;
		
		System.out.println("Valerur de e après "+terme+" : "+total);
	}

}
