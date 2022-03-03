import java.util.Arrays;

class ReverseElements {
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
        int n = twoDimArray.length;
        int m = twoDimArray[n - 1].length;
    
        //System.out.println(n); // 3
        //System.out.println(m); // 4
        
        int[][] tempArray = new int[n][m];
        
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < m; j++) {
                tempArray[i][j] = twoDimArray[i][m - 1 - j];
            }
        }
    
        for (int i = 0; i < tempArray.length; i++) {
            //System.arraycopy(tempArray[i], 0, twoDimArray[i], 0, m);
            for (int j = 0; j < m; j++) {
                twoDimArray[i][j] = tempArray[i][j];
            }
        }
    
        //ArrayOperations.printMatrix(tempArray);
    }
    /*
    public static void main(String[] args) {
        
        // matrix 3 x 4
        int[][] twoDimensionsArray = new int[][] {
                {0, 0, 9, 9},
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
    
        printMatrix(twoDimensionsArray);
        System.out.println(); // empty line
        reverseElements(twoDimensionsArray);
        //ArrayOperations.printMatrix(twoDimensionsArray);
    }
    
    private static void printMatrix(int[][] twoDimArray) {
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    */
}