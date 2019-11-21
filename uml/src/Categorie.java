
public class Categorie {
	protected Plat plat;
	
	public Plat getPlat(){
		return plat;}
	public void setPlat(Plat plat){
		this.plat = plat;
		plat.setCategorie(this);}
}
