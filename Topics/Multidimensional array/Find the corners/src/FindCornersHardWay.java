//import java.util.Scanner;
//
//class FindCornersHardWay {
//    public static void printCorners(int[][] twoDimArray) {
//        // write your code here
//        for (int i = 0; i < twoDimArray.length; i++) {
//            for (int j = 0; j < twoDimArray[i].length; j++) {
//                if ((i == 0 || i == twoDimArray.length - 1) &&
//                    (j == 0 || j == twoDimArray[i].length - 1)) {
//                    System.out.print(twoDimArray[i][j] + " ");
//
//                    if (twoDimArray[i].length - 1 == 0) {
//                        System.out.print(twoDimArray[i][j]);
//                    }
//                }
//
//                if (i == 0 && j == twoDimArray[i].length - 1) {
//                    System.out.println();
//                }
//
//                if (twoDimArray.length - 1 == 0) {
//                    System.out.print(twoDimArray[i][j] + " ");
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        //int[][] matrix = new int[3][3];
//        //int[][] matrix = new int[3][1];
//        int[][] matrix = new int[1][3];
//        //int[][] matrix = new int[1][1];
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
