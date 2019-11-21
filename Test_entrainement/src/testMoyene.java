import java.util.Scanner;


public class testMoyene {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float moyenne; 
		String message;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrer votre moyenn");
		moyenne = input.nextFloat();
		

		if (moyenne < 4.0){
			message = "vous êtes non-promu(e)" ;
		}
	
		else {					//obligatoirement ma moyenne est >=4
			if (moyenne<5.0){
				message ="vous etes promu(e)";
			}
			else{				//obligatoirement ma moyenne est > 5
				message ="vous avez une mention" ;
			}
		
		}

		System.out.println(message);
		
	}
}