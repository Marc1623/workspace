package KarlaGarfield;

public class Skirt extends Clothing {

	private int taille;
	private final double taxe = 10/100;  // 10%
	
	public String sell(){
		return ("vous avez achet� pour "+ (this.getPrix()*taxe)+this.getPrix());
	}
}
