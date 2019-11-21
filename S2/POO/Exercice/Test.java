package Exercice;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Gaufre g1;
		
		g1 = new Gaufre();
		
		g1.setArome("Vanille");
		
		Gaufre g2;
		
		g2 = new Gaufre();
		
		g2.setArome("Chocolat");
		
		Gaufre g3;
		
		g3 = new Gaufre();
			
		Gaufre g5;
		
		g5 = new Gaufre("Nutella", 700);
		
		affiche(g1);
		affiche(g2);
		affiche(g3);
		affiche(g5);
		
		
		g1.manger();
		
		affiche(g1);
				
	}
	
	public static void affiche(Gaufre g) {
		
			String arome = g.getArome();	
			float poids = g.getPoids();
			System.out.println("Gaufre à l'arome : " + arome + " et d'un poids en gramme de " + poids);
				
		}
	
	/*public static void manger(Gaufre g) {
		float poids = g.getPoids();
		
		poids = (poids-10);
		g.setPoids(poids);
		
		System.out.println("Nouveau poids : "+g.getPoids());
	}*/
	
	

}
