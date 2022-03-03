import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int nonNegativeInteger = scanner.nextInt();
    
        System.out.println((nonNegativeInteger / 10) % 10);
    }
}