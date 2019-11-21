package exercice1;

public class HeureLimiteExeption extends Exception {

    public HeureLimiteExeption (){
        super("montant négatif ou supérieur à 500");
    }
}
