import java.util.Scanner;


public class SwitchExerciceClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mois;
		int nbjourmois;
		Scanner input = new Scanner(System.in);
		
		System.out.println("entrer un mois entre 1 et 12 : ");
		mois= input.nextInt();
		
		switch(mois) {
		case 1 : // janvier
			nbjourmois=31;
			break;
		case 2 :
			nbjourmois=28;
			break;
		case 3: 
			nbjourmois=31;
			break;
		case 4: 
			nbjourmois=30;
			break;
		case 5: 
			nbjourmois=31;
			break;
		case 6: 
			nbjourmois=30;
			break;
		case 7: 
			nbjourmois=31;
			break;
		case 8: 
			nbjourmois=31;
			break;
		case 9: 
			nbjourmois=30;
			break;
		case 10: 
			nbjourmois=31;
			break;
		case 11: 
			nbjourmois=30;
			break;
		case 12: 
			nbjourmois=31;
			break;
		default:
			nbjourmois=0; 
			
			
	// input.nextInt().charAt(); (inscrire une caractère)			
		
		}
		

	}

}
