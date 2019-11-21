import java.util.Scanner;


public class Cercle {
	//données
	private int x;
	private int y;
	private int r;
	
	
	// contructeur
	
	public Cercle(int x,int y,int z){
	 this.x = x ;
	 this.y = y;
	 this.r = z;		 
	}
	
	public Cercle(){
		
	}
	
	
	// geter + setter
	
	public int getx(){
		return x;
	}
	
	public int gety(){
		return y;
	}
	
	public int getr(){
		return r;
	}
	
	public void setx(int x){
		 this.x = x;
	}
	
	public void sety(int y){
		this.y = y;
	}
	
	public void setr(int r){
		this.r = r;
	}
	
	// méthodes
	
	public void affiche(){
		System.out.println("valeur de x : "+x);
		System.out.println("valeur de y : "+y);
		System.out.println("valeur de rayon : "+r);
		System.out.println("");
	}
	
	public double aire(){
		
		 return Math.PI*r*r;
	}
	
	public double perimetre(){
		
		return 2*Math.PI*r;
	}
	
	public void modifieRayon ( int valeur){
		
		r = valeur;
	}
	
	public void saisieClavier(){
		Scanner scan = new Scanner (System.in);
		
		System.out.println("entrer x : ");
		x = scan.nextInt();
		
		System.out.println("entrer y : ");
		y = scan.nextInt();
		
		System.out.println("entrer rayon : ");
		r = scan.nextInt();
		
	}
	
	public boolean estEgal(Cercle autre){
		
		if(this.x != autre.x)
			return false;
		if(this.y != autre.y)
			return false;
		if(this.r != autre.r)
			return false;
		
		return true;
	}
	
	

}
