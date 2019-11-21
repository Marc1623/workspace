import java.util.*;
public class examen_intermédiare_ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int dispo= 0, heureDebut,duree;
		String autre;
		int heure = 8;
		int tab[]= new int [9];
		
		for(int i = 0 ; i<tab.length;i++){
			
			tab[i]= heure;
			heure++;
			
			System.out.println(tab[i]+"h-" +(tab[i]+1)+"h"+"\t"+ dispo);
			
			
			
		}
		
		do{
			System.out.println("Nouveau rendez-vous :");
			
			do{
				System.out.println("Heure de début (entre 8h et 16h) :");
				heureDebut= scan.nextInt();
			}while(heureDebut >16 || heureDebut<8);
			
			do{
				System.out.println("Durée (entre 1 et 7):");
				duree= scan.nextInt();
			}while(duree >7 || duree<1);
			
		
			System.out.println("Voulez-vous saisir un autre rendez-vous (o/n) ?");
			autre= scan.next();
			
			
		}while(autre != "n");
		

	}

}
