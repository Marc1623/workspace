import java.util.Scanner;


public class Nombrehasardex1bis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int nombre;
		int devine;
		
		nombre = (int)(Math.random()*10);
		
		
		System.out.println("devinez le nombre entre 0 et 50 : ");
		devine = input.nextInt();

		
		while ( nombre != devine || devine<0 || devine>50){
			System.out.println("Faux ! Réessayé entre 0 et 50 : ");
			if(devine<nombre)
				System.out.println("le nombre et le plus grand");
			else 
				System.out.println("le nombre et le plus petit");
			devine = input.nextInt();}
		
		
		System.out.println("Bravo ! Vous avez gagné ! Le nombre était " + nombre);
		
		

	}

}
