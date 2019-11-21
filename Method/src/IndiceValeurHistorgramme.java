import java.util.*;
public class IndiceValeurHistorgramme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []tab = saisie();
		
		affichetab(tab);
		
		remplissageauto(tab);
		
		affichetab(tab);
		
		histogramme(tab);
		
	}
	
	public static int[] saisie(){
		
		
		Scanner scan = new Scanner (System.in);
		System.out.print("taille du tableau ? ");
		int n;
		n = scan.nextInt();
		
		int[] v = new int[n];
		return v;
		
	}
	
	public static void affichetab (int [] v){
		for(int i=0; i < v.length ;i++){
			System.out.print(v[i]+" ");
			
		}
		System.out.println("");
	}
	
	
	public static int[] remplissageauto(int[] v){
		int jet;
		for(int i=0; i<v.length;i++){
			v[i]= (int) (Math.random()*20)+1;
		}
		return  v;
	}
	
	public static void histogramme (int[] v){
		
		System.out.print("Indice\tValeur\tHistogramme");
		System.out.println();
		
		for(int i=0; i<v.length; i++){
			System.out.print(i+"\t"+ v[i]+ "\t") ;
			
			etoiles(v[i]);
			System.out.println();
		}
	}
	
	public static void etoiles (int ValeurTableau){
		
		for(int i=0; i<ValeurTableau;i++){
			
			System.out.print("*");
		}
	}
	

}
