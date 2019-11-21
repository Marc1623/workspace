import java.util.*;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
	
		String ch;
		System.out.println("que voulez vous achiffez ?");
		ch = scan.nextLine();
		
		for(int i = 0 ; i< ch.length(); i++){
			System.out.println(ch.charAt(i));
		}
		
		//-----------------------------------------------------------------------
		
		String ch1 = "bon";
		String ch2 = "jour";
		 ch1 = ch1+ch2;
		
		System.out.println(ch1);
		
		//-----------------------------------------------------------------------
		
		String ch4 = "bon"; 
		String ch5 = "jour";
		ch4 = ch4+ch5;
		
		String ch6 = "bonjour";
		
		if(ch6 == ch4)
			System.out.println("sont egaux");
		else
			System.out.println("ne sont pas egaux");
		//-----------------------------------------------------------------------
		
		
		if(ch4.equals(ch6))
			System.out.println("sont egaux");
		else
			System.out.println("ne sont pas egaux");
		
		//-----------------------------------------------------------------------
		
		String ch7 = "le lion qui ne court pas très vite est beau";
		String res;
		res = supprimeEspace(ch7);
		System.out.println (res);
		
		//-----------------------------------------------------------------------
		
		String cha ="Nicole";
		String chb ="nicole";
		
		
		boolean resultat = maComparaison(cha,chb);
		System.out.println(resultat);
		
		//------------------------------------------------------------------------
		
		
		
	}
	
	public static boolean maComparaison (String c1, String c2){
		
		if(c1.length() != c2.length())
			return false;
		
		for (int i=0 ; i< c1.length();i++){
			if(c1.charAt(i) != c2.charAt(i))
				return false;
		}
		
		return true;
	}
	
	public static String supprimeEspace (String ch7){
		
		ch7 = ch7.replaceAll(" ", "");
				
		
		return ch7;
	}

}
