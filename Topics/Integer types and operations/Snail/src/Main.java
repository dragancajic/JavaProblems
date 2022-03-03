import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // HINT by Henry Moreno
        // https://hyperskill.org/profile/39847863
        // Algebra:
        // h = (x - 1) * (a - b) + b + 1
        // Clear the value of x
        
        // h = x * a - x * b -a + b + b + 1
        // h = x * (a - b) - a + 2 * b + 1
        // x = (h + a - 2 * b - 1) / (a - b)
        
        // v1 = A / (2/3) = 3 * A / 2
        // v2 = B / (1/3) = 3 * B
        // v1 - v2 = 3 * A / 2 - 3 * B =
        // t [h] = H / (v1 - v2) = H / [(A - 2 * B) / 16] = 10 / (3 - 4) /...
        int day = (h + a - 2 * b - 1) / (a - b);
        System.out.println(day);
    }
}