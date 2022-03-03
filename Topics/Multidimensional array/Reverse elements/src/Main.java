class ArrayOperations {
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
            /*
            for (int j = 0; j < m; j++) {
                twoDimArray[i][j] = tempArray[i][j];
            }
            */
            // or like this:
            System.arraycopy(tempArray[i], 0, twoDimArray[i], 0, m);
        }
    }
}