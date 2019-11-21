import java.util.*;
public class Marc_Vial3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner (System.in);
		
		int num=1, nbvideo,minute=0,seconde=0,sm=0,ss=0,dt=0;
		double dmm,reste,dms;
		
		System.out.println("Nombre de vidéeos publiées : ");
		nbvideo=scan.nextInt();
		
		for(int i=0 ; i<nbvideo; i++){
			
			System.out.println("Durée de la vidéo numéro "+num);
			
			System.out.println("Minutes");
			minute=scan.nextInt();
			
			System.out.println("Secondes");
			seconde=scan.nextInt();
			
			sm+=minute;
			ss+=seconde;
			
			num++;
		}
		if(ss>60){
			sm+=ss/60;
			
			ss=ss%60;
			
		}
		
		dmm = sm/nbvideo ;
		dms = ss/nbvideo;
		
		
		System.out.println("Durée totale : "+sm+" min " + ss+" sec ");
		System.out.println("Durée moyenne : "+dmm+" min " + dms+" sec ");
	}

}
