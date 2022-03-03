import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        
        for (int i = 0; i < n; i++) {
            int part = scanner.nextInt();
            
            if (part == 1) {
                larger++;
            }
            
            if (part == -1) {
                smaller++;
            }
            
            if (part == 0) {
                perfect++;
            }
        }
    
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}