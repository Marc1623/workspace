import java.util.*;
public class Occurence_Mot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ecrivez vos mots : ");
		String chaineDeMots = scan.nextLine();
	
		String exemple = "Une des r�gles de base pour qu�un r�f�rencement de pages Web fournisse des r�sultats int�ressants lors d�une recherche via un moteur de recherche consiste � s�assurer que des mots-cl�s, introduits dans l�en-t�te des pages Web, soient utilis�s dans le contenu de la page Web.";
		
		String [] chaineTab = chaineDeMots.split(",\\s");
		String [] exempleTab = exemple.split(" |\\.|\\, |\\'");
		
		for (int i = 0; i < chaineTab.length; i++) {
			System.out.println(chaineTab[i]);
		}
		
		for (int i = 0; i < exempleTab.length; i++) {
			System.out.println(exempleTab[i]);
		}
		
		int cpt=0;
		for (int i = 0; i < chaineTab.length; i++) {
			for (int j = 0; j < exempleTab.length; j++) {
				if (exempleTab[j].equals(chaineTab[i])) {
					cpt++;
					}
			}
			System.out.println(chaineTab[i]+" : "+cpt);
			cpt=0;
		}

	}

}
