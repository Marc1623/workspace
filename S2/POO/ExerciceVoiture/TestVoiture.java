package ExerciceVoiture;
import java.util.*;
public class TestVoiture {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//public Voiture (String marque, String couleur,int vitesse,int nbPer)
		//public Voiture (String marque,int vitesse,int nbPer)
		Voiture maVoiture;
		maVoiture = new Voiture("Mazda" , "bleu", 100, 4);
		
		maVoiture.demarrer();
		maVoiture.accelerer(20);
		maVoiture.accelerer(-20);
		

	}

}
