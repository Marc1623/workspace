import java.util.*;
public class palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nombre = 4566545;
		
		
		int []tab = conversionIntTab(nombre);
		System.out.println(estPalindrome(tab));
		
	//	boolean reponse = estPalindrome(nombre);

	}
	
	public static boolean estPalindrome(int []v){


		int j = v.length-1;
		
		for(int i=0; i<v.length/2;i++){
			if(v[i] != v[j]){
				return false;
			}
			j--;
		}
		return true;
		
	}
	
	
	//conntraitre la longeur du nombre nombre de positions significatives
	
	public static int nombrePositions (int n){
		int resultat=0;
		int cpt=0;
		do{
			n = n/10;
			cpt++;
			
		}while(n!=0);
	return cpt;
		
	}
	//allocation du tableau
	
	public static int[] alloueTab(int taille){
		int []tab = new int[taille];
		return new int [taille];
	}
	
	public static int[] conversionIntTab(int n){
		//appeler nombreposition
		// créer et allouer le vecteur
		// faire la boucle de conversion
		
		int taille = nombrePositions(n);
		int []tab = alloueTab(taille);    
		
		for(int i= tab.length-1;i<=0 ;i--){
			tab[i]= n%10;
			n/=10;
		}
		
		return tab ;		
	}
}
