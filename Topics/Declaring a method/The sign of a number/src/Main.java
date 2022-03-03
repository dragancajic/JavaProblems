import java.util.Scanner;

public class Main {

    public static int sign(int number) {
        // write your code here
        int signOfNumber;
        
        if (number < 0) {
            signOfNumber = -1;
        } else if (number > 0) {
            signOfNumber = 1;
        } else {
            signOfNumber = 0;
        }
        // or by using Integer.compare(num1, num2) method
        //int signOfNumber = Integer.compare(number, 0);
        
        return signOfNumber;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}