import java.util.*;
public class condition_entrainement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		double note1;
		double note2;
		
		note1= 5.5;
		note2= 3.7;
		
		double moyenne;
		
		moyenne = (note1+note2)/2;
		
		if (moyenne > 4.0)
			System.out.print("promu");
		
		else
			System.out.print("non promu");
	}

}
