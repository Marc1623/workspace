package main;


public class Bissection{

    public static double findRoot(Function f, double a, double b) {

        double fa, fb, fm, m;

        fa = f.eval(a);
        fb = f.eval(b);

        //Si le produit est négatif, les termes sont de signes opposés
        double test = fa*fb;

        //Dans le cas où c'est les mêmes signes, l'intervalle est mal placée.
        if(test>0){
            throw new ArithmeticException();
        }


        while(true){
            //On va trouver le milieu de l'intervalle
            m = (a+b)/2;

            //Si l'intervalle correspond à l'une des deux bornes, notre réponse est déjà trop précise.
            if(m==a || m==b){
                break;
            }

            //On passe m dans fm
            fm = f.eval(m);

            //Si égal à 0 ben c'est trouvé
            if(fm==0){
                break;
            }

            //Sinon on évalue notre position par rapport à 0 et on modifie les bornes.
            if(f.eval(a)*fm<0){
                b=m;
            }
            else{
                a=m;
            }
        }
        return m;
    }

}
