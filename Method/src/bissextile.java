import java.util.*;
public class bissextile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("saisir une ann�e");
		int annee = scan.nextInt();
		
		boolean resultat;
		
		resultat = estbis(annee);
		
		
		if (resultat == true)
			System.out.println("l'ann�e est bissextile");
		else
			System.out.println("l'ann�e n'est pas bissextile");
		
	}
	

	
	
	public static boolean estbis (int annee){
		
		
		boolean bis;
		
		
		
		if (annee%4==0) {
			if (annee%100==0) {
				if (annee%400==0) {
					bis = true;
				}
				else
					bis = false;
				}
			else 
				bis = true;
			}
			else
				bis = false;
		
		return bis;
		
	}
	
	
	
	
		

}
