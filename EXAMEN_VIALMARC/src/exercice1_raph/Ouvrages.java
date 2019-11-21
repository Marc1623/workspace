package exercice1_raph;

public class Ouvrages {

    private String titre;
    private String auteur;

    private int prix;
    private int nombreExemplairesDisponibles;

    private int siecle;
    private String traducteur;

    public Ouvrages(String auteur, String titre, int prix, int nombreExemplairesDisponibles, int siecle) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nombreExemplairesDisponibles = nombreExemplairesDisponibles;
        this.siecle=siecle;
    }

    public Ouvrages(String titre, String auteur, int prix, int nombreExemplairesDisponibles, String traducteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nombreExemplairesDisponibles = nombreExemplairesDisponibles;
        this.traducteur=traducteur;
    }

    public String getTitre() {
        return titre;
    }
    public int getPrix() {
        return prix;
    }
    public int getNombreExemplairesDisponibles() {
        return nombreExemplairesDisponibles;
    }
    public void setNombreExemplairesDisponibles(int nombreExemplairesDisponibles) {
        this.nombreExemplairesDisponibles = nombreExemplairesDisponibles;
    }

    public String toString (){
        String type ;
        if (siecle==0)
            type=traducteur;
        else
            type=siecle+"";

        return (auteur+" / "+titre+" / "+ prix +" CHF / "+nombreExemplairesDisponibles+" exemplaires / "+type);
    }

}
