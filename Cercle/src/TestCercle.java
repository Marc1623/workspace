import java.util.*;
public class TestCercle {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Cercle c;
		c = new Cercle(4,6,5);
		c.affiche();
		
		
		Cercle c1;
		c1 = new Cercle(); 
		c1.affiche();
		

		
		Cercle c2 = new Cercle();
		
		c2.saisieClavier();
		c2.affiche();
		
		
		boolean resultat = c.estEgal(c2);
		System.out.print(resultat);
		
		/*
		Cercle c2;
		c2 = new Cercle(); 
		
		c2.x = 4;
		c2.y = 6;
		c2.r = 3;
		
		c2.affiche();
		System.out.println("L'aire vaut : "+ c2.aire());
		System.out.println("le perimetre vaut : "+ c2.perimetre());
		*/
		
		
		
		
	}

}
