import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int cups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
    
        if (isWeekend && cups <= 25 && cups >= 15) {
            System.out.println(true);
        } else if (!isWeekend && cups <= 20 && cups >= 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}