package CC2;

public class Sport extends Voiture {

    public Sport (String marque, String modele){
        super(marque, modele);
    }

    @Override
    public double getPrix(double nb_heuresLocation) {
        double prix = 200*nb_heuresLocation;

        if (this.getNb_heures()>100)
            prix*=0.8;
        return prix;
    }
}
