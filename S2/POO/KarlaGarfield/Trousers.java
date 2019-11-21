package KarlaGarfield;

public class Trousers extends Clothing {

	private int taille;
	private int longueur;
	
	//("Winter", 28000, 34,32) ;
	
	public Trousers (String collection, double prix, int taille, int longueur){
		
		this.setCollection(collection);
		this.setPrix(prix);
		this.taille = taille;
		this.longueur = longueur;
	}
}
