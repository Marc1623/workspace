import java.util.*;
public class neige {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String ch1 = "la neige du cheval est super froide";
		
		System.out.print(contientOrBlanc(ch1));

	}
	
	public static boolean contientOrBlanc (String ch1){
		String s = "neige";
		if (ch1.contains(s))
			return true;
		else
			return false;
			
	}

}
