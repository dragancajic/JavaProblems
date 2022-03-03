import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        // digits of a four-digit number
        int thousandths = number / 1000;
        number %= 1000;
        int hundredths = number / 100;
        number %= 100;
        int tenths = number / 10;
        int ones = number % 10;
        
        if (thousandths == ones && hundredths == tenths) {
            System.out.println(1);
        } else {
            System.out.println(number);
        }
    }
}