package exercice1;

public class Main {

	
	public static void main(String[] args) {
		
		Ouvrage ouvrage1 = new LitteratureFrancais ("Daniel Pennac","Au bonheur des ogres",20,5,20);
		Ouvrage ouvrage2 = new LitteratureFrancais ("Daniel Pennac","La fée carabine",30,4,20);
		Ouvrage ouvrage3 = new LittertatureAnglais ("Edgar Allan Poe","Histoires extraordiraire",15,3,"Baudelaire");
		Ouvrage ouvrage4 = new LitteratureFrancais ("Molière","l'Avare",10,2,17);
		Ouvrage ouvrage5 = new LitteratureFrancais ("John Lang","La couette de l'oubli",25,1,21);

		
		Client client1 = new Client("Vial","Marc",50);
		Client client2 = new Client("Monney","Christel",60);
		
		client1.acheter(ouvrage1);
		client1.acheter(ouvrage2);
		client1.acheter(ouvrage3);
		client1.acheter(ouvrage4);
		client1.acheter(ouvrage5);
		
		client1.toString();
		
		client2.acheter(ouvrage1);
		client2.acheter(ouvrage2);
		client2.acheter(ouvrage3);
		client2.acheter(ouvrage4);
		client2.acheter(ouvrage5);
		
		client2.toString();
		
		client1.recharger(100);
		client1.recharger(MAX_VALUE.CHF);
		
	}

}
