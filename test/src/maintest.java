import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class maintest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		String nf = "C:\\Users\\marcv\\Desktop\\tst.txt";
		String newf = "C:\\Users\\marcv\\Desktop\\newtst.txt";
		String ligne;
		
		File f = new File (nf);
		
		
		BufferedReader reader = null;
		
		reader = new BufferedReader (new FileReader(nf));

		FileWriter fichier = new FileWriter (newf);
		fichier.write("Salut les amis\n");
		fichier.write("salut les copains");
		fichier.close();
		
		while ((ligne = reader.readLine()) != null ){
			System.out.println(ligne);
		}
		
				
	}

}
