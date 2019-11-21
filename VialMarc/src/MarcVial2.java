import java.util.*;
public class MarcVial2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]loto = {{0, 17, 0, 32, 40, 0, 64, 0, 84}, 
				{5, 0, 26, 34, 0, 52, 0, 78, 0},
				{0, 18, 27, 0, 49, 0, 65, 0, 90}} ;
	int nbCoups=0 ;
	
	
	affiche(loto);
	
	// cr�er la m�thode affiche() d�affichage de la carte  

//- �crire une m�thode joue() qui effectue des tirages 
//jusqu'� ce que tous les nombres de la grille aient �t� 
//tir�s et qui retourne le nombre de chiffres qu�il a 
//fallu tirer jusqu�� ce que le jeu se termine
//
	// - dans cette m�thode, vous �crirez les diff�rentes
	// actions avec des m�thodes
	// 	   	- tirage() pour tirer un nombre entre 1 et 90,
//	  diff�rent � chaque fois (car un nombre
//	  tir� ne peut plus �tre propos� par le crieur
	//  		- verifieNombreTire() qui v�rifie si le nombre			
	//		tir�  appara�t sur la carte
	
	nbCoups = joue(loto) ; 		
	
	System.out.println("Vous avez gagn� apr�s " + nbCoups + " tirages.") ;
	}
	
	
	
	public static void affiche(int[][] x) {

		for (int i = 0; i < x.length; i++) {
			System.out.println();

			for (int j = 0; j < x[0].length; j++) {

				System.out.print(x[i][j] + " \t ");
			}
		}
		System.out.println();
	}
	
	
	
	public static int joue(int [][]v){
		int cpt =15;
		int nbcoup=0;
		do{
			for(int i=0 ; i< v.length;i++){
				for (int j=0 ; j<v[0].length;j++){
					tirageNombre();
					verifieNombre(v);
					++nbcoup;
				}
			}
			cpt--;
		}while (cpt==0);
		return nbcoup;
	}
	
	
	
	
	public static int tirageNombre(){
		int nombre;
		int t[] = new int [27];
		
		nombre = (int) (Math.random()*90)+1;
		while (t[nombre]!= 0)
		if(t[nombre]==0)
			nombre = (int) (Math.random()*90)+1;
			else
				t[nombre]=0;
		
		return nombre;
	}
	
	
	
	public static void verifieNombre(int [][]v){
		
		for(int i = 0 ; i < v.length;i++){
			for (int j=0; j<v[0].length;j++){
				
				if(v[i][j] == tirageNombre()){
					v[i][j]=0;
				}		
			}
		}	
	}
	
}
