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
	// red�finition - m�me signature mais on red�finit le corps de la m�thode
	public void accelerer (int DeltaVitesse) {
	
		moteurVoiture.augmenterTM();
		setVitesse(getVitesse() + (2*DeltaVitesse));
		System.out.println("vitesse voiture egal : "+ getVitesse());
	}
	// surcharge - le nom de la m�thode est la m�me mais tout le reste change
	
	
	

}
