package Algorithmes;

public class Tri {

	   private int nombre=0;
	    private int [] tableau;
	    private int temp=0;
	    private int index=0;


	    public Tri(int nombre) {
	        this.nombre=nombre;
	        tableau = new int[nombre];

	        for (int i=0;i<tableau.length;i++){
	            tableau[i] =(int)(Math.random()*10) + 1;
	        }

	    }
	    
	    public static long fibonnaci (int n) {
	    	//clause de finitude
	    	if(n == 0) {
	    		return 0;
	    	}
	    	if(n==1) {
	    		return 1;
	    	}
	    	//pas récurcif
	    	return fibonnaci(n-1)+fibonnaci (n-2);
	    	
	    }
	    
	    public static long fibonnaciIterative (int n) {
	    	int premier =0;
	    	int deuxieme =1;
	    	int reponse=0;
	    	
	    	for(int i=0; i<n ;i++) {
	    		
	    		reponse = premier + deuxieme;
	    		premier = deuxieme;
	    		deuxieme = reponse;
	    		
	    	}
	    	return reponse;
	    }
	    
	    
	    public static long factorielle (int nombre) {
	    	
	    	//clause de finitude
	    	if (nombre==0) {
	    		return 1;
	    	}
	    	//pas récurcif
	    	return nombre * factorielle((nombre-1));
	    }
	    
	    
	    
	    public void hanoi (int n, char depart, char intermediaire, char arrivee){
            
            //Clause de finitude
            if(n==1){ //Pas récursif
                System.out.println(depart + " -> " + arrivee);
                return;
            }

            //Pas récursif
            hanoi(n-1, depart, arrivee, intermediaire); 

            System.out.println(depart + " -> " + arrivee);

            hanoi(n-1, intermediaire, depart, arrivee); 


        }
	    
	    public void triCocktailShaker (){ // tri à bulles dans les 2 sens

	        boolean flag = false;
	        int start = 0, end = tableau.length;

	        while (!flag){
	            flag=true;
	            for (int y = start; y< end-1; y++){
	                if (tableau[y]>tableau[y+1]){
	                    int temp = tableau[y];
	                    tableau[y]=tableau[y+1];
	                    tableau[y+1]=temp;
	                    flag=false;
	                }
	            }
	            end--;

	            if (flag)
	                return;

	            flag=true;
	            for (int y = end-1; y >= start; y--){
	                if (tableau[y]>tableau[y+1]){
	                    int temp = tableau[y];
	                    tableau[y]=tableau[y+1];
	                    tableau[y+1]=temp;
	                    flag=false;
	                }
	            }
	            start++;
	        }
	    }

	    public void affiche(){

	        for (int i=0;i<tableau.length;i++){
	            System.out.print(tableau[i]+"   ");
	        }

	        System.out.println();
	    }


	    public void triSelection() {

	        for (int i = 0; i < tableau.length ; i++){
	            index = i;
	            for (int j = i+1; j < tableau.length; j++){
	                if (tableau[j] < tableau [index]){
	                    index = j;
	                }
	            }

	            int min = tableau[index];
	            tableau[index] = tableau[i];
	            tableau [i] = min;
	        }
	    }

	    public void triInsertion() {

	        int taille = tableau.length;

	        for (int i = 1; i < taille; i++)
	        {
	            int index = tableau[i];
	            int j = i-1;

	            while ( tableau[j] > index  && (j > -1) )
	            {
	                tableau[j+1] = tableau[j];
	                j--;
	            }
	            tableau[j+1] = index;
	        }

	    }

	    public void triBulles() {
	        int taille = tableau.length;
	        int tmp = 0;
	        for (int i = 0; i < taille; i++) {
	            for (int j = 1; j < (taille - i); j++) {
	                if (tableau[j - 1] > tableau[j]) {
	                    //echanges des elements
	                    tmp = tableau[j - 1];
	                    tableau[j - 1] = tableau[j];
	                    tableau[j] = tmp;
	                }

	            }
	        }
	    }

	    public void rechercheLineaire(int nbrRecherche){
	        for (int i =0; i<tableau.length;i++){
	            if (tableau[i] == nbrRecherche){
	                System.out.println(tableau[i] + " à la case " + i + " du tableau");
	                break;}
	        }
	    }
	    
	    
	    
	    public int rechercherRecursive (int valeur) {
	    	return rechercherRecursive(0, tableau.length-1,1 );
	    }
	    private int rechercherRecursive (int gauche , int droite, int valeur) {
	    	//clause de finitude
	    	if (gauche>droite)
	    	return -1;
	    	
	    	//pas récursif
	    	int milieu = (gauche + droite)/2;
	    	
	    	if(tableau[milieu] == valeur)
	    		return milieu;
	    	
	    	if (tableau[milieu] > valeur)
	    		droite = milieu -1;
	    	else gauche = milieu +1;
	    	
	    	return rechercherRecursive(gauche,droite,valeur);
	    }
	    

	    public int rechercheDichotomique(int nbrRecherche) {

	        int gauche = 0;
	        int droite = tableau.length - 1;
	        int milieu;
	        int nbCoups = 0;

	        while (gauche <= droite) {

	            affichePortion(gauche, droite);
	            nbCoups++;
	            milieu = (gauche + droite) / 2;

	            if (tableau[milieu] == nbrRecherche){
	                System.out.println("Nombre de coups : " + nbCoups);
	                return milieu;
	                }
	            if (tableau[milieu] > nbrRecherche) {
	                System.out.println("Nombre de coups : " + nbCoups);
	                droite = milieu - 1;
	                }
	            else {
	                System.out.println("Nombre de coups : " + nbCoups);
	                gauche = milieu + 1;
	                }
	            }

	            return -1;
	        }
	    
