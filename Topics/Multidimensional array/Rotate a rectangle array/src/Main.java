import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        // dimensions of rectangle array [n x m]
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] rectangleArray = new int[n][m];
        
        for (int i = 0; i < n; i++) { // e.g. [n x m] -> [3 x 4]
            for (int j = 0; j < m; j++) {
                rectangleArray[i][j] = scanner.nextInt();
            }
        }
    
        //print2DArray(rectangleArray);
        
        int[][] arrayRotated = new int[m][n];
        
        for (int i = 0; i < m; i++) { // e.g. [m x n] -> [4 x 3]
            for (int j = 0; j < n; j++) {
                arrayRotated[i][j] = rectangleArray[n - 1 - j][i];
            }
        }
    
        print2DArray(arrayRotated);
    }
    
    // print entered original [n x m] of modified array [m x n]
    private static void print2DArray(int[][] rectangleArray) {
        for (int[] ints : rectangleArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println(); // proceed to next line [new row]
        }
    }
}