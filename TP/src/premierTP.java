import java.util.*;
public class premierTP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nombre;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("saisir le nombre :");
		nombre=input.nextInt();
		
		if(nombre%100<50){
			nombre = nombre-nombre%100;}
			
			else
				nombre = nombre-nombre%100+100;			
		
		System.out.print("le nombre arrondi vaut : " + nombre);
	}

}
