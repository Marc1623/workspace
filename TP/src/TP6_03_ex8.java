import java.util.*;
public class TP6_03_ex8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1*1 = 1
		//1*2 = 2
		//1*2*3= 6
		//1*2*3*4 = 24
		//1*2*3*4*5 = 120
		
		Scanner scan = new Scanner (System.in);
		
		int nb,resultat=1;
	do{
		System.out.print("combien de nombres");
		nb=scan.nextInt();
	}while(nb<1 || nb>5);
	
		for (int i = 1 ; i<=nb; i++){
			
				resultat = resultat*i;
		}
		System.out.print(resultat);

	}

}
