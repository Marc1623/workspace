import java.util.*;
public class Mastermind {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/// fonction bonne exercice 

			int code[] = generation();

			System.out.println("faites une proposition");

			Scanner scan = new Scanner(System.in);

			int p1 = scan.nextInt();
			int p2 = scan.nextInt();
			int p3 = scan.nextInt();
			int p4 = scan.nextInt();
			int rouge = 0;
			int blanc =0;
			int proposition[] = { p1, p2, p3, p4 };

			for (int i = 0; i < 4; i++) {

				if (code[i] == proposition[i]) {

					rouge = rouge + 1;

				}
				else
				{
					for(int j=0;j<4;j++)
					{
					if(proposition[j]==code[i])	
					{
						blanc=blanc+1;
					}
						
						
					}
					
					
				}

			}
			imprimer(code, rouge, blanc);

		}

		public static int[] generation() {

			int tab[] = new int[4];

			boolean disponibilite[] = new boolean[8];

			for (int i = 0; i < 4; i++) {

				int alea = (int) (Math.random() * 7)+1;

				while (disponibilite[alea] == true) {
					alea = (int) (Math.random() * 8);
					disponibilite[alea] = true;
					

				}
				tab[i] = alea;
			}

			return tab;
		}

		public static void imprimer(int tab[], int rouge,int blanc) {
			System.out.println("il y a " + rouge + "rouge");
			System.out.println("il y a " + blanc+ "blanc");

			for (int i = 0; i < 4; i++) {
				System.out.print(tab[i]);
			}
		}
	}


