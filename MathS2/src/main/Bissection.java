package main;


public class Bissection{

    public static double findRoot(Function f, double a, double b) {

        double fa, fb, fm, m;

        fa = f.eval(a);
        fb = f.eval(b);

        //Si le produit est n�gatif, les termes sont de signes oppos�s
        double test = fa*fb;

        //Dans le cas o� c'est les m�mes signes, l'intervalle est mal plac�e.
        if(test>0){
            throw new ArithmeticException();
        }


        while(true){
            //On va trouver le milieu de l'intervalle
            m = (a+b)/2;

            //Si l'intervalle correspond � l'une des deux bornes, notre r�ponse est d�j� trop pr�cise.
            if(m==a || m==b){
                break;
            }

            //On passe m dans fm
            fm = f.eval(m);

            //Si �gal � 0 ben c'est trouv�
            if(fm==0){
                break;
            }

            //Sinon on �value notre position par rapport � 0 et on modifie les bornes.
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
