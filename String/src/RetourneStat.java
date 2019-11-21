import java.util.*;
public class RetourneStat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		int nboccurence;
		String ch1 = "l'alphabet est chouette et coquet";
		
		String chercher;
		System.out.print("Mot à chercher : ");
		chercher = scan.next();
		
		nboccurence = occurence(ch1 , chercher);
		System.out.println("");
		System.out.println(nboccurence + " occurences");
	}
	
	public static int occurence (String ch1, String chercher){
		int cpt = 0;
		int indice=0;
			while(ch1.indexOf(chercher)> 0){
				cpt++;
				indice+= (ch1.indexOf(chercher));
				ch1 = ch1.substring((ch1.indexOf(chercher))+chercher.length());
				System.out.print(indice + " - ");
				indice+= chercher.length();
				
			}
			
		return cpt;
	}

}
