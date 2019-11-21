import java.util.*;
public class TableauMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 2;
		modifieValeur(a);
		System.out.println(a);
		
		
		int [] tab = {1, 2, 3};
		
		affiche(tab);
		modifieTab(tab);
		affiche(tab);
	

	}
	
	public static void modifieTab(int[] v){
		for (int i=0; i<v.length; i++)
			v[i]=3;
	}

	public static void modifieValeur(int x){
		x=3;
	}
	
	
	public static void affiche(int[] v){
		for (int i=0; i<v.length;i++)
			System.out.print(v[i] + " ");	
		
		System.out.println();
	}
	
}
