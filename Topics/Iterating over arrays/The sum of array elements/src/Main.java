import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] arrayOfInts = new int[size];
        
        int sum = 0;
        
        for (int i = 0; i < size; i++) {
            arrayOfInts[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < size; i++) {
            sum += arrayOfInts[i];
        }
        
        System.out.println(sum);
    }
}