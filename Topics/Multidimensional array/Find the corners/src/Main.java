
class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        // write your code here
        int m = twoDimArray.length;
        int n = twoDimArray[m - 1].length;
        int[] firstRow = new int[n];
        int[] lastRow = new int[n];
    
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
            
                if (i == 0) {
                    firstRow[j] = twoDimArray[i][j];
                }
            
                if (i == m - 1) {
                    lastRow[j] = twoDimArray[i][j];
                }
            }
        }
        System.out.println(firstRow[0] + " " + firstRow[n - 1]);
        System.out.println(lastRow[0] + " " + lastRow[n - 1]);
    }
}