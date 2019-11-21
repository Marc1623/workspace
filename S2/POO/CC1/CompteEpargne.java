package CC1;

public class CompteEpargne extends BankAccount {

	public CompteEpargne(Client owner, int montant) {
		super(owner, montant);
		// TODO Auto-generated constructor stub
	}
	
	public void transfert (int montant , BankAccount compteRecepteur){

		super.montant = super.montant - montant;
		compteRecepteur = compteRecepteur + montant;
	}
	
	
	
	
	
	
}
