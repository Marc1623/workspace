import java.util.Scanner;


public class exerciceBoucleNombre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);

		int nombresaisi=1, max=0, min=100 ;
		double moyenne, somme=0,cpt=0;
		
		
		
		do{
			
			
			System.out.print(" inscrire valeur ");
			nombresaisi=scan.nextInt();
			somme+=nombresaisi;
			++cpt;
			
			if(nombresaisi>max){
				max=nombresaisi;}
			
			if(nombresaisi<min && nombresaisi!=0){
				min=nombresaisi;}
			
			}	
			while (nombresaisi!=0);
		
		cpt=cpt-1;
		
		System.out.println(moyenne=somme/cpt);
		System.out.println(max);
		System.out.println(min);
	}

}
