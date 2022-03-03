import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        
        boolean num1Positive = number1 > 0 && number2 <= 0 && number3 <= 0;
        boolean num2Positive = number1 <= 0 && number2 > 0 && number3 <= 0;
        boolean num3Positive = number1 <= 0 && number2 <= 0 && number3 > 0;
        
        if (num1Positive || num2Positive || num3Positive) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}