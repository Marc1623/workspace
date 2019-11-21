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
	
		String exemple = "Une des règles de base pour qu’un référencement de pages Web fournisse des résultats intéressants lors d’une recherche via un moteur de recherche consiste à s’assurer que des mots-clés, introduits dans l’en-tête des pages Web, soient utilisés dans le contenu de la page Web.";
		
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
