package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Company {

	protected File myHeroes = new File (myHeroes);
	protected String nf = "\\Vial_Marc_Exa2019\\Data\\myHeroes.txt";
	
	protected Hero hero[];
	protected String name;
	
	public Compagny(String name){
		this.name = name;
	}
	
	public int getNbHeroes(){
		int cpt;
		for(int i=0; i<hero[].length; i++){
			cpt++;
		}
	}
	
	public void hire (File myHeroes){
		String ligne;
		BufferedReader reader = null;
		
		reader = new BufferedReader (new FileReader(nf));
		
		while ((ligne = reader.readLine()) != null ){
			System.out.println(ligne);
		}
		
	}
	
	
	
}

