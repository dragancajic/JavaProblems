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
        
        boolean isSorted = true;
        
        for (int i = 1; i < size; i++) {
            if (arrayOfInts[i - 1] > arrayOfInts[i]) {
                isSorted = false;
                break;
            }
        }
    
        System.out.println(isSorted);
    }
}