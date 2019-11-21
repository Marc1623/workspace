package Firm;

public class Executive extends Employee{

	
	public Executive(String name, String adresse, String phone, double montant) {
		super(name, adresse, phone, montant);
		// TODO Auto-generated constructor stub
	}

	private double bonus;
	
	public void addBonus(double bonus){
		
	this.bonus= this.bonus + bonus;
	
	}
	
	@Override
	public double pay() {
		
		return this.getMontantMensuel()+bonus;
	}
	
	
	
	
	
}
