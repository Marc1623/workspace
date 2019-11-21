package KarlaGarfield;

public abstract class Model {

	private String prenom;
	private int age;
	
	public void setprenom (String prenom){
		this.prenom = prenom;
	}
	public String getprenom(){
		return prenom;
	}
	
	public void setage (int age){
		this.age = age;
	}
	public int getage(){
		return age;
	}
	
}
