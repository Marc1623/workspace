package ExerciceVoiture;
import java.util.*;
public class Moteur {
	
	private String marque ;
	private int cylindre;
	private int km;
	
	public void allumer(){
		System.out.println("allumer moteur");
	}
	public void augmenterTM(){
		System.out.println("augmenterTM");
	}
	public void diminuerTM(){
		System.out.println("DiminuerTM");
	}
	public void arreter(){
		System.out.println("arreter moteur");
	}
	
	public Moteur (String marque, int cylindre, int km){
		this.marque = marque;
		this.cylindre=cylindre;
		this.km=km;
	}

}
