import java.util.*;
public class StatDeTableau {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int nbtirage= 1000000;
		int i;
		int []face = new int [6];
		
		for(i=1; i<=nbtirage ; i++)
			++face[(int) (Math.random()*6)];
		
		for (i=0 ; i<6 ; i++)
			System.out.println(face[i]);
			
	}

}
