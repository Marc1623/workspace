package Matrix;
import java.util.Arrays;
import java.util.Random;
import java.util.function.BiFunction;

/**
 * Created by Leo Studer during spring semester 2019
 */
public abstract class LinearAlgebra {

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
        double[][] identity = new double[dimension][dimension]; //Java makes an empty matrix !!!
        for (int row = 0; row < dimension; row++)
            identity[row][row] = 1.0;
        return identity;
    }


    public static double[][] joinMatrices(double A[][], double B[][]){
        if (A.length != B.length) {
            System.out.println("joinMatrices: wrong dimensions");
            return null;
        }

        int nbRows = A.length;
        int nbColumnsA = A[0].length;
        int nbColumnsB = B[0].length;
        double[][] joinedMatrix = new double[nbRows][nbColumnsA + nbColumnsB];
        int row, column;
        for (row = 0; row < nbRows; row++) {
            for (column = 0; column < nbColumnsA; column++)
            joinedMatrix[row][column] = A[row][column];
            for (column = 0; column < nbColumnsB; column++)
            joinedMatrix[row][nbColumnsA + column] = B[row][column];
        }
        return joinedMatrix;
    }

    public static double[][] subMatrix(double A[][],
                                        int firstRow, //top
                                        int firstColumn, //left
                                        int lastRow, //bottom
                                        int lastColumn) //right
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
         // C[row][column] = 0; Java does that with the initialisation
            for (inRowCol = 0; inRowCol < nbInRowCols; inRowCol++)
                 C[row][column] += A[row][inRowCol] * B[inRowCol][column];
             }
         return C;
         }

            public static double[][] multiply(double a, double A[][]){return termByTerm(A, a, LinearAlgebra::multiply);}
            public static double[][] multiply(double A[][], double a){return termByTerm(A, a, LinearAlgebra::multiply);}

            public static double[][] add(double A[][], double B[][]){return termByTerm(A, B, LinearAlgebra::add);}
            public static double[][] add(double a, double A[][]){return termByTerm(A, a, LinearAlgebra::add);}
            public static double[][] add(double A[][], double a){return termByTerm(A, a, LinearAlgebra::add);}

            public static double[][] subtract(double A[][], double B[][]){return termByTerm(A, B, LinearAlgebra::subtract);}
            public static double[][] subtract(double A[][], double a){return termByTerm(A, a, LinearAlgebra::subtract);}
            public static double[][] subtract(double a, double A[][]){return termByTerm(A, a, LinearAlgebra::subtract);}

             //myOperators
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
            for (column = 0; column < nbColumns; column++) {
               C[row][column] = myOperator.apply(A[row][column] , B[row][column]);
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
    private static void eliminateUp(double A[][]){ //On donne le tableau
        int nb_rows = A.length; //Nb ligne
        int nb_columns = A[0].length;//NB colonne
        int row, column; //position
        for (row = nb_rows - 1; row >=0; row--) //Il se positionne à la fin
            for (column = row; column < nb_columns; column++){ //il se positionne à l'avant derniere colonne
                if (A[row][column] == 0) continue;
                makeFirstOne(A, row, column);
                eliminateColumnUp(A, row, column);
                break;
            }
    }

    public static void eliminateColumnUp(double A[][], int row, int column) { //tableau + point d'entrée
        int nb_rows = A.length; //nb ligne
        int nb_columns = A[0].length; //nb colonne
        double pivot; //valeur pivot
        int t_row, t_column; //position tableau
        for (t_row = 0 ; t_row < row; t_row++) {//tant que y a assez de ligne
            if (A[t_row][column] == 0.) continue; //on saut si y a un 0
            pivot = A[t_row][column]; // A[row][column] = 1 toute façon;
            A[t_row][column] = 0; //dès qu'on a récupérer le pivot on peut le passer à 0
            for (t_column = column + 1 ; t_column < nb_columns; t_column++) { //on navigue sur les colonnes
                A[t_row][t_column] = roundZero(A[t_row][t_column] - pivot * A[row][t_column]);
                showMatrix(A);
            } //On calcule la nouvelle valeur grâce au pivot + arrondi 0
        }
    }

    private static void makeFirstOne(double A[][], int row, int column){ //Tableau + point d'entrée
        int nb_columns = A[0].length; //nb colonne
        for (int t_column = column+1; t_column < nb_columns; t_column++){ //on navigue sur les colonnes
            if (A[row][t_column] == 0.) continue; //si elle vaut 0 on saute
            A[row][t_column] = A[row][t_column] / A[row][column]; //Sinon on divise la position par le point d'entrée
        }
        A[row][column] = 1.; //Le poinnt d'entrée devient 1
        showMatrix(A);
    }

    public static double[] solveRegularSystem(double A[][]){
        int nb_rows = A.length;
        int nb_columns = A[0].length;
        if (nb_rows != nb_columns -1){
            System.out.println("SolvRegularSystem: nb equations != nb unknowns !!!");
            return null;
        }
        if (!eliminate(A)){
            System.out.println("SolveRegularSystem: singular system !!!");
            return null;
        }
        return substituteBack(A);
    }

    public static double[] substituteBack(double A[][]) {

        int nb_rows = A.length;
        int nb_columns = A[0].length;
        //Récupère ligne et colonnes
        double solution[] = new double[nb_rows]; //Créer un tableau décimale de la même longeur que le max ligne
        int row, column; //Créer des variable de position
        for (row = nb_rows - 1; row >= 0; row--) { //Position de début = ligneMax-1, on décrément jusqu'à 0
            solution[row] = A[row][nb_columns - 1]; //On mets dans le tableau à la position row le contenu du tab A à la même position
            System.out.println("Boucle une : ");
            showArray(solution);
            for (column = nb_columns - 2; column > row; column--) { //Position colonne -2, décrémente
                solution[row] -= A[row][column] * solution[column]; //Position tab row on soustrait la multiplicaiton de la position tabA par la colonne de tab
                System.out.println("Boucle deux : ");
                showArray(solution);
            }
            solution[row] /= A[row][row]; // Finalement on divise la position row par la position double ligne

        }
        return solution;
    }

    public static boolean eliminate(double A[][]){ //On donne le tableau de base et il va descendre les 0
        int nb_rows = A.length; //NB Lignes
        int nb_columns = A[0].length; //NB colonnes
        boolean regular = true; //Il est regulier
        int row = 0, column = 0; //position de début

        while (row < nb_rows && column < nb_columns) //Tant que les positions ligne et colonne sont plus petits que le tableau
            if (setBestFirstRow(A, row, column)) //Si SBFR vrai
                eliminateFirstColumnDown(A,row++, column++); //On peut lancer EFCD
            else { //Sinon on passe à la colonne d'après
                column++;
                regular = false; //ET on dit que ce n'est pas un système régulier
            }
            return regular;

        }

    public static boolean setBestFirstRow(double A[][], int row, int column) { //on lui donne la table et le point d'entrée
        int nb_rows = A.length; //On récupère le nombre de ligne
        double bestValue = Math.abs(A[row][column]); //Retourne la valeur absolue du point d'entrée
        int bestRow = row; //La meilleur ligne est celle donnée en argument
        double value; //Initialise une valeur double

        for (int t_row = row + 1; t_row < nb_rows; t_row++) {
            //On descend un cran plus bas, tant t_row est plus petit que le nombre de ligne on incrémente
            value = Math.abs(A[t_row][column]); // On attribue la valeur absolue de la position à value
            if (bestValue < value) { //Si la valeur absolue est plus haute que la précédente
                bestValue = value; //On attribue la nouvelle meilleur valeur
                bestRow = t_row; //Et la nouvelle meilleur ligne devient par conséquent celle ci
            }
        } //A la fin de la boucle on aura la valeur absolue la plus haute ainsi que sa ligne
        swapRows(A, row, bestRow); //On appelle la méthode qui va interchagner les lignes
        return bestValue > 0; //Si la valeur est plus grande on renvoi vrai
    }

    public static void swapRows(double A[][], int row1, int row2) {
    //En argument le tableau ainsi que les lignes à interchanger
        if(row1==row2) return; //Si ce sont les même on arrete
        double temp[] = A[row1]; //pointer change only in JAVA !!!
        //On crée un tableau temporaire pour stocker la ligne 1
        A[row1] = A[row2]; //On mets la ligne 2 dans la 1
        A[row2] = temp; //On repasse la ligne 1 dans la 2 via la table temp

    }

    private static double roundZero(double value) {
        if (Math.abs(value) > N_ZERO) return value; //On fixe une limite et on la compare
        if (value == 0.) return 0.;// si c'est plus grand on renvoi sinon on mets 0
        System.out.println("roundZero: "+ value + " almost 0 !!!!");
        return 0.;
    }

    public static void eliminateFirstColumnDown(double A[][], int row, int column) { //Tableau + point d'entrée
        //////////////
        showMatrix(A);
        /////////////
        int nb_rows = A.length; //Nb lignes
        int nb_columns = A[0].length; //nb colonnes
        double pivot; //variable pour le pivot
        int t_row, t_column; //variable pour la position dans le tableau

        for (t_row = row + 1; t_row < nb_rows; t_row++) { //on descend d'un cran et jusqu'à la fin des lignes
            if (A[t_row][column] == 0.) continue; //si on trouve un 0 on saute cette ligne
            pivot = A[t_row][column] / A[row][column]; //on divise la position actuel par le point d'entrée
            A[t_row][column] = 0; //Ensuite on mets un 0 à sa place
            //Ensuite on go sur les colonnes de la même ligne
            for (t_column = column + 1; t_column < nb_columns; t_column++) {
                A[t_row][t_column] = roundZero(A[t_row][t_column] - pivot * A[row][t_column]);
                //////////////
                showMatrix(A);
                /////////////
            }//On attribue aux valeurs de cette ligne l'arrondi du calcul suivant : x-pivot*[point d'entrée][colonneActuelle]
        }

    }


    public static String toString(double vector[]) {
        if (vector == null) return "empty vector!";
        int nbValues = vector.length;
        String string = "\n[";
        if (nbValues <= MAXNBVALUESDISPLAYED) {
            for (double value : vector)
                string += String.format(" %.3f ", value);
        } else {
            string += String.format(" %.3f ", vector[0]);
            string += String.format(" %.3f ", vector[1]);
            string += String.format(" %.3f ", vector[2]);
            string += "  ... " + (nbValues - 6) + " values suppressed ...  ";
            string += String.format(" %.3f ", vector[nbValues - 3]);
            string += String.format(" %.3f ", vector[nbValues - 2]);
            string += String.format(" %.3f ", vector[nbValues - 1]);
        }
        return string + "]";
    }

    public static String toString(double matrix[][]) {
        if (matrix == null) return "empty matrix! ";
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
            string += "\n[     " + (nbRows - 6) + " rows suppressed";
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
