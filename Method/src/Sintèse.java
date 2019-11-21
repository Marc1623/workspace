
public class Sintèse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 2; 
		
		System.out.println(a); 
		
		modifieValeur(a); 
		
		System.out.println(a); 
		
		
		
		int[] tab = {1, 2, 3}; 
		
		
		affiche(tab); 
		
		modifieTab(tab); 
		
		affiche(tab);
		
		
		
		int[][] mat = {{1, 2, 3},{4,5,6},{7,8,9}}; 
		
		System.out.print(mat);
		
		affiche(mat); 

		modifieMat(mat); 

		affiche(mat);
		
		
		System.out.print(somme(tab));

		System.out.print(moyenne(tab));
	}


	public static double moyenne(int[] v){
		return (double)somme(v)/v.length ;
		//return 1.0*somme(v)/v.length ;
	}

	public static int somme(int[] v){
		int total = 0; 

		for (int i=0; i<v.length ; i++)
			total += v[i] ; 

		return total;
	}

	public static void modifieTab(int[] v){
		for (int i=0; i<v.length ; i++)
			v[i] = 3; 
	}

	public static void modifieValeur(int x){
		x = 3; 

	}


	public static void affiche(int[] v){
		for (int i=0; i<v.length ; i++)
			System.out.print(v[i] + " ");

		System.out.println();
	}
	
	public static void affiche(int[][] v){
		for(int i=0 ; i<v.length ; i++){
			System.out.println();
			for(int j=0; j<v.length ; j++){
				System.out.print(v[i][i] + "\t");
			}
		}
		
		
	}
	
	public static void modifieMat (int[][] v){
		for (int i=0; i<v.length ; i++){
			for(int j=0; j<v.length;j++){
				v[i][j] = 3; 
			}
		}
		
		
	}


}


