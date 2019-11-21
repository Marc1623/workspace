package main;

public class Dwarf extends Hero{

	protected int strength;
	
	//getter
		public int getStrength (){
			 return this.strength;
		}
		
	//setter2
		public void SetStrength (int strength) throws ArithmeticException  {
			if(this.strength < 0){
				throw new ArithmeticException();
				}
		}
		
	
	public Dwarf(String name, int health, int xp) {
		super(name, health, xp);
		
	}
	
	 public String toString (){
			
			return "Dwarf "+this.name + ", "+this.health+ ", "+this.xp+ ", "+this.strength;
		}

}
