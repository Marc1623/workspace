package CC1;

public class CompteCourant extends BankAccount{

	
	
	public CompteCourant(Client owner, int montant) {
		super(owner, montant);
		
	}
	
	public void transfert (int montant , BankAccount compteRecepteur){

		super.montant = super.montant - montant;
		compteRecepteur.montant = compteRecepteur.montant + montant;
		if( compteRecepteur instanceof CompteCourant ){
			System.out.println("transfère sur compte courant");
		}
		
	}

	public void withdrawMoney (int retrait){
		super.montant = super.montant - retrait;
		System.out.println("vous avez mtn sur votre compte : "+ super.montant);
	}
	
	public void ajoutdargent (int ajout){
		super.montant = super.montant + ajout;
		System.out.println("vous avez mtn sur votre compte : "+ super.montant);
	}
	
	
	
}
