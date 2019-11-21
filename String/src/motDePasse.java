import java.util.*;
public class motDePasse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		String ch = "mcsg!arcial98??";
		
		if (estValide(ch))
			System.out.print("Valide");
		else
			System.out.print("Non valide");
		

	}
	public static boolean estValide(String ch){
		boolean unChiffre = false, unSpecial = false, unChar = false;
		int cptChiffre = 0, cptSpecial = 0, cptChar = 0;
		
		if (ch.length()< 10)
			return false;
		if (ch.length()> 20)
			return false;
		
		for (int i=0; i<ch.length() ; i++){
			if (ch.charAt(i)>= '0' && ch.charAt(i)<= '9'){
				unChiffre = true;
				cptChiffre++;
			}
			if (ch.charAt(i)== '?' || ch.charAt(i)== '!'|| ch.charAt(i)== '$'){
				unSpecial = true;
				cptSpecial++;
			}
			
			if (ch.charAt(i)>= 'a' && ch.charAt(i)<= 'z'){
				unChar = true;
				cptChar++;
			}
		}
		
		if (!unChiffre)
			return false;
		
		if (!unSpecial)
			return false;
		
		if (!unChar)
			return false;
		
		if (cptChiffre + cptSpecial + cptChar != ch.length())
			return false;
		
		return true;
	}

}
