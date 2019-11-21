package Firm;

public class Hourly extends Employee {

	

	private double montantHeure;
	private int nbheure;
	
	public Hourly(String name, String adresse, String phone, double montant) {
		super(name, adresse, phone, montant);
		// TODO Auto-generated constructor stub
	}
	
	public double getPaie (){
		double paie;
		paie= this.nbheure*this.montantHeure;
		this.nbheure=0;
		return paie;	
	}
	
	public void addHours(int hours){
		nbheure = nbheure+hours;
	}
	
	
	
	
}
