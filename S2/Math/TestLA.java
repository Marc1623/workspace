public class TestLA {
    public static void main(String[] args) {

    	        double A[][];

    	        A = new double [][] {{6,6,0,4500},{8,0,8,3600},{0,7,7,4980}};
    	        A = new double [][] {{2,3,3,25},{2,4,5,33},{3,2,1,22}};
    	        A = new double [][] {{2,3,3,25},{2,4,5,33}};
    	        A = new double [][] {{7,-2,-8,6,4},{0,2,-4,3,2},{0,0,0,4,-8}};
    	        A = new double [][] {{0,0,0.33},{0.18,0,0,},{0,0.71,0.94}};

    	        LA.showMatrix(A);
    	        int n = 100;

    	       double[][] Eanf = new double[][]{{900},{500},{2600}};
    	       double[][] Eand = LA.multiply(LA.power(A, n), Eanf);

    	       LA.showArray(Eanf);
    	       LA.showArray(Eand);

    	        //		LA.toString() : rendre matrice sous forme string
    	        //		LA.showMatrix() : montrer la matrice
    	        //		LA.randomMatrix(rows, colonms) : créer matrice aléatoire entre limite définie
    	        //		LA.copyOf() : dupliquer la matrice indiquée
    	    }

    	}
    	
    	
   /* premier chapitre !!!
        double A[][];

        A = new double [][] {{2,3,3,25},{2,4,5,33}};
       // A = new double [][] {{30,10,10,350},{10,10,30,150}};

        LA.showMatrix(A);
        LA.eliminateGaussJordan(A);
        LA.showMatrix(A);

//		LA.toString() : rendre matrice sous forme string
//		LA.showMatrix() : montrer la matrice
//		LA.randomMatrix(rows, colonms) : créer matrice aléatoire entre limite définie
//		LA.copyOf() : dupliquer la matrice indiquée
    }

}

*/