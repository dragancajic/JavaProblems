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
        int m = scanner.nextInt();
    
        boolean areNeighbors = false;
        
        for (int i = 0; i < size - 1; i++) {
            if (arrayOfInts[i] == n && arrayOfInts[i + 1] == m ||
                arrayOfInts[i] == m && arrayOfInts[i + 1] == n) {
                areNeighbors = true;
                break;
            }
        }
        System.out.println(areNeighbors);
    }
}