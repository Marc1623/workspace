import java.util.*;

public class Anneebisextile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int annee;
		String message;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrer votre annee : ");
		annee = input.nextInt();
		
		if (annee%4==0) {
			if (annee%100==0) {
				if (annee%400==0) {
					message = "anne bi";
				}
				else
					message = "annee non-bi";
				}
			else 
				message ="annee bi";
			}
			else
				message ="annee non-bi";
		
			System.out.println(message);
	}
}
