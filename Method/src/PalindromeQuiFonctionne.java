import java.util.*;
public class PalindromeQuiFonctionne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int nombre = 123454321;
		int []tab= conversionIntToTab(nombre);
		System.out.println (estPalindrome(tab));
		
	
		affiche (tab);
		
		

	}

	public static boolean estPalindrome(int[]tab) {
		
		
		// tester le tableau avec une boucle
		int j=tab.length-1;
		for(int i=0; i<tab.length/2;i++) {
			if (tab[i]!=tab[j]) {
				return false;	   //si c'est pas un palindrome c'est faux
			}
			j--;	
		}
		return true; ////si c'est un palindrome c'est vrai
	}
	
	//connaitre la "longueur du nombre" nombre de postitons significative
	
	public static int nombrePositions(int n) {

		int cpt=0;
		
		do {
			n = n/10;
			cpt++;
		} while (n != 0);
		
		
		
		return cpt;
		
	}
	
	//allocation du tableau
	
	public static int[] alloueTab(int taille) {
		return new int [taille];
		
	}
	
	//faire la décompostion, palcer les nombre 
	
	public static int[] conversionIntToTab(int n) {
		//appel le nombre de postition
		int taille = nombrePositions(n);
		
		//créer et allouer le vecteur 
		int []tab = alloueTab(taille); // ou direct new int[taille]
		
		//faire la conversion
		for(int i =tab.length-1; i>=0; i--) {   //on remplie le tableau a l'envers
			tab[i] = n%10;
			n/=10;
		}
		
		return tab;
	}
		public static void affiche(int[]v)
		{
			for(int i=0; i< v.length; i++)
				System.out.print(v[i] + "");
		
	
	
		
	}
}
