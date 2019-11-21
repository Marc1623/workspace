import java.util.*;

public class AncienTestEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int p1=15,p2=20,p3=25,p4=25,p5=40;
		int numvin, nb1=0,nb2=0,nb3=0,nb4=0,nb5=0 ;
		int somme1=0, somme2=0, somme3=0, somme4=0,somme5=0, total;
		
		do{
			System.out.print("numéro du vin choisi : ");
			numvin=scan.nextInt();
			
			switch(numvin){
			case 1 :
				nb1++;
				break;
			case 2 :
				nb2++;
				break;
			case 3 :
				nb3++;
				break;
			case 4 :
				nb4++;
				break;
			case 5 :
				nb5++;
				break;
		}
			
		}while (numvin!=0);
		
		somme1=nb1*p1;
		somme2=nb2*p2;
		somme3=nb3*p3;
		somme4=nb4*p4;
		somme5=nb5*p5;
		
		System.out.println("vin 1 : "+nb1+" à "+p1+" Frs 	"+somme1 +" Frs ");
		System.out.println("vin 2 : "+nb2+" à "+p2+" Frs 	"+somme2 +" Frs ");
		System.out.println("vin 3 : "+nb3+" à "+p3+" Frs	"+somme3 +" Frs ");
		System.out.println("vin 4 : "+nb4+" à "+p4+" Frs 	"+somme4 +" Frs ");	
		System.out.println("vin 5 : "+nb5+" à "+p5+" Frs 	"+somme5 +" Frs ");
		
		total=somme1+somme2+somme3+somme4+somme5;
		System.out.print("Total : "+total+" Frs");
 
	}

}
