import java.util.*;

public class MonPremierCodeSource {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombre, nombre2, resultat;
		
		// Mise en place du m�canisme qui �coute ce qui vient du clavier
		// Cette manipulation est faite une seule fois avant la premi�re saisie
		Scanner saisie = new Scanner(System.in);
		
		// Maintenant le programme est pr�t � interagir avec l'utilisateur
		// nombre = saisie.nextInt() ;
		// nombre2 = saisie.nextInt() ;
		// Probl�me : pas d'interction avec l'utilisateur
		
		// Afficher � l'utilisateur ce qu'il doit faire (entrer un nombre)
		// Je lui permet de saisir ce nombre
		System.out.println("veuillez saisir le 1er nombre:");
		nombre = saisie.nextInt() ;
		System.out.println("veuillez saisir le 2er nombre:");
		nombre2 = saisie.nextInt() ;
		
		resultat = nombre*nombre2 ;
		
		System.out.println("Le r�sultat est de " + resultat);
	
		
		
		
	}

}
