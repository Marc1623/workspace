package KarlaGarfield;

public class Sweater extends Clothing {

	private char taille;
	private boolean colroule;
	
	
	public Sweater (String collection,double prix, char taille,boolean colroule ){
		
		this.setCollection(collection);
		this.setPrix(prix);
		this.taille = taille;
		this.colroule = colroule;
	}
	
	public String sell(){
	return "vous avez acheté pour "+ this.getPrix();
	
	}
}
