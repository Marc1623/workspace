import java.util.*;
public class exempleboucle2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("combien de fois voulez vous passer dans la boucle ? ");
		int passageboucle=0,somme=0;
		
		passageboucle = scan.nextInt();
		
		while(somme<passageboucle){
			System.out.println("je suis dans la boucle while");
			somme++;
			}
		System.out.println("vous êtes passé : "+ somme);
		somme =0;
		
		
		
		do{	
			System.out.println("je suis dans la boucle do while");
			somme++;
			}
		while(somme<passageboucle);
		System.out.println("vous êtes passé : "+ somme);
		
		
		
		
		for (int i=0; i<=passageboucle; i++){
			System.out.println("valuer de i : " + i);
			System.out.println("je suis dans la boucle for");
			}
		System.out.println("vous êtes passé : "+ somme);
	}

}
