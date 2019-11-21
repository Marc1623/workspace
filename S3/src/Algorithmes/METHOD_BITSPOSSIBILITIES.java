package Algorithmes;

public class METHOD_BITSPOSSIBILITIES {

    int [] tab;
    int count = 0;

    public METHOD_BITSPOSSIBILITIES(int n){

        tab = new int[n];

        for (int i = 0; i<n; i++){
            tab[i]= 0;
        }

        METHODE_bitspossiblities(0, tab.length-1);
    }

    private void METHODE_bitspossiblities(int firstIndex, int lastIndex){

        //CLAUSE DE FINITUDE
        if (firstIndex > lastIndex){
            display();
            return;
        }

        //PAS RECURSIF
        tab[firstIndex] = 0;
        METHODE_bitspossiblities(firstIndex+1, lastIndex);

        tab[firstIndex] = 1;
        METHODE_bitspossiblities(firstIndex+1, lastIndex);
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
