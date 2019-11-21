package CC2;

public abstract class Voiture {

    String marque;
    String modele;

    double nb_heures;

    public Voiture (String marque, String modele){
        this.marque=marque;
        this.modele=modele;
    }

    public abstract double getPrix (double nb_heuresLocation);
    public double rouler (){return nb_heures;}
    public void getInfo (){System.out.println("La voiture à louer est une "+marque+", "+modele+". Elle a déjà roulé "+nb_heures+". ");}

    public double getNb_heures() {
        return nb_heures;
    }
}
