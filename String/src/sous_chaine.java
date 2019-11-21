import java.util.*;
public class sous_chaine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ch =  "bonjour";
		ch = ch.substring(0,3);
		
		System.out.print(ch);
		

	}
	
	public static String maCopy (String ch){
		String retour = "";
		
		for(int i=0 ; i< ch.length() ; i++){
			retour = retour + ch.charAt(i);
		}
		return retour;
	}

}
