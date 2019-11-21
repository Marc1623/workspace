package Yogurt;

public class NonFatYogurt extends Yogurt{

	public NonFatYogurt (String taste){
		super(taste);
		
	}
	
	public int getEnergy(){
		if (this.getoutOfDate())
			return 8;
		else 
			return 10;
	}
}
