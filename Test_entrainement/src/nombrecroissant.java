import java.util.Scanner;


public class nombrecroissant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,z;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("inscrire le premier nombre");
		x = scan.nextInt();
		
		System.out.println("inscrire le deuxième nombre");
		y = scan.nextInt();
		
		System.out.println("inscrire le troisième nombre");
		z = scan.nextInt();
		
		
		if(x<y && y<z ){
			System.out.println(" premier "+x+" deuxieme "+y+" troisieme "+z);}
		else
			if(x<z && z<y ){
				System.out.println(" premier "+x+" deuxieme "+z+" troisieme "+y);}
			else
				if(y<x && x<z){
					System.out.println(" premier "+y+" deuxieme "+x+" troisieme "+z);}
				else
					if(y<z && z<x){
						System.out.println(" premier "+y+" deuxieme "+z+" troisieme "+x);}
					else
						if(z<x && x<y){
							System.out.println(" premier "+z+" deuxieme "+x+" troisieme "+y);}
						else
							if(z<y && y<x){
								System.out.println(" premier "+z+" deuxieme "+y+" troisieme "+x);}
		

	}

}
