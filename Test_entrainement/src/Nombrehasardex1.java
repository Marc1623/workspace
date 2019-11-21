import java.util.Scanner;


public class Nombrehasardex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Math.random()     retourne un double entre 0 et 1 (n.compris)
		// par exemple : 0.78459 ou 0.554789  		[0,1)	 0 compris 1 pas
		
		Scanner input = new Scanner(System.in);
		
		int nombre;
		int devine;
		
		nombre = (int)(Math.random()*10);
		
		
		System.out.println("devinez le nombre entre 0 et 9 : ");
		devine = input.nextInt();

		
		while ( nombre != devine || devine<0 || devine>10){
			System.out.println("Faux ! Réessayé entre 0 et 9: ");
			devine = input.nextInt();}
		
		
		System.out.println("Bravo ! Vous avez gagné ! Le nombre était " + nombre);
		
	}

}
