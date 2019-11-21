import java.util.*;
public class TP8_04_ex3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5 ;
		Scanner scan = new Scanner(System.in);
		System.out.print("Entrez un caractère: ");
		char caract = scan.next().charAt(0);
		for (int i=1; i<n ; i++)
		{
			for (int j=1; j<n ; j++)
			{
				if (i<j)
					System.out.print(caract);
			}
		}

	}

}
