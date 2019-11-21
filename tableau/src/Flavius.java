import java.util.*;
public class Flavius {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int nbrePersonne;
		int p = 0;
		int cpt = 0;
		int nbreMort=0;
		System.out.print("Combien de personnes ? ");
		nbrePersonne=scan.nextInt();
		System.out.print("Compteur de pas d'élémination ? ");
		p=scan.nextInt();
		System.out.println();
		
		int []t;
		t = new int[nbrePersonne];
		
		
		
		for(int i=0; i<t.length; i++){
			
			t[i]=i+1;
		}
		
		
		while (nbreMort < nbrePersonne-1){
			
			for(int i=0 ; i< t.length ; i++){
				
				if(t[i] != 0)
					cpt++;
				
				if(cpt == p){
					t[i]= 0;
					cpt = 0;
					nbreMort++;}
			}
			
		}
		
		
		for(int i=0; i<t.length; i++){
			System.out.println(t[i]);
		}
		
		
		
	}

}
