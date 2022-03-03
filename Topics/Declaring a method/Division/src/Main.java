import java.util.Scanner;

public class Main {

    public static double divide(long a, long b) {
        // write your code here
        if (b != 0) {
            return 1.0 * a / b;
        } else {
            System.out.println("Division by zero!");
            return -1;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        System.out.println(divide(a, b));
    }
}