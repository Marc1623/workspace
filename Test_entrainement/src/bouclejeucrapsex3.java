
public class bouclejeucrapsex3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int des1, des2, resultat,cpt=0;
		
		des1 = (int) (Math.random()*6)  + 1 ;
		des2 =(int) (Math.random()*6)  + 1 ;
		
		System.out.println(des1);
		System.out.println(des2);
		
		resultat = des1 + des2 ;
		
		if(resultat == 7 || resultat == 11){
			System.out.println("victoire");}
			else
				if(resultat == 2 || resultat == 3 || resultat == 12){
					System.out.println("Perdu");}
				else
					while (resultat == 4 || resultat == 5 ||resultat == 6 ||resultat == 8 ||resultat == 9 ||resultat == 10 || cpt==7 ){
						
							des1 = (int) (Math.random()*6)  + 1 ;
							des2 =(int) (Math.random()*6)  + 1 ;
							System.out.println(des1);
							System.out.println(des2);
							
							resultat = des1 + des2 ;
							++cpt;
							System.out.println("Perdu");}
						
						
						
		
		
		
		                                    
		
	}

}
