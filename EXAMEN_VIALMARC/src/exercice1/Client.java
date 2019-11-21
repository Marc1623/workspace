package exercice1;


public class Client {

	private String nom;
	private String prenom;
	private int credit;
	
	public Client(String nom, String prenom, int credit){
		
		this.nom=nom;
		this.prenom=prenom;
		this.credit=credit;
		
	}
	
	 public void recharger (int montant)throws HeureLimiteExeption{
	       if (montant<0){
	            throw new HeureLimiteExeption();}
	       if(this.credit>500){
	    	   throw new HeureLimiteExeption();}
	       else{
	            System.out.println("votre carte est rechargé de"+ this.credit+montant);
	        }
	 }
	 
	 public void acheter (Ouvrage ouvrage){
		int nbexepl;
		 this.credit = this.credit - ouvrage.getPrix();
		 nbexepl = ouvrage.getNbExemplaire()-1;
		 ouvrage.getNbExemplaire() = nbexepl;
	 }
	 
	 public String toString (){
			
			return "ile client "+this.nom+" " + this.prenom+" possède " + this.credit;
		}
	 
	 
	        
	 
}
