import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        int counter = 0;
        
        for (int x = 0; x <= 1000; x++) {
            int y = a * x * x * x + b * x * x + c * x + d;
            
            if (y == 0) {
                System.out.println(x);
                counter++;
            }
            
            if (counter == 3) {
                break;
            }
        }
    }
}