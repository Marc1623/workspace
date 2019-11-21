import java.util.*;
public class Agenda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		String[][] tableau = new String[9][2];
		int heure = 8;
		int heure1 = 9;

		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau[0].length; j++) {
				tableau[i][j] = "0";
			}
		}

		for (int i = 0; i < tableau.length; i++) {
			tableau[i][0] = heure + "h - " + heure1 + "h";
			heure++;
			heure1++;
		}

		agenda(tableau);
		plageHoraire(tableau);

	}

	public static void plageHoraire(String[][] tableau) {

		Scanner scan = new Scanner(System.in);

		int heureDebut = 0;
		int duree = 0;
		char rendezvous = 'x';

		do {
			System.out.println("Nouveau rendez-vous: ");
			do {
				System.out.println("Heure de début (entre 8h et 16h) : ");
				heureDebut = scan.nextInt();
			} while (heureDebut < 8 || heureDebut > 16);
			
				
				switch (heureDebut){
				case 8 : tableau[0][1]="1";
				break;
				case 9 : tableau[1][1]="1";
				break;
				case 10 : tableau[2][1]="1";
				break;
				case 11 : tableau[3][1]="1";
				break;
				case 12 : tableau[4][1]="1";
				break;
				case 13 : tableau[5][1]="1";
				break;
				case 14 : tableau[6][1]="1";
				break;
				case 15 : tableau[7][1]="1";
				break;
				case 16 : tableau[8][1]="1";
				break;
				}
			

				agenda(tableau);
				
			do {
				System.out.println("Durée (entre 1 et 7) : ");
				duree = scan.nextInt();
			} while (duree < 1 || duree > 7);

			do {
				System.out.println("Voulez-vous saisir un autre rendez-vous (o/n) : ");
				rendezvous = scan.next().charAt(0);
			} while (rendezvous != 'o' && rendezvous != 'n'
					&& rendezvous != 'N' && rendezvous != 'O');
		} while (rendezvous != 'n');
		if (rendezvous == 'n') {
			agenda(tableau);
		}

	}

	public static void agenda(String[][] tableau) {

		for (int j = 0; j < tableau.length; j++) {
			System.out.println();
			for (int j2 = 0; j2 < tableau[0].length; j2++) {
				System.out.print(tableau[j][j2]);
				System.out.print(" \t");
			}
		}
		System.out.println();
		System.out.println();
	}

}


