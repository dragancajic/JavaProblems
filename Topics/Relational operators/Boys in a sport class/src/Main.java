import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        //System.out.println("Enter three numbers: ");
    
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();
    
        System.out.println(h1 <= h2 && h2 <= h3 || h1 >= h2 && h2 >= h3);
        //System.out.print(h1 + " " + h2 + " " + h3);
    }
}