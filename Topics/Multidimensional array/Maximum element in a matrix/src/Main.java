import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        
        // initialize matrix with integers given from console
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        //printMatrix(matrix);
        
        // find initial maximum element of matrix and its indexes
        int max = Integer.MIN_VALUE;
        int rowOfMax = 0;
        int columnOfMax = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    rowOfMax = i;
                    columnOfMax = j;
                }
            }
        }
        //System.out.println("max element: " + max);
        //System.out.println("(i, j) of max: " + rowOfMax + ", " + columnOfMax);
        System.out.print(rowOfMax + " " + columnOfMax);
    }
    
    // output matrix received from the user
    public static void printMatrix(int[][] matrix) {
        for (int[] rows : matrix) {
            for (int number : rows) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}