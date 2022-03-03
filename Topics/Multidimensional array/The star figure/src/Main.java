import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        // input size of matrix [n x n]
        int size = scanner.nextInt();
        
        char[][] starFigure = new char[size][size];
        
        // fill 2D array (matrix) with appropriate symbols as elements
        for (int i = 0; i < starFigure.length; i++) {
            for (int j = 0; j < starFigure[i].length; j++) {
                if (i == j || i == size / 2 || j == size / 2 || i == size - 1 - j) {
                    starFigure[i][j] = '*';
                } else {
                    starFigure[i][j] = '.';
                }
            }
        }
        
        // output matrix; elements should be space separated
        /*
        for (int i = 0; i < starFigure.length; i++) {
            for (int j = 0; j < starFigure[i].length; j++) {
                System.out.print(starFigure[i][j] + " ");
            }
            System.out.println(); // proceed to next row / line
        }
        System.out.println(); // empty line
        */
        // or using 'enhanced for' loop (for-each):
        for (char[] chars : starFigure) {
            for (char anChar : chars) {
                System.out.print(anChar + " ");
            }
            System.out.println(); // proceed to next row / line
        }
    }
}