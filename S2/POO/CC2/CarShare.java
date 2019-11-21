package CC2;

public class CarShare {
	public static void main(String[] args)
		{
			Voiture vsport1 = new Sport("Porsche","Carrera") ;
			Voiture vclassic1 = new Classic("Citroen", "C3") ;
			Client manu = new Client("Manu") ;
			
			try {
				manu.louer(vsport1);
				manu.rouler(7.0);
			                              // appel automatique à calculPrix
				manu.rouler(100.0);
				manu.calculPrix() ;
			} catch(Exception e) {
				System.out.println(e);
			}
		}
}

