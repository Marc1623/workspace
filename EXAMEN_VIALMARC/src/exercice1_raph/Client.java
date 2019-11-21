package exercice1_raph;

public class Client {

    private String nom;
    private String prenom;
    private int credit;

    private final int MAX_VALUE_CREDIT=500;

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void recharger(Integer montant) throws MontantNegatifException{

        if (montant<0)
            throw new MontantNegatifException();

        if (montant==Integer.MAX_VALUE){
            credit=500;
            return;
        }

        if ((credit+montant)>MAX_VALUE_CREDIT){
            credit=500;
            System.out.println("Le crédit maximum est de "+MAX_VALUE_CREDIT+" CHF.");
        }
        else
            credit+=montant;
    }

    public void acheter (Ouvrages ouvrages) throws MontantInsuffisantException, LivreIndisponibleException{

        if (ouvrages.getNombreExemplairesDisponibles()==0)
            throw new LivreIndisponibleException();
        else{
            if (credit<ouvrages.getPrix())
                throw new MontantInsuffisantException();
            else{
                ouvrages.setNombreExemplairesDisponibles(ouvrages.getNombreExemplairesDisponibles()-1);
                credit-=ouvrages.getPrix();
                System.out.println("Livre '"+ouvrages.getTitre()+"' acheté !");
            }
        }
    }

    public String toString (){
        return prenom+" "+nom+" : "+credit+" CHF";
    }
}
