package Exercice;

public class Gaufre {
	
	private String arome;
	private float poids;

	public Gaufre() {
	// Ceci est compil� automatiquement, pas besoin de l'�crire sauf si on veut initialiser qqch
		arome = "nature";
		poids = 500;
		//Par exemple l� notre arome est nature par d�faut
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
