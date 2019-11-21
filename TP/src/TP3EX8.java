import java.util.Scanner;


public class TP3EX8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double RevCadastral, DroitEnregistrement, PV, notaire=0;

		Scanner scan = new Scanner(System.in);
		System.out.println("inscrire le Prix de vente de l'immeuble");
		PV=scan.nextDouble();
		
		System.out.println("inscrire le revenu cadstral");
		RevCadastral = scan.nextDouble();
		
		
		if(RevCadastral>30000){
			DroitEnregistrement=PV*(12.5/100);
			System.out.println("Le montant du droit d'enregistrement vaut : "+DroitEnregistrement);}
		else{
			DroitEnregistrement=PV*(6/100);
			System.out.println("Le montant du droit d'enregistrement vaut : "+DroitEnregistrement);}
		
		
		
		
		
		if(PV<=30000){
			notaire=PV*(4.56/100);}
		else
			if(PV>300000 && PV<700000){
				notaire=13680+(PV-300000)*(2.85/100);}
			else
				if(PV>700000 && PV<1200000){
					notaire=25080+(PV-700000)*(2.28/100);}
				else
					if(PV>1200000 && PV<1825000){
						notaire=36480+(PV-1200000)*(1.71/100);}
					else
						if(PV>1825000 && PV<2575000){
							notaire=47167+(PV-1825000)*(1.14/100);}
						else
							if(PV>2575000 && PV<10075000){
								notaire=55717+(PV-2575000)*(0.57/100);}
							else
								if(PV>10075000){
									notaire=98467+(PV-10075000)*(0.057/100);}
		
		System.out.println("les frais de notaire sont de : " + notaire);
		System.out.println("Les frais d'accesoire sont de 6000");
		
		
	}
	

}
