package Matrix;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double A[][];
        double B[][];
        double I[][];
        double M[][];
        double N[][];
        double cake[][];
        double X[][];
        double w[][];
        double d[][];

        I = new double[][] {{1,2,3,4,5,6},{7,8,9,10,11,12},{17,18,19,110,111,112},{27,28,29,210,211,212},{37,38,39,310,311,312},{47,48,49,410,411,412}};
        B = new double[][] {{87,48,95},{10,11,12},{34,64,97}};
        A = new double[][] {{1,2,3,4,5,6},{7,8,9,10,11,12},{17,18,19,110,111,112},{27,28,29,210,211,212},{37,38,39,310,311,312}};
        M = new double[][] {{1,2,3},{10,10,10},{5,5,5}};
        N = new double[][] {{4000,4500,4500,4000},{2000,2600,2400,2200},{5800,6200,6000,6000}};
        X = new double[][] {{2,2},{2,2}};
        w = new double[][] {{1.5,1,0.5,380},{1.2,0.9,0.6,330}};
        cake = new double[][] {{0.1,0.3,0.1},{0.3,0.4,0.2},{0.15,0.25,0.15}};
        d = new double [][] {{},{},{}};
        

        int i=0;
        int j=0;
        
      //  LinearAlgebra.showMatrix(w);
      //  LinearAlgebra.eliminateGJ(w);
       //LinearAlgebra.showMatrix(w);
        
        
       // LinearAlgebra.showMatrix(LinearAlgebra.multiply(LinearAlgebra.inverse(N),cake));
        
       LinearAlgebra.showMatrix(LinearAlgebra.multiply(cake, N));
       // LinearAlgebra.showMatrix();
/*
        LinearAlgebra.showMatrix(A);
        LinearAlgebra.eliminateGJ(A);
        LinearAlgebra.showMatrix(A);
 */
        //LinearAlgebra.showMatrix(LinearAlgebra.joinMatrices(A,B));
        //LinearAlgebra.showMatrix(LinearAlgebra.identity(5));
        //LinearAlgebra.showMatrix(LinearAlgebra.subMatrix(I,1,1,3,3));

       // LinearAlgebra.showMatrix(LinearAlgebra.inverse(B));
       // LinearAlgebra.showMatrix(LinearAlgebra.multiply(M,N));

      //  LinearAlgebra.showMatrix(LinearAlgebra.eliminateGJ(N));

        //LinearAlgebra.showMatrix(LinearAlgebra.power(X,0));

        //LinearAlgebra.showMatrix(LinearAlgebra.add(2,X));

       // LinearAlgebra.showArray(LinearAlgebra.substituteBack(I));


    }

}
