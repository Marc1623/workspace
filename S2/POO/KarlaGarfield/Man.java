package KarlaGarfield;

public class Man extends Model{

	private Trousers pantalon;
	private Sweater pull;
	private Shoes chaussures;
	
	//("Brad", 27, comfortable, classic, casual)
	
	public Man (String prenom, int age,  Sweater pull ,Trousers pantalon,Shoes chaussures  ){
		
		this.setprenom(prenom);
		this.setage(age);
		this.pull=pull;
		this.pantalon =pantalon;
		this.chaussures = chaussures;
	}
}
