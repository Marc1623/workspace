package CC2;

public class Client {

    String firstname;
    Voiture voiture;
    double nbHeuresLocation;
    double nbTotalHeuresLocation;

    public Client(String firstname) {
        this.firstname = firstname;
    }

    public void louer (Voiture voiture){
        if (this.voiture!=null)
            calculPrix();
        this.voiture=voiture;
        voiture.getInfo();
    }

    public void rouler (double heures)throws HeureLimiteExeption{
        if (heures>72)
            throw new HeureLimiteExeption();
        else {
            System.out.println("Elle est louée pour "+heures+" heures");
            nbHeuresLocation=heures;
            nbTotalHeuresLocation+=heures;
        }

    }

    public void calculPrix() {
        double prix = this.voiture.getPrix(nbHeuresLocation);
        if (nbTotalHeuresLocation>500)
            prix*=0.85;
        else if (nbTotalHeuresLocation>200)
            prix*=0.90;
        System.out.println("Le prix de la location est de "+prix);

    }
}