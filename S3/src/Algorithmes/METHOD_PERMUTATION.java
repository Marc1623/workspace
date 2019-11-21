package Algorithmes;

public class METHOD_PERMUTATION {

    char [] tab;
    int count = 0;

    public METHOD_PERMUTATION(int n){

        tab = new char[n];

        for (int i = 0; i<n; i++){
            tab[i]= (char) ('A'+i);
        }

        METHODE_Permutation(0, tab.length-1);
    }

    private void METHODE_Permutation(int firstIndex, int lastIndex){

        //CLAUSE DE FINITUDE
        if (firstIndex == lastIndex){
            display();
            return;
        }

        //PAS RECURSIF
        for (int i = firstIndex; i <= lastIndex; i++){
             tab = swap(firstIndex,i);
             METHODE_Permutation(firstIndex+1, lastIndex);
             tab = swap(firstIndex,i);
        }
    }

    private char [] swap(int i, int j){
        char temp = tab[i] ;
        tab[i] = tab[j];
        tab[j] = temp;
        return tab;
    }

    private void display(){
        count++;
        System.out.print(count+".\t\t");
        for (int i = 0; i<tab.length; i++)
            System.out.print(tab[i]+", ");
        System.out.println();
    }

    public int getCount (){return count;}
}
