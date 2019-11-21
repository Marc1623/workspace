package CC1;

public abstract class BankAccount {

	private Client owner ;
	protected int montant;
	
	public BankAccount(Client owner, int montant) {
		
		this.owner = owner;
		this.montant=montant;
	}
	
	public void transfert (int montant, BankAccount compteRecepteur){
		
	}
}
