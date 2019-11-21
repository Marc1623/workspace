package KarlaGarfield;

public abstract class Clothing {

	
	private String collection;
	private double prix;
	
	
	public String sell(){
		return ("vous avez acheté pour "+ prix);
	}
	
	public void setCollection(String nomCollection){
		collection = nomCollection;
	}
	public String getCollection (){
		return collection;
	}
	
	public void setPrix(double montant){
		prix = montant;
	}
	public double getPrix(){
		return prix;
	}
}
