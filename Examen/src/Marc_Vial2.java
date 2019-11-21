import java.util.*;
public class Marc_Vial2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner (System.in);
		
		int nbchiffre=10;
		int max=0;
		int num=1;
		int saisi=0;
		
		do{
			System.out.println("Entrer le nombre de tirages désirés (entre 1 et 20)");
			nbchiffre=scan.nextInt();
		}while (nbchiffre<1 || nbchiffre>20);
		
		for (int i=0; i<nbchiffre && saisi<1000; i++){
			
			do{
				
				saisi = (int) (Math.random()*1001) ;
				
				if(saisi>max){
					System.out.println("Identifiant : "+saisi);}
					
				
					
			}while(saisi<max);
			
			
			max=saisi;
					
		}
		
		
System.out.println("programme terminé");

		
		
		
		
	}

}
