package Yogurt;

public class Yogurt {

	private boolean outOfDate;
	private int energy;
	private String taste;
	
	public boolean getoutOfDate (){
		return this.outOfDate;
	}
	public void setoutofdate(boolean info){
		this.outOfDate=info;
	}
	
	public String getTaste (){
		return this.taste;
	}
	
	public void setTaste(String taste){
		this.taste=taste;
	}
	
	
	public Yogurt (String taste){
		this.taste=taste;
		
	}
	
	public int getEnergy(){
		if (outOfDate)
			return 15;
		else 
			return 20;
	}
	
	public String toString(){
		return "Yogurt"+" "+outOfDate+" "+ getEnergy()+" "+taste;
	}
	
	
	
}
