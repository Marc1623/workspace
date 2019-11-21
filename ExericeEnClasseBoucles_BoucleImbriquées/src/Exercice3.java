import java.util.*;
public class Exercice3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner (System.in);
		
		int nbchiffre=10;
		int max=0;
		int num=1;
		int saisi;
		
		
		for (int i=0; i<nbchiffre; i++){
			
			do{
			
				System.out.print("Chiffre"+num+" : ");
				saisi=scan.nextInt();
					
			}while(saisi<max);
			
			max=saisi;
			num++;		
		}
		
		
System.out.println("programme terminé");
	}

}
