//class TheThirdRow {
//    public static void printTheThirdRow(int[][] twoDimArray) {
//        // write your code here
//        for (int i = 0; i < twoDimArray.length; i++) {
//            for (int j = 0; j < twoDimArray[i].length; j++) {
//                if (i == 2) {
//                    System.out.print(twoDimArray[i][j] + " ");
//                }
//            }
//        }
//    }
//
//    public static void printMatrix(int[][] matrix2D) {
//        for (int[] row : matrix2D) {
//            for (int element : row) {
//                System.out.print(element + "\t");
//            }
//            System.out.println(); // proceed to next row
//        }
//    }
//
//    public static void main(String[] args) {
//        int[][] matrix = new int[4][4];
//        int element = 0;
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                matrix[i][j] = ++element;
//            }
//        }
//        printMatrix(matrix);
//        System.out.println("\n~ 3rd row of matrix:");
//        printTheThirdRow(matrix);
//    }
//}