import java.util.*;
public class AncienTestEx2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int jet1=0,jet2=0,jet3=0;
		
		jet1 = (int) (Math.random()*6)  + 1 ;
		jet2 = (int) (Math.random()*6)  + 1 ;
		jet3 = (int) (Math.random()*6)  + 1 ;
		
		System.out.println("jet1 = "+ jet1);
		System.out.println("jet2 = "+ jet2);
		System.out.println("jet3 = "+ jet3);
		System.out.println("");
		
		if (jet1==jet2 && jet2==jet3 ){
			System.out.println("les 3 nombres sont égaux");}
		else{
			if(jet1==jet2 && jet1!=jet3){
				System.out.println("jet1 et jet2 sont paire");}
			else{
				if(jet2==jet3 && jet2!=jet1){
					System.out.println("jet2 et jet3 sont paire");}
				else{
					if(jet3==jet1 && jet2!=jet3){
						System.out.println("jet1 et jet3 sont paire");}
					else{
						if(jet1!=jet2 && jet2!=jet3 && jet1!=jet3){
							System.out.print("tous différents");}
		
					}
				}
			}
		}
		
		
		
		
			
					
			
		
		
		

	}

}
