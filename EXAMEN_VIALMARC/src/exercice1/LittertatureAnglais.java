package exercice1;

public class LittertatureAnglais extends Ouvrage{


	private String nomTraducteur;
	
	public LittertatureAnglais(String auteur, String titre, int prix,
			int nbExemplaire, String nomTraducteur) {
		super(titre, auteur, prix, nbExemplaire);
		// TODO Auto-generated constructor stub
		this.nomTraducteur=nomTraducteur;
	}
	
	
	public String toString(){
		String affichage;
		affichage = super.toString();
		affichage = affichage + "ce qu'on veut afficher en plus";
		return affichage;
	}
}
