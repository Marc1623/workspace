import java.util.*;
public class ExerciceSuppBoucleEx2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int nombre, resultat;
		System.out.println("Entrer la table à calculer ");
		nombre=scan.nextInt();
		while(nombre<2 || nombre>13){
			System.out.print("nombre entre 1 et 13");
			nombre=scan.nextInt();
		}
		
		for(int i = 0 ; i<nombre ; i++){
			
			resultat = nombre * i;
			System.out.println(nombre+" fois "+i+" égale "+resultat);
		}
		
		
		
		

	}

}
