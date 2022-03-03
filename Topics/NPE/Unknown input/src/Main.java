import java.util.Scanner;

class Util {
    // correct this method to avoid NPE
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String userName = null;
        printLength(userName);
        
        userName = scanner.next();
        printLength(userName);
    }
    
    public static void printLength(String name) {
        if (name != null) {
            System.out.println(name.length());
        } else {
            System.out.println("Please, enter your name!");
            System.out.print("Your name: ");
        }
    }
}