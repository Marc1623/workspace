package KarlaGarfield;

public class KarlaGarfield {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shoes casual = new Shoes(41) ;
		Sweater comfortable = new Sweater("Winter", 35000, 'L', true) ;
		Trousers classic = new Trousers("Winter", 28000, 34,32) ;
		
		Man brad = new Man("Brad", 27, comfortable, classic, casual) ;
		
		Shoes high = new Shoes(36) ;
		Sweater sexy = new Sweater("Summer", 42000, 'M', false) ;
		/*Skirt mini = new Skirt("Summer", 32000, 32) ;
	
		Woman lily = new Woman("Lily", 25, sexy, mini, high) ;
		*/
		System.out.println(sexy.sell());
		System.out.println(comfortable.sell());
		//System.out.println(mini.sell());
	}
}
