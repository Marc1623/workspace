import java.util.*;
public class inverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ch1= "Bonjour";
		
		monInversion(ch1);
		System.out.print(monInversion(ch1));
	}
	
	
	public static String monInversion(String ch){
		String retour = "";
		
		for(int i= ch.length()-1 ; i >=0;i--){
			retour +=  ch.charAt(i);
		}
		
		return retour;
	}

}
