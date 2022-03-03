//import java.util.Scanner;
//
//class FindCorners {
//    public static void printCorners(int[][] twoDimArray) {
//        // write your code here
//        int m = twoDimArray.length;
//        int n = twoDimArray[m - 1].length;
//        int[] firstRow = new int[n];
//        int[] lastRow = new int[n];
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//
//                if (i == 0) {
//                    firstRow[j] = twoDimArray[i][j];
//                }
//
//                if (i == m - 1) {
//                    lastRow[j] = twoDimArray[i][j];
//                }
//            }
//        }
//        System.out.println(firstRow[0] + " " + firstRow[n - 1]);
//        System.out.println(lastRow[0] + " " + lastRow[n - 1]);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        //int[][] matrix = new int[3][3];
//        //int[][] matrix = new int[3][1];
//        //int[][] matrix = new int[1][3];
//        int[][] matrix = new int[1][1];
//
//        // initialize matrix
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = scanner.nextInt();
//            }
//        }
//        /*
//        // display matrix
//        for (int[] intArray : matrix) {
//            for (int intElement : intArray) {
//                System.out.print(intElement + " ");
//            }
//            System.out.println();
//        }
//        */
//        printCorners(matrix);
//    }
//}
