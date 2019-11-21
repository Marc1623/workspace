import java.util.*;
public class MethodCalculTableau {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] tab = {1,2,3,4,5};
		
		affiche(tab);
		
		System.out.println(somme(tab));
		System.out.println(moyenne(tab));
	}
	
	public static void affiche(int[] v){
		for (int i=0; i<v.length;i++)
			System.out.print(v[i] + " ");	
		
		System.out.println();
	}
	
	public static int somme(int[] v){
		int total=0;
		 
		for(int i=0;i<v.length;i++)
			total+=v[i];
		return total;
	}
	
	public static double moyenne(int [] v){
		return (double) somme(v)/v.length;
	}

}
