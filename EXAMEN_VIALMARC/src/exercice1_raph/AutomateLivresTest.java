package exercice1_raph;

public class AutomateLivresTest {
    public static void main(String[] args) {

        Ouvrages [] ouvrages = new Ouvrages[5];
        Client [] clients = new Client[2];

        ouvrages[0] = new Ouvrages("Daniel Pennac", "Au Bonheur des ogres", 20, 5, 20);
        ouvrages[1] = new Ouvrages("Daniel Pennac", "La f�e carabine", 30, 4, 20);
        ouvrages[2] = new Ouvrages("Edgar Allan Poe", "Histoire extraordinaires", 15, 3, "Baudelaire");
        ouvrages[3] = new Ouvrages("Moli�re", "L'avare", 10, 2, 17);
        ouvrages[4] = new Ouvrages("John Lang", "La couette de l'oubli", 25, 1, 21);

        clients[0] = new Client("Darbellay", "Rapha�l");
        clients[1] = new Client("Favre", "Patrice");

        //Client 1 : cr�dit de 50 CHF
        try {
            clients[0].recharger(50);
        } catch (MontantNegatifException n){
            n.printStackTrace();
        }

        //Client 1 : cr�dit de 60 CHF
        try {
            clients[1].recharger(60);
        } catch (MontantNegatifException n){
            n.printStackTrace();
        }

        // Client 1 : ach�te un exemplaire de chaque livre
        for (int i = 0 ; i<ouvrages.length; i++){
            try {
                clients[0].acheter(ouvrages[i]);
            } catch (MontantInsuffisantException | LivreIndisponibleException e){
                e.printStackTrace();
            }
        }
        // Client 1 : �tat du compte
        System.out.println("\n"+clients[0].toString());

        // Automates : �tat
        for (int i = 0 ; i<ouvrages.length; i++){
            System.out.println(ouvrages[i].toString());
        }
        System.out.println();

        // Client 2 : ach�te un exemplaire de chaque livre
        for (int i = 0 ; i<ouvrages.length; i++){
            try {
                clients[1].acheter(ouvrages[i]);
            } catch (MontantInsuffisantException | LivreIndisponibleException e){
                e.printStackTrace();
            }
        }

        // Client 2 : �tat du compte
        System.out.println("\n"+clients[1].toString());

        // Automates : �tat
        for (int i = 0 ; i<ouvrages.length; i++){
            System.out.println(ouvrages[i].toString());
        }
        System.out.println();

        //Client 1 : cr�dit de 100 CHF
        try {
            clients[0].recharger(100);
        } catch (MontantNegatifException n){
            n.printStackTrace();
        }
        // Client 1 : �tat du compte
        System.out.println(clients[0].toString());

        //Client 1 : cr�dit de MAX_VALUE CHF
        try {
            clients[0].recharger(Integer.MAX_VALUE);
        } catch (MontantNegatifException n){
            n.printStackTrace();
        }
        // Client 1 : �tat du compte
        System.out.println(clients[0].toString());
    }
}
