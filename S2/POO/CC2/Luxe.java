package CC2;

public class Luxe extends Voiture {

    public Luxe (String marque, String modele){
        super(marque, modele);
    }

    @Override
    public double getPrix(double nb_heuresLocation) {
        double prix;
        if (nb_heuresLocation>5)
            prix = 5*200+(nb_heuresLocation-5)*250;
        else
            prix= nb_heuresLocation*500;
        if (this.getNb_heures()>100)
            prix*=0.8;
        return prix;
    }

}
