package exercice1;

public class LitteratureFrancais extends Ouvrage{

	
	private int siecle;
	
	
	public LitteratureFrancais(String auteur, String titre, int prix,
			int nbExemplaire, int siecle) {
		super(titre, auteur, prix, nbExemplaire);
		// TODO Auto-generated constructor stub
		this.siecle=siecle;
	}
	
	
	public String toString(){
		String affichage;
		affichage = super.toString();
		affichage = affichage + "ce qu'on veut afficher en plus";
		return affichage;
	}
}
