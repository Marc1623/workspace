package Yogurt;

public class BifidusYogurt extends Yogurt{

	public BifidusYogurt (String taste){
		super(taste);
		
	}
	
	public int getEnergy(){
		if (this.getoutOfDate())
			return 10;
		else 
			return 30;
	}
}
