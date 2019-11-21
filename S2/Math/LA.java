import java.util.Arrays;
        import java.util.Random;
        import java.util.function.BiFunction; /**
 7 * Created by Leo Studer during spring semester 2019¬
 8 */
         public abstract class LA {

         private final static int MAXNBVALUESDISPLAYED = 11;
         private final static double N_ZERO = 10.E-15;

         public static double[][] power(double[][] A, int n){
     int nbRows = A.length;
     int nbColumns = A[0].length;
     if (nbRows != nbColumns) {
         System.out.println("power: matrix not square");
         return null;
         }
     if (n < 0) return power(inverse(A),-n);
     if (n == 0) return identity(nbRows);
     if (n == 1) return A;
     double[][] T = A;
     for (int i = 1; i < n; i++ ) // if n >= 2
         T = multiply(A,T);
     return T;
     }

         public static double[][] inverse(double A[][]) {
     int nbRows = A.length;
     int nbColumns = A[0].length;
     if (nbRows != nbColumns) {
         System.out.println("inverse: matrix not square");
         return null;
    }
     double T[][] = joinMatrices(A,identity(nbRows));
     if (!eliminate(T)){
         System.out.println("inverse: singular matrix");
         return null;
         }
     eliminateUp(T);
     return subMatrix(T, 0, nbColumns,nbRows - 1,2 * nbColumns - 1);
     }

         public static double[][] identity(int dimension){
     double[][] identity = new double[dimension][dimension]; //Java makes an empty matrix !!!¬
     for (int row = 0; row < dimension; row++)
     identity[row][row] = 1.0;
     return identity;
     }


         public static double[][] joinMatrices(double A[][], double B[][]){
     if (A.length != B.length){
         System.out.println("joinMatrices: wrong dimensions");
         return null;
         }
     int nbRows = A.length;
     int nbColumnsA = A[0].length;
     int nbColumnsB = B[0].length;
     double[][] joinedMatrix = new double[nbRows][nbColumnsA + nbColumnsB];
     int row, column;
     for (row = 0; row < nbRows; row++ ){
         for (column = 0; column < nbColumnsA; column++)
         joinedMatrix[row][column] = A[row][column];
         for (column = 0; column < nbColumnsB; column++)
         joinedMatrix[row][nbColumnsA + column] = B[row][column];
         }
     return joinedMatrix;
}

         public static double[][] subMatrix(double A[][],
         int firstRow, //top¬
 int firstColumn, //left¬
 int lastRow, //bottom¬
 int lastColumn) //right¬
 {
         int nbRows = A.length;
         int nbColumns = A[0].length;
         if (!(firstRow >= 0 && firstRow <= lastRow && lastRow < nbRows &&
         firstColumn >= 0 && firstColumn <= lastColumn && lastColumn < nbColumns)){
             System.out.println("subMatrice: wrong indices");
             return null;
             }
         double[][] subMatrix = new double[lastRow - firstRow + 1][lastColumn - firstColumn + 1];
         int row, column;
         for (row = firstRow; row <= lastRow; row++)
         for (column = firstColumn; column <= lastColumn; column++)
         subMatrix[row - firstRow][column - firstColumn] = A[row][column];
         return subMatrix;
         }

             public static double[][] multiply(double A[][], double B[][]) {
         if (A[0].length != B.length) {
             System.out.println("multiply: wrong dimensions");
             return null;
             }
         int nbRows = A.length;
         int nbColumns = B[0].length;
         int nbInRowCols = A[0].length;
         double C[][] = new double[nbRows][nbColumns];
         int row, column, inRowCol;
         for (row = 0; row < nbRows; row++)
         for (column = 0; column < nbColumns; column++){
            // C[row][column] = 0; Java does that with the initialisation¬
             for (inRowCol = 0; inRowCol < nbInRowCols; inRowCol++)
             C[row][column] += A[row][inRowCol] * B[inRowCol][column];
             }
         return C;
         }

             public static double[][] multiply(double a, double A[][]){return termByTerm(A, a, LA::multiply);}
             public static double[][] multiply(double A[][], double a){return termByTerm(A, a, LA::multiply);}

             public static double[][] add(double A[][], double B[][]){return termByTerm(A, B, LA::add);}
             public static double[][] add(double a, double A[][]){return termByTerm(A, a, LA::add);}
             public static double[][] add(double A[][], double a){return termByTerm(A, a, LA::add);}

             public static double[][] subtract(double A[][], double B[][]){return termByTerm(A, B, LA::subtract);}
             public static double[][] subtract(double A[][], double a){return termByTerm(A, a, LA::subtract);}
             public static double[][] subtract(double a, double A[][]){return termByTerm(A, a, LA::subtract);}

             //myOperators¬
             private static double add(double a, double b){return a + b;}
             private static double subtract(double a, double b){return a - b;}
             private static double multiply(double a, double b){return a * b;}

             private static double[][] termByTerm(double A[][], double B[][], BiFunction<Double, Double, Double> myOperator) {
         if ((A.length != B.length) || (A[0].length != B[0].length)) {
             System.out.println("add: wrong dimensions");
             return null;
             }
         int nbRows = A.length;
         int nbColumns = A[0].length;
         double C[][] = new double[nbRows][nbColumns];
         int row, column;
         for (row = 0; row < nbRows; row++)
         for (column = 0; column < nbColumns; column++) {C[row][column] = myOperator.apply(A[row][column] , B[row][column]);
             }
         return C;
         }

             private static double[][] termByTerm(double A[][], double a, BiFunction<Double, Double, Double> myOperator) {
         int nbRows = A.length;
         int nbColumns = A[0].length;
         double C[][] = new double[nbRows][nbColumns];
         int row, column;
         for (row = 0; row < nbRows; row++)
         for (column = 0; column < nbColumns; column++) {
             C[row][column] = myOperator.apply(A[row][column], a);
             }
         return C;
         }

             public static double[][] eliminateGJ(double A[][]){
         eliminate(A);
         eliminateUp(A);
         return A;
         }

             private static void eliminateUp(double A[][]){
         int nb_rows = A.length;
         int nb_columns = A[0].length;
         int row, column;
         for (row = nb_rows - 1; row >= 0; row--)
         for (column = row; column < nb_columns; column++){
             if (A[row][column] == 0) continue;
             makeFirstOne(A, row, column);
             eliminateColumnUp(A, row, column);
             break;
             }
    }

             private static void eliminateColumnUp(double A[][], int row, int column) {
         int nb_rows = A.length;
         int nb_columns = A[0].length;
         double pivot;
         int t_row, t_column;
         for (t_row = 0; t_row < row; t_row++) {
             if (A[t_row][column] == 0.) continue;
             pivot = A[t_row][column]; // A[row][column] == 1;¬
             A[t_row][column] = 0;
             for (t_column = column + 1; t_column < nb_columns; t_column++) {
                 A[t_row][t_column] = roundZero(A[t_row][t_column] - pivot * A[row][t_column]);
                 }
             }
         }

             private static void makeFirstOne(double A[][], int row, int column){
         int nb_columns = A[0].length;
         for (int t_column = column+1; t_column < nb_columns; t_column++ ) {
             if (A[row][t_column] == 0.) continue;
             A[row][t_column] = A[row][t_column] / A[row][column];
             }
         A[row][column] = 1.;
         }


             public static double[] solveRegularSystem(double A[][]){
         int nb_rows = A.length;
         int nb_columns = A[0].length;
         if (nb_rows != nb_columns -1){
             System.out.println("solveRegularSystem: nb equations != nb unknowns !!!");
             return null;
             }
         if (!eliminate(A)){
            System.out.println("solveRegularSystem: singular system !!!");
             return null;
             }
         return substituteBack(A);
         }


             private static double[] substituteBack(double A[][]) {
         int nb_rows = A.length;
         int nb_columns = A[0].length;
         double solution[] = new double[nb_rows];
         int row, column;
         for (row = nb_rows - 1; row >= 0; row--){
             solution[row] = A[row][nb_columns - 1];
             for (column = nb_columns - 2; column > row; column--)
             solution[row] -= A[row][column] * solution[column];
             solution[row] /= A[row][row]; // row == colummn
             }
         return solution;
         }

             private static boolean eliminate(double A[][]){
         int nb_rows = A.length;
         int nb_columns = A[0].length;
         boolean regular = true;
         int row = 0, column = 0;
         while (row < nb_rows && column < nb_columns)
         if (setBestFirstRow(A, row, column))
         eliminateFirstColumnDown(A, row++, column++);
         else {
             regular = false;
             }
         return regular;
         }
    private static boolean setBestFirstRow(double A[][], int row, int column){
         int nb_rows = A.length;
         double bestValue = Math.abs(A[row][column]);
         int bestRow = row;
         double value;
         for (int t_row = row + 1; t_row < nb_rows; t_row++){
             value = Math.abs(A[t_row][column]);
             if (bestValue < value){
                 bestValue = value;
                 bestRow = t_row;
                 }
             }
         swapRows(A, row, bestRow);
         return bestValue > 0;
         }

             public static void swapRows(double A[][], int row1, int row2){
         if (row1 == row2) return;
         double temp[] = A[row1]; //pointer change, JAVA !!!
         A[row1] = A[row2];
         A[row2] = temp;
         }

             private static double roundZero(double value){
         if (Math.abs(value) > N_ZERO) return value;
         if (value == 0.) return 0.;
         System.out.println("roundZero: " + value + " almost 0 !!!");
         return 0.;
         }

             private static void eliminateFirstColumnDown(double A[][], int row, int column) {
         int nb_rows = A.length;
         int nb_columns = A[0].length;
        double pivot;
         int t_row, t_column;
         for (t_row = row + 1; t_row < nb_rows; t_row++) {
             if (A[t_row][column] == 0.) continue;
             pivot = A[t_row][column] / A[row][column];
             A[t_row][column] = 0;
             for (t_column = column + 1; t_column < nb_columns; t_column++) {
                 A[t_row][t_column] = roundZero(A[t_row][t_column] - pivot * A[row][t_column]);
                 }
             }
         }



             public static String toString(double vector[]) {
         if (vector == null) return "toString: empty vector !!!";
         int nbValues = vector.length;
         String string = "\n[";
         if (nbValues <= MAXNBVALUESDISPLAYED) {
             for (double value : vector)
             string += String.format(" %.3f ", value);
             } else {
             string += String.format(" %.3f ", vector[0]);
             string += String.format(" %.3f ", vector[1]);
             string += String.format(" %.3f ", vector[2]);
             string += " ... " + (nbValues - 6) + " values suppressed ... ";
             string += String.format(" %.3f ", vector[nbValues - 3]);
             string += String.format(" %.3f ", vector[nbValues - 2]);
             string += String.format(" %.3f ", vector[nbValues - 1]);
             }
         return string + "]";
         }

             public static String toString(double matrix[][]) {
         if (matrix == null) return "toString: empty matrix !!! ";
        int nbRows = matrix.length;
         String string = "";
         if (nbRows <= MAXNBVALUESDISPLAYED) {
             for (double[] row : matrix)
             string += toString(row);
             } else {
             string += toString(matrix[0]);
             string += toString(matrix[1]);
             string += toString(matrix[2]);
             string += "\n[ .....................";
             string += "\n[ " + (nbRows - 6) + " rows suppressed";
             string += "\n[ .....................";
             string += toString(matrix[nbRows - 3]);
             string += toString(matrix[nbRows - 2]);
             string += toString(matrix[nbRows - 1]);
             }
         return string + "\n";
        }
             public static void showArray(double vector[]) {
         System.out.println(toString(vector));
         }

             public static void showVector(double vector[]) {
         showArray(vector);
         }


             public static void showArray(double matrix[][]) {
         System.out.println(toString(matrix));
         }
             public static void showMatrix(double matrix[][]) {
         showArray(matrix);
         }

    public static double[][] randomMatrix(int nbRows, int nbColumns) {
         Random generator = new Random();
         double[][] matrix = new double[nbRows][nbColumns];
         int row, column;
         for (row = 0; row < nbRows; row++)
         for (column = 0; column < nbColumns; column++)
         matrix[row][column] = generator.nextDouble() * 2.0 - 1.0;
         return matrix;
         }
             public static double[] copyOf(double vector[]) {
         return Arrays.copyOf(vector, vector.length);
         }

             public static double[][] copyOf(double matrix[][]) {
         double[][] copy = new double[matrix.length][];
         for (int row = 0; row < matrix.length; row++)
         copy[row] = copyOf(matrix[row]);
         return copy;
         }
             }