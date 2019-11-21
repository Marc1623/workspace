package ExerciceVoiture;
import java.util.*;
public class Voiture {
	
	// attribut
	private String marque;
	private String couleur;
	private int vitesse;
	private int nbPer;
	protected Moteur moteurVoiture;
	
	// setter 
	
		public void SetXp (int xp) throws ArithmeticException {
			this.xp = xp;
		}
		
		// getter
		
		public int getVitesse (){
			 return this.vitesse;
		}
		
		
		// méthode d'instance
	public void accelerer (int DeltaVitesse) {
		moteurVoiture.augmenterTM();
		vitesse = vitesse + DeltaVitesse;
		System.out.println("vitesse voiture egal : " +vitesse);
	}
	
	public void ralentir () {
		moteurVoiture.diminuerTM();
	}
	public void demarrer () {
		moteurVoiture.allumer();
		System.out.println("la voiture démarre");
	}
	public void arreter () {
		moteurVoiture.arreter();
		System.out.println("la voiture s'arrête");
	}
	 
	// constructeur
	public Voiture (String marque, String couleur,int vitesse,int nbPer){
		this.marque= marque;
		this.couleur = couleur;
		this.vitesse = vitesse;
		this.nbPer = nbPer;
		this.moteurVoiture = new Moteur ("essence", 1500, 10);
	}
	public Voiture (String marque,int vitesse,int nbPer){
		this.marque= marque;
		this.couleur = "blanc";
		this.vitesse = vitesse;
		this.nbPer = nbPer;
		this.moteurVoiture = new Moteur ("essence", 1500, 10);
		
	}
	
	

}
