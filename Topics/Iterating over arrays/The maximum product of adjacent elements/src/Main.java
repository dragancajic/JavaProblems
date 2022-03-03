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
        
        int maxProduct = -1;
        
        for (int i = 0; i < size - 1; i++) {
            int product = arrayOfInts[i] * arrayOfInts[i + 1];
            if (product > maxProduct) {
                maxProduct = product;
            }
        }
    
        System.out.println(maxProduct);
    }
}