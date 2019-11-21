package exercice1;

public class Ouvrage {

	private String titre;
	private String auteur;
	private int prix;
	private int nbExemplaire;
	
	
			// setter
			public void setTitre (String titre){
				this.titre = titre;
			}
			// getter
			public String getTitre (){
				 return this.titre;
			}
			
			public void setPrix (int valeur){
				this.prix = valeur;
			}
			// getter
			public int getPrix (){
				 return this.prix;
			}
			
			public void setNbExemplaire (int valeur){
				this.nbExemplaire = valeur;
			}
			// getter
			public int getNbExemplaire (){
				 return this.nbExemplaire;
			}
			
			
			
		
	public Ouvrage(String auteur,String titre,int prix,int nbExemplaire){
		
		this.auteur = auteur;
		this.nbExemplaire =nbExemplaire;
		this.prix= prix;
		this.titre = titre;
	}
	
	public String toString (){
		
		return "ecrire texte a sortir";
	}
	
	
}
