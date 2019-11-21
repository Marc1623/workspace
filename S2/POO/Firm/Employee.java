package Firm;

public class Employee extends StaffMember {

	private double montantMensuel;
	
	public Employee (String name, String adresse, String phone, double montant){
		
		super(name,adresse,phone);
		montantMensuel = montant;
	}
	
	public void setMontantMensuel(double montant){
		this.montantMensuel=montant;
	}
	public double getMontantMensuel(){
		return this.montantMensuel;
	}
	

	@Override
	public double pay() {
		
		return montantMensuel;
	}
	
	public String toString(){
		String affichage;
		affichage = super.toString();
		affichage = affichage + "\n Paid : "+ pay();
		return affichage;
	}
	
	
	
}
