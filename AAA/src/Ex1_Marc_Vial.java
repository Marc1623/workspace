import java.util.*;
public class Ex1_Marc_Vial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Marc Vial
		
		
		
		int []tab = {-1,0,1,2,3,4,5};
		Scanner scan = new Scanner (System.in);
		int etageChercher=0;
		int destination=0;
		
		System.out.println("Appel de l'ascensseur à l'étage : ");
		etageChercher=scan.nextInt();
		appelAscenseur(tab,etageChercher);
		
		System.out.println();
		
		System.out.print("Etage de destination : ");
		destination=scan.nextInt();
		etageDestination(tab,etageChercher, destination);
		do{
			
		
		System.out.println("Appel de l'ascensseur à l'étage : ");
		etageChercher=scan.nextInt();
		appelAscenseur(tab,etageChercher);
		
		System.out.println();
		
		System.out.print("Etage de destination : ");
		destination=scan.nextInt();
		etageDestination(tab,etageChercher, destination);
		
		}while(etageChercher != -1);
	}
	
	public static void appelAscenseur (int []x, int v){
		
		for(int i=0; i<v+1; i++){
			System.out.println("Ascenseur à l'étage :" + i);
		}
		System.out.print("prise en charge de la perosnne à l'étage " + v);
	}
	
	public static void etageDestination(int[]tab,int etageChercher, int destination){
		
		for(int i=etageChercher; i+1>destination; i--){
			System.out.println("Ascenseur à l'étage :" + i);
		}
		System.out.println("décharge de la personne à l'étage " + destination);
		
	}
	
	
	
	

}
