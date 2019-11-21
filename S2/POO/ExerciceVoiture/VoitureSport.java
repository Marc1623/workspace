import java.util.*;
package ExerciceVoiture;

public class VoitureSport extends Voiture {
	
	private boolean aileron;
	
	
	public void drifter (){
		if(this.getVitesse()>100)
			System.out.println("ma voiture drift");
		else
			System.out.println("vitesse insufisante");
	}
	// redéfinition - même signature mais on redéfinit le corps de la méthode
	public void accelerer (int DeltaVitesse) {
	
		moteurVoiture.augmenterTM();
		setVitesse(getVitesse() + (2*DeltaVitesse));
		System.out.println("vitesse voiture egal : "+ getVitesse());
	}
	// surcharge - le nom de la méthode est la même mais tout le reste change
	
	
	

}