	    public void affichePortion ( int gauche, int droite){

            for (int i = gauche; i <= droite; i++) {
                System.out.print(tableau[i]);
                System.out.println();
            }

        }
	    
	    public static int minimum (int [] tab) {
	    		return minimum(tab, 0, tab.length-1);
	    		}
	    private static int minimum (int [] tab, int debut, int fin) {
	    
	    	//clause de finitude
	    	if(debut == fin)
	    		return tab[debut];
	    	
	    	//pas recursif
	    	
	    	int milieu = (debut + fin)/2;
	    	
	    	int min1 = minimum(tab,debut,milieu);
	    	System.out.println(min1);
	    	int min2= minimum(tab,milieu+1,fin);
	    	System.out.println(min2);
	    	
	    	if(min1<min2)
	    		return min1;
	    	else
	    		return min2;
	    	
	    	
	    }
	    
	    

	    private void echange(int i, int j)
	    {
	      int temp = tableau[i] ;
	      tableau[i] = tableau[j] ;
	      tableau[j] = temp ;
	    }

	    public void quicksort()
	    {
	    	quicksort(0, tableau.length-1) ;
	    }


	    private void  quicksort(int g, int d)
	    {
	      int pivot, i, j ;

	      if (g >= d)
	        return ;

	      pivot = tableau[g] ;
	      i = g+1 ;
	      j = d ;

	      while (i <= j)
	      {
	        while ( i <= d && tableau[i] <= pivot)
	          ++i ;
	        while (tableau[j] > pivot)
	          --j ;
	        if (i < j)
	        {
	          echange(i, j) ;
	          i++ ; j-- ;
	        }
	      }

	      echange(g, j) ;

	      quicksort(g, j-1) ;
	      quicksort(j+1, d) ;
	    }
	   
	    
	    
	    
	    public void fusion()
	    {
	      fusion(0, tableau.length-1) ;
	    }

	    private void fusion(int g, int d)
	        {
	        int i, j, k ;
	        //affiche() ;
	        // clause de finitude
	        if (g == d)
	            return ;

	        // pas récursif
	        int m = (g + d)/2 ;

	        fusion(g, m) ;
	        fusion(m+1, d) ;

	        int temp[] = new int[d-g+1] ;

	        // copie de tab dans temp
	        j=0 ;

	        for (i=g; i<=m; i++)		// 1ere partie à l'endroit
	            {
	            temp[j] = tableau[i] ;
	            ++j ;
	            }

	        for (i=d; i>m; i--)       // 2eme partie à l'envers
	            {
	            temp[j] = tableau[i] ;
	            ++j ;
	            }


	        // copie de temp dans tab par fusion
	        j = 0 ;             // dedut de temp
	        k = d - g ;         // fin de temp

	        for (i=g ; i<=d ; i++)
	            if (temp[j] < temp[k])
	                {
	            	tableau[i] = temp[j] ;
	                ++j ;
	                }
	            else
	                {
	            	tableau[i] = temp[k] ;
	                --k ;
	                }
	        }
	    
	    
	    
	    public static int somme(int n){
	        //stop when
	        if(n == 0)
	            return n;
	        else
	            return n + somme(n - 1);
	    }


	    public static int down(int n){

	        System.out.println(n);

	        if(n==1){
	            return 1;
	        }
	        return down(n-1);
	    }
	   /* public static void up(int n){

	        up(n,1);
	    }

	    */
	    public static int up(int n, int cpt){

	        if(n==1){
	            System.out.println(cpt);
	            return -1;
	        }
	        System.out.println(cpt);
	        cpt = cpt+1;
	        return up(n-1, cpt);
	    }
	    public static void up(int n){

	        if(n==0)
	            return;

	        up(n-1);
	        System.out.print(n+" ");
	    }

	    public static void downup(int n){

	        if (n<=0){
	            return;
	        }

	        //Pas récursif
	        System.out.print(n+" ");
	        downup(n-1);
	        System.out.print(n+" ");

	    }
	    public static void up_down (boolean flag, int n, int end){
	        //fin
	        if (flag && n ==0){
	            return;
	        }
	        //recursif
	        System.out.print(n+" ");
	        if (n==end){
	            System.out.print(n+" ");
	            flag = true;
	        }
	        if (flag)
	            up_down(true, n - 1, end);
	        else
	            up_down(false, n + 1, end);
	    }

	    public static void upTLP(int n){

	        for(int i=0; i<=n;i++) {
	            System.out.println(i);
	        }
	    }
	    public static void upTLPDispatcher(int n){
	        if(n==0){
	            return;
	        }
	        upTLPDispatcher(n-1);
	        System.out.println(n);
	    }

	    public static void updownTLP(int n){

	        for(int i=1; i<n;i++){
	            System.out.print(i+" ");
	        }
	        System.out.print(n+" ");
	        for(int j=n; j>0; j--){
	            System.out.print(j+" ");
	        }
	    }

	    public static void updownTLPDispatcher(int n){

	        if(n==0){
	            return;
	        }

	        updownTLP(n-1);
	    }

	    public static void UpAndDown2(int n, int m){
	        System.out.println(m-n+1);
	        if (n > 1)
	            UpAndDown2(n-1,m);
	        System.out.println(m-n+1);
	    }
	    public static void UpAndDown(int n){
	        UpAndDown2(n,n);
	    }

	    public static int pgcd(int a, int b)
	    {
	        if (b == 0)
	        {
	            return a;
	        }
	        return pgcd(b, a % b);
	    }




	    
}
	
