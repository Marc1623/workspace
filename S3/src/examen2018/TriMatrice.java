package examen2018;

public class TriMatrice {

	private int nombre =0;
	private int [][] tableau;
	private int temp=0;
	private int index=0;
	
	public TriMatrice(int nombre) {
		this.nombre =nombre;
		tableau = new int [nombre][nombre];
		
		for(int i=0; i< tableau.length;i++) {
			for(int j=0; j< tableau[0].length;j++) {
				tableau[i][j] =(int)(Math.random()*99) + 1;
			}
		}
	}
	
	 public void affiche(){

	        for (int i=0;i<tableau.length;i++){
	        	System.out.println();
	        	for (int j=0; j<tableau[0].length;j++) {
	        		System.out.print(tableau[i][j]+"   ");
	        	}
	            
	        }

	        
	  }
	 
	 
	 public void triMatrice(){
		 int min =100;
		 
		 
		 for(int i=0; i<tableau.length; i++) {
			 for (int j=0; j<tableau[0].length;j++) {
				 
				 for(int k=1; k<(tableau.length*tableau.length)-i;k++) {
				//	 if(tableau[i][j])
				 }
				 
			 }
		 }
		 
		 System.out.println(min);
		 
	 }
	 
	 
	 
	 
}
