
public class PlusPetiteValeurDes3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val1 = 4;
		int val2 = 6;
		int val3 = 2;
		
		int res ;
		
		res = minimum(val1, val2, val3);
		
		System.out.print(res);

	}
	
	
	public static int minimum (int nombre1 , int nombre2 , int nombre3){
		
		int min;
		
		if (nombre1<nombre2 && nombre1<nombre3){
			min= nombre1;}
			else {
				if (nombre2<nombre1 && nombre2<nombre3){
					min= nombre2;}
				else 
					min = nombre3;
				}
	
		return min;
	}
		
	
	
}
