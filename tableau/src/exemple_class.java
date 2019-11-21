import java.util.*;
public class exemple_class {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner (System.in);
		
		int nbre;
		int [] vin;
		vin= new int[5];
		
		
		do {
			System.out.print("Numéro de vin choisi (entre 1 et 5 ou 0 pour sortir) ");
			nbre = scan.nextInt();
			
			if(nbre !=0)
				++vin[nbre-1]; //pour éviter l'exeption "hors limite"
		}while(nbre !=0);
		
		for(int i=0 ; i<5; i++){
			System.out.println(vin[i]);
		}

	}

}
