import java.util.*;
public class method_substring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int indexFin;
		int indexDebut;
		String ch1;
		
		System.out.print("Quelle mot ou phrase voulez vous ? ");
		ch1 = scan.next();
		System.out.print("depuis quelle position voulez vous commencer ? ");
		indexDebut = scan.nextInt();
		System.out.print("depuis quelle position voulez-vous arrêter ? ");
		indexFin = scan.nextInt();
		
				//	architecturale		3		4
		
		System.out.print(MySubString( ch1, indexDebut, indexFin));

	}
	
	public static String MySubString ( String ch1, int indexDebut, int indexFin){
		String sub="";
		for (int i = indexDebut; i < indexDebut + indexFin ;i++){
			sub+= ch1.charAt(i);
		}
		return sub;
	}

}
