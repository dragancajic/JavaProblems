import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        boolean ascending = true;
        boolean descending = true;
        boolean ordered = true;
        int first = scanner.nextInt();
        int next = scanner.nextInt();
    
        while (next != 0) {
            
            if (next == first) {
                next = scanner.nextInt();
                continue;
            }
        
            if (next > first) {
                descending = false;
                ordered &= ascending;
            } else {
                ascending = false;
                ordered &= descending;
            }
    
            first = next;
            next = scanner.nextInt();
        }
        System.out.println(ordered);
    }
}