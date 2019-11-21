package main;


public class Hero {
	
	protected String name;
	protected int health;
	protected int xp;
	
	
	// Setter1
	public void SetXp (int xp)throws ArithmeticException  {	
	if(this.xp < 0){
		throw new ArithmeticException();
		}
	}
	
	
	
	//setter 2
	public void SetHealth (int health) throws ArithmeticException  {
		if(this.health < 0){
			throw new ArithmeticException();
			}
	}
	
	//setter 3
	public void SetName (String name){
		this.name = name;
	}
	
	
	// getter1
	public int getXp (){
		 return this.xp;
	}
	//getter 2
	public int getHealth (){
		 return this.health;
	}
	//getter3
	public String getName (){
		 return this.name;
		 }
	
	
	
	//constructor
	public Hero(String name, int health, int xp){
		this.health = health;
		this.name = name;
		this.xp = xp;
	}
	
	//méthode
	
	public int addXp (int amount) throws ArithmeticException {
		if(amount < 0)
			 throw new ArithmeticException();
		this.xp =this.xp + amount;
		return this.xp;
		 
	}
	
	

}
