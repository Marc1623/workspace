import java.util.*;
public class SwitchExercice3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int jour=0, mois=0, annee=0, lendemain=0, nbjourmois=0;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Veuillez entrer le jour : ");
			jour= input.nextInt();}
		while(jour < 1 || jour > 31 );
			
		while ( mois < 1 || mois > 12 ){
			System.out.println("veuillez entrer le mois entre 1 et 12");
			mois= input.nextInt();}
		
		System.out.println("Veuillez entrer l'annee : ");
		annee= input.nextInt();
		
		
		
		switch(mois){
		
		case 1 : 
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			nbjourmois = 31;
			break;
			
		case 4 : 
		case 6 :
		case 9 :
		case 11 :
			nbjourmois=30;
			break;
		}
			
		
		
		if(jour<nbjourmois){
			lendemain = jour+1;
			System.out.println("la date du lendemain est le " + lendemain +"."+ mois+"."+annee);}		
		
		
	}

}
