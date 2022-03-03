import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
    
        //System.out.println("Enter the size of matrix:");
        int n = scanner.nextInt();
        
        int[][] numbers = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    numbers[i][j] = 0;
                }
                
                if (j > i) {
                    numbers[i][j] = j - i;
                }
                
                if (i > j) {
                    numbers[i][j] = i - j;
                }
            }
        }
    
        System.out.println(); // empty line
        printMatrix(numbers);
    }
    
    public static void printMatrix(int[][] matrixOfInts) {
        for (int[] arrayOfInts : matrixOfInts) {
            for (int j = 0; j < matrixOfInts[matrixOfInts.length - 1].length; j++) {
                System.out.print(arrayOfInts[j] + " ");
            }
            System.out.println();
        }
    }
}