package CC2;

public class Classic extends Voiture {

    public Classic (String marque, String modele){
        super(marque, modele);
    }

    @Override
    public double getPrix(double nb_heuresLocation) {
        double prix = nb_heuresLocation*90;
        if (this.getNb_heures()>100)
            prix*=0.8;
        return prix;
    }
}
