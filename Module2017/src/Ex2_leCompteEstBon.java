import java.util.*;
public class Ex2_leCompteEstBon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int but=0;
		int tab[]= new int [6];
		
		initializeRandom(tab);
		but=initializeNumberToReach();
		afficheNbres(tab, but);
		

	}
	public static int [] initializeRandom(int[] tab) {
		
		int [] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 25, 50, 75, 100};
		int temp=0;
		int x=1;
		int position =0;
		for (int i=0; i<6; i++){
			do {
				x = (int)(number.length*Math.random());
			}while(number[x]==0);
			temp =number[x];
			tab[position]=temp;
			position++;
			number[x]=0;
		}
		return tab;
		
	}
	
	public static int initializeNumberToReach(){
		
		int nbre = (int)(1000*Math.random()+100);
		
		return nbre;
	}
	
	public static void afficheNbres(int []tab, int but){
		System.out.println("proposed numbers : ");
		for(int i=0 ; i<tab.length;i++){
			System.out.print(tab[i]+" ");
		}
		System.out.println();
		System.out.println("number to reach "+but);
		
	/*	System.out.println("proposed numbers : ");
		System.out.println(initializeRandom(tab));
		System.out.println("number to reach");
		System.out.print(initializeNumberToReach());
	*/
		
		
	}		
		
}
	



