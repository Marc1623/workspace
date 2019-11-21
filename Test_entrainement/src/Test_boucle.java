import java.util.Scanner;


public class Test_boucle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int somme =0;
		int nombre ;
		int cpt=0;
		
		while(somme<100){
			System.out.println("entrez un nombre");
			nombre= scan.nextInt();
			somme+=nombre;
			cpt=cpt+1;
			//cpt+=1
			//cpt++;
			//++cpt;
			}
		
		System.out.println("somme obtonue : "+somme);
		System.out.println("compteur : "+cpt);
		

	}

}
