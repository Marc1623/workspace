package CC2;

public class Familiale extends Voiture {

    public Familiale (String marque, String modele){
        super(marque, modele);
    }

    @Override
    public double getPrix(double nb_heuresLocation) {
        double prix;
        if (nb_heuresLocation>7)
            prix = 7*500+(nb_heuresLocation-7)*100;
        else
            prix = nb_heuresLocation*500    ;
        if (this.getNb_heures()>100)
            prix*=0.8;
        return prix;
    }
}