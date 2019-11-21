
public class prixchoisirpluspetit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prix1, prix2, prix3, minimum;
		//saisie : hypothèse : 3 nombres distincts
		prix1=60;
		prix2=65;
		prix3=48;
		
		if (prix1 < prix2) {
			if(prix1 < prix3) {
				minimum = prix1 ;
			}
			else {
				minimum =prix3 ;
			}
		}
		else {
			if(prix2 < prix3){
				minimum = prix2 ;
			}
			else {
				minimum = prix3 ;
			}

	}
		System.out.print("le minimum est de : " + minimum);
		
	}
}
