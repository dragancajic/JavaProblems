import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt(); // 100
        int b = scanner.nextInt(); // 105
        
        long sum = 1; // <-- long for ...
        
        for (int i = a; i < b; i++) {
            sum *= i;
        }
    
        System.out.println(sum); // 11035502400!
    }
}