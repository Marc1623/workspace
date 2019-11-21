import java.util.*;

public class Etudiant {
	
	// données
	
	public String nom;
	public String prenom;
	public double []note;
	public double moyenne;
	
	
	public Etudiant() {
		note = new double[2];
	
	}
	
	public Etudiant(int nbNote) {
		note = new double[nbNote];
		
	}
	
	public Etudiant(double []note) {
		this.note= new double[note.length];
		
		for(int i=0 ; i<note.length;i++){
			this.note[i] = note[i];
		}
	}
	
	public void saisieNotes(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Taille du tableau : "+note.length);
		double d;
		for(int i =0; i< note.length; i++){
			System.out.println("entrez la "+(i+1)+"e note:");
			
			 
		}
	}
	
	public double calculeMoyenne(double []note){
		
		
		return moyenne;
	}
	
	public void afficheInfos(){
		
		System.out.println("son nom est : "+nom);
		System.out.println("son prenom est : "+prenom);
		System.out.println("la moyenne est : "+moyenne);
		
	}

}
