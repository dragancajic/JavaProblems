import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
    
        int n = scanner.nextInt();
        int m = scanner.nextInt();
    
        int[][] soldTickets = new int[n][m];
        String rowAsString = "";
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                soldTickets[i][j] = scanner.nextInt();
            }
        }
    
        int k = scanner.nextInt();
    
        String neighboringSeats = "";
    
        for (int i = 0; i < k; i++) {
            neighboringSeats = neighboringSeats.concat("0");
        }
        //System.out.println(neighboringSeats);
    
        rowAsString = "";
        int row = -1;
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rowAsString = rowAsString.concat(String.valueOf(soldTickets[i][j]));
            }
            //System.out.println(rowAsString);
        
            boolean available = rowAsString.contains(neighboringSeats);
        
            if (available) {
                row = i;
                break;
            }
            rowAsString = "";
        }
        
        /*
        // OK! wanted neighboring seats to find
        String neighboringSeats = "";
        
        for (int i = 0; i < k; i++) {
            neighboringSeats = neighboringSeats.concat("0");
        }
        System.out.println(neighboringSeats);
        //~OK! wanted neighboring seats to find
        
        // OK! public boolean contains(CharSequence)
        if ("0100011".contains(neighboringSeats)) {
            available = true;
            System.out.println("Available! " + available);
        } else {
            System.out.println("Not available! " + available);
        }
        //~OK! public boolean contains(CharSequence)
        */
        System.out.println(row + 1);
    }
}