import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
    
        int sum = 0;
        
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            
            if (number % 6 == 0) {
                sum += number;
            }
        }
    
        System.out.println(sum);
    }
}