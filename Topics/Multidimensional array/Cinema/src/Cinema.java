import java.util.Scanner;

class Cinema {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] soldTickets = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                soldTickets[i][j] = scanner.nextInt();
            }
        }
        
        // TODO: Try to make it to work using only 2D matrix!
        int k = scanner.nextInt();
        int row = -1;
        int counter = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (soldTickets[i][j] == 0) {
                    counter++;
                    System.out.println("i: " + i + ", j: " + j);
                    System.out.println("counter: " + counter);
                }
            }
    
            if (counter == k && k == 1) {
                row = i;
                //System.out.println("row for 1 seat: " + row);
                break;
            }
            
            for (int j = 1; j < m; j++) {
                if (counter >= k && k > 1 &&
                    soldTickets[i][j] == 0 &&
                    soldTickets[i][j - 1] == soldTickets[i][j]) {
                    row = i;
                    System.out.println("row: " + row);
                    //break;
                }
            }
            counter = 0;
        }
        System.out.println(row + 1);
    }
}
