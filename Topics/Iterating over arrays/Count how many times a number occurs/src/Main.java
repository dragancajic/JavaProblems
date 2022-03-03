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
        
        int n = scanner.nextInt();
        int counter = 0;
        
        for (int i = 0; i < size; i++) {
            if (arrayOfInts[i] == n) {
                counter++;
            }
        }
    
        System.out.println(counter);
    }
}