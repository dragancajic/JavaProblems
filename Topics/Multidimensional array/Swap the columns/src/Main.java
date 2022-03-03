import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] matrix = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        //printMatrix(matrix);
    
        int colon1 = scanner.nextInt();
        int colon2 = scanner.nextInt();
        
        // check / validate entered column indexes
        // TODO You can make function too, e.g. validateColumns(int[][], i, j)
        while (true) {
            if (colon1 >= m || colon2 >= m) {
                System.out.println("Enter columns again!");
                colon1 = scanner.nextInt();
                colon2 = scanner.nextInt();
            } else {
                break;
            }
        }
        
        // TODO Refactor to function, e.g. void swapColumns(int[][], column1, column2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == colon1) {
                    int tempElement = matrix[i][colon2];
                    matrix[i][colon2] = matrix[i][j];
                    matrix[i][j] = tempElement;
                }
            }
        }
        printMatrix(matrix);
    }
    
    public static void printMatrix(int[][] matrix2D) {
        for (int[] row : matrix2D) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // proceed to next row
        }
    }
}