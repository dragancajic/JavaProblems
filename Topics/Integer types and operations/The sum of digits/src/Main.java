import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        
        int hundredths = number / 100;
        number %= 100;
        int tens = number / 10;
        int units = number % 10;
    
        System.out.println(hundredths + tens + units);
    }
}