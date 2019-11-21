package Exercice;

public class Gaufre {
	
	private String arome;
	private float poids;

	public Gaufre() {
	// Ceci est compilé automatiquement, pas besoin de l'écrire sauf si on veut initialiser qqch
		arome = "nature";
		poids = 500;
		//Par exemple là notre arome est nature par défaut
	}
	
	public void setArome(String arome) {
		this.arome = arome;
	}
	
	public void setPoids(float poids) {
		this.poids = poids;
	}
	
	public void manger() {
		poids -= 10;
	}
	
	
	public Gaufre(String arome, float poids) {
		// on peut initialiser l arome dans le constructeur directement
		}
	
	public String getArome(){
		return this.arome;
		}
	
	public float getPoids(){
		return this.poids;
		}

}
