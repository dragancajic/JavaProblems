import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double celsius = scanner.nextDouble();
        
        // F = C * 1.8 + 32
        double fahrenheit = celsius * 1.8 + 32;
    
        System.out.println(fahrenheit);
    }
}