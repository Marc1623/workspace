import java.util.*;
public class Ex2_Marc_Vial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Marc Vial
		
		Scanner scan = new Scanner (System.in);
		int numColonne=0;
		double moyenneSansMinMax=0;
		double [][]dataVehicle = data();
		double []kmjour = new double [dataVehicle.length];
		affiche(dataVehicle);
		
		int numColonnes = saisieColonne(dataVehicle);
		
		double moyenne=calculeMoyennePonderee(dataVehicle,numColonnes);
		afficheMoyennePonderee(moyenne,numColonnes);
		
		kmjour = kmParJour(dataVehicle);
		afficheTab1D(kmjour);
		
		moyenneSansMinMax = calculeMoyenneSansMaxMin(kmjour,dataVehicle);
		System.out.println("la moyenne sans min ni max est de :"+ moyenneSansMinMax);
	}
	
	public static void afficheTab1D(double[] tab) {

		for (int i=0; i<tab.length; i++) {
			System.out.print(tab[i]+"\t");
		}	
	}
	
	public static double[][]data(){
		double [][]dataVehicle = {{1, 6, 12, 29.1, 0, 33}, //trajet 1
								  {2, 11, 15, -4.1, 0, 45}, //trajet 2
								  {2, 22, 27, 14.7, 2.1, 48},//trajet 3
								  {2, 11, 17, 47.3, 0.5, 41},//trajet 4
								  {3, 11, 21, 27.9, 0, 34},  // etc...
								  {4, 35, 62, 3.1, 6, 34},
								  {5, 10, 16, 27.4, 0.9, 39},
								  {7, 13, 21, 6.5, 0, 39},
								  {7, 69, 63, 6.4, 4.8, 66},
								  {7, 84, 69, 0, 7.9, 73},
								  {8, 65, 87, 12.8, 3.5, 45},
								  {9, 14, 28, 8.2, 0, 31},
								  {9, 2, 5, 35.5, 0, 32},
								  {9, 12, 18, 24.8, 7.3, 40},
								  {10, 11, 16, 1.1, 0, 43},
								  {10, 11, 16, 41.9, 4, 42},
								  {11, 13, 18, 1.6, 0, 42}} ;
		
		return dataVehicle ;
	}
	
	public static void affiche(double [][]data){
		System.out.print("Day"+ " \t " + " \t " +"km"+ " \t "+ " \t "+
						"Min"+ " \t "+ " \t " + "kWh/100"+ " \t " + "1/100"+ " \t "+ " \t " + "av.spped");
			for (int i = 0; i < data.length; i++) {
				System.out.println();

				for (int j = 0; j < data[0].length; j++) {

					System.out.print(data[i][j] + " \t "+ " \t ");
				}
			}
		}
	
	public static double calculeMoyennePonderee(double[][]data, int numcolonne){
		double moyenne=0;
		double somme=0;
		double sommekm=0;
		for(int i = 0; i<data.length;i++){
			somme+= (data[i][numcolonne])*(data[i][2]);
		}
		for(int j=0; j<data.length;j++){
			sommekm+= data[j][2] ;
		}
		moyenne= somme/sommekm;
		return moyenne;
		
	}
	
	public static int saisieColonne(double [][]data){
		Scanner scan = new Scanner (System.in);
		int numColonne=0;
		
		do{
		System.out.println();
		System.out.println("Quelle colonne voulez-vous traiter ?");
		System.out.println("3 pour la consommation électrique");
		System.out.println("4 pour la consommation d'essence");
		numColonne = scan.nextInt() ;
		}while(numColonne != 3 && numColonne != 4 );
		return numColonne+1 ;
	}
	
	public static void afficheMoyennePonderee (double moyenne,int colonne){
		
		if(colonne==4)
			System.out.println("La moyenne pondéré de la consommation électrique est de : "+ moyenne);
		if (colonne==5)
			System.out.println("La moyenne pondéré de la consommation d'essence est de : "+ moyenne);
	}
	
	public static double[] kmParJour(double [][]data){
		double []kmjour = new double [data.length];
		
		
		for(int i = 0; i<data.length;i++){
			kmjour[i]= data[i][2];
		}
		return kmjour;
		
	}
	
	public static double calculeMoyenneSansMaxMin(double []kmjour, double[][]data){
		double max=0;
		double min=99999999;
		double moyenne=0.0;
		for (int i=0; i<kmjour.length;i++){
			if (kmjour[i]>max)
				max=kmjour[i];
			if(kmjour[i]<min)
				min=kmjour[i];
			
		//plus le temps...	
		//enlever le max et le min de la matrice data et ensuite faire la moyenne
			
			
		}
		return moyenne;
	}
	
	
}




