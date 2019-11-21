import java.util.*;
public class premierExemple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val1 = 4;
		int val2 = 6;
		
		int res = minimum(val1, val2);
		
		
		System.out.println( res);
		
		int res2 = minimum (34,56);
		System.out.println(res2);
		

	}
	
	
	public static int minimum (int nombre1, int nombre2){
		
		int min;
		
		if (nombre1 < nombre2)
			min = nombre1;
		else 
			min = nombre2;
		
		return min;
	}

}
