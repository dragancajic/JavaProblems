import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int students1 = scanner.nextInt();
        int students2 = scanner.nextInt();
        int students3 = scanner.nextInt();
        
        int desks1 = students1 / 2 + students1 % 2; // 20 / 2 = 10
        //System.out.println(desks1);
        int desks2 = students2 / 2 + students2 % 2; // 21 / 2 = 10 (+ 1 = 11)
        //System.out.println(desks2);
        int desks3 = students3 / 2 + students3 % 2; // 22 / 2 = 11
        //System.out.println(desks3);
        
        System.out.println(desks1 + desks2 + desks3);
    }
}
