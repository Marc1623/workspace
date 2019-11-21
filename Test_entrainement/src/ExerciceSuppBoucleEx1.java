import java.util.*;
public class ExerciceSuppBoucleEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int nbterme, operateur=0, diviseur=1;
		double total=0.0;
		
		System.out.print("Entrez le nombre de termes : ");
		nbterme=scan.nextInt();
		
		for(int i=1; nbterme>i ; i++);{
			
			
			operateur = (operateur + 1)%2;
		if(operateur==0){
			total-=  (4.0/diviseur);
			diviseur = diviseur + 2;}
		else 
			total+=  (4.0/diviseur);
			diviseur = diviseur + 2;
		
			
		}
		
		System.out.print("Valeur de PI avec "+nbterme+" terme : "+total );
	}

}
