import java.util.*;

public class TP4ex11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int reprise=0,p10=0,argus=0,action=0,pv=0,modele=0;
		double remise=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("quel est le prix de la voiture");
		pv=input.nextInt();
		System.out.println("quel est la valeur ARGUS");
		argus = input.nextInt();
		
		
		System.out.println("si vous souhaitez le mod�le Fiesta tapper le num�ro 1");
		System.out.println("si vous souhaitez le mod�le Escort 3 portes tapper le num�ro 2");
		System.out.println("si vous souhaitez le mod�le Escort break tapper le num�ro 3");
		System.out.println("si vous souhaitez le mod�le Mondeo 4 portes tapper le num�ro 4");
		System.out.println("si vous souhaitez le mod�le Mondeo break tapper le num�ro 5");
		System.out.println("si vous souhaitez le mod�le Scorpio tapper le num�ro 6");
		System.out.println("si vous souhaitez le mod�le Windsurf tapper le num�ro 7");
		
		modele= input.nextInt();
		
		switch (modele){
		case 1 :
			action = 500;
			break;
		case 2 :
			action = 500;
			break;
		case 3 :
			action = 1000;
			break;
		case 4 :
			action = 800;
			break;
		case 5 :
			action = 1300;
			break;
		case 6 :
			action = 2000;
			break;
		case 7 :
			action = 1300;
			break;
		}
		
		System.out.println("votre action est de : " + action);
		
		System.out.println("est ce que votre v�hicule � plus de 10 ans ? 1 pour oui 2 pour non");
		p10 = input.nextInt();
		
		if(p10 == 1 ){
			reprise = 3000;}
			else
				if (p10 == 2 && argus<3000){
					reprise = argus;}
					else {
						reprise = 3000;}
		
		remise = (7.5/100)*pv;
		
		
		
		System.out.println("le prix net de votre voiture est de : "+ (pv-action-reprise-remise)+".-");
				
	}

}
