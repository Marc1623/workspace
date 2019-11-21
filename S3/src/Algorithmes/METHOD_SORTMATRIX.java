package Algorithmes;

public class METHOD_SORTMATRIX {
    public static void main(String[] args) {
        int [][] mat = new int[3][5];
        fill(mat);
        System.out.println("MATRIX BEFORE SORT ==> ");
        show(mat);

        //sort_bubble(mat, mat.length*mat[0].length);
        sort_quick(mat, 0, mat.length*mat[0].length-1);

        System.out.println("MATRIX AFTER SORT ==> ");
        show(mat);
    }
    public static void fill (int [][] matrix){
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[0].length; j++)
                matrix[i][j] = (int) ((Math.random()*99)+1);
        }
    }
    public static void show (int [][] matrix){
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[0].length; j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
        System.out.println();
    }
    public static void swap (int [][] matrix, int posA, int posB){
        int nbColunms = matrix[0].length;
        int temp = matrix[(posA)/nbColunms][(posA)%nbColunms];
        matrix[(posA)/nbColunms][(posA)%nbColunms] = matrix[(posB)/nbColunms][(posB)%nbColunms];
        matrix[(posB)/nbColunms][(posB)%nbColunms] = temp;
    }
    public static void sort_bubble (int [][] matrix, int n){
        //CLAUSE DE FINITUDE
        if (n == 1)
            return;

        //PAS RECURSIF
        int nbColunms = matrix[0].length;
        for (int i=0; i<n-1; i++)
            if (matrix[(i)/nbColunms][(i)%nbColunms] > matrix[(i+1)/nbColunms][(i+1)%nbColunms]){
                swap(matrix, i, i+1);
            }
        sort_bubble(matrix, n-1);
    }
    public static void sort_quick (int [][] matrix, int bottom, int top){
        //CLAUSE DE FINITUDE
        if (bottom >= top)
            return;

        int nbColunms = matrix[0].length;
        int pivot = matrix[(bottom)/nbColunms][(bottom)%nbColunms];
        int left = bottom+1;
        int right = top;

        while (left <= right) {
            while (left <= top && matrix[(left)/nbColunms][(left)%nbColunms] <= pivot)
                ++left;
            while (matrix[(right)/nbColunms][(right)%nbColunms] > pivot)
                --right;
            if (left < right) {
                swap(matrix, left, right);
                left++; right--;
            }
        }
        swap(matrix, bottom, right);


        //PAS RECURSIF
        sort_quick(matrix, bottom, right - 1);
        sort_quick(matrix, right + 1, top);
    }

}