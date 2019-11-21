package main;

public class Wizard extends Hero {

	protected int mana;
	
	//getter1
	public int getMana (){
		 return this.mana;
	}
	
	//setter1
	public void SetMana (int mana) throws ArithmeticException  {
		if(this.mana < 0){
			throw new ArithmeticException();
			}
	}
	
	
	public Wizard(String name, int health, int xp) {
		super(name, health, xp);	
	}
	
	 public String toString (){
			
			return "Wizard "+this.name + ", "+this.health+ ", "+this.xp+ ", "+this.mana;
		}

}
