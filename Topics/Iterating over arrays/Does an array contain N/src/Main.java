import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        
        int[] arrayOfInts = new int[size];
        
        for (int i = 0; i < size; i++) {
            arrayOfInts[i] = scanner.nextInt();
        }
        
        int number = scanner.nextInt();
        boolean doesContainN = false;
        
        for (int element : arrayOfInts) {
            if (element == number) {
                doesContainN = true;
                break;
            }
        }
        /*
        if (doesContainN) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        */
        // or simplified 'if' statement would be:
        System.out.println(doesContainN);
    }
}