import java.util.*;
public class remplaceUnTerme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		
		String ch1;
		String remplacer;
		String remplacement;
		
		System.out.println("Saisir le mot : ");
		ch1 = scan.next();
		
		System.out.println("Caractère à remplacer : ");
		remplacer = scan.next();
		
		System.out.println("Caractère de remplacement : ");
		remplacement = scan.next();
		
		
		System.out.println(remplacecara(ch1, remplacer, remplacement ));
			

	}
	
	public static String remplacecara (String ch1, String remplacer, String remplacement){
		ch1 = ch1.replaceAll(remplacer, remplacement);
		
		return ch1;
	}

}
