package exercice1;

public class HeureLimiteExeption extends Exception {

    public HeureLimiteExeption (){
        super("montant n�gatif ou sup�rieur � 500");
    }
}
