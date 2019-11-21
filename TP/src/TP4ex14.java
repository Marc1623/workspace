import java.util.Scanner;


public class TP4ex14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		double val1=0,val2=0, resultat=0;
		String type;
		
		System.out.print("Entrez la première valeur : ");
		val1=scan.nextDouble();
		
		System.out.print("Entrez la seconde valeur : ");
		val2=scan.nextDouble();
		
		System.out.print("type de l'opération (+,-,*,/) : ");
		type=scan.next();
		
		switch(type){
			case "+" : 
				resultat = val1 + val2;
				break;
			case "-" :
				resultat = val1 - val2;
				break;
			case "*" :
				resultat = val1 * val2;
				break;
			case "/" :
				resultat = val1 / val2;
				break;
			}
		
		System.out.print("Cette opération a pour résultat : " + val1+" "+type+" "+val2+" = "+resultat );
		
		
		
	}

}
