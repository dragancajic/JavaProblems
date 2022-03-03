import java.util.Scanner;

class LongestAscendingSequence {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] arrayOfInts = new int[size];
        
        for (int i = 0; i < size; i++) {
            arrayOfInts[i] = scanner.nextInt();
        }
        //printArray(arrayOfInts);
        
        int maxLength = 0;
        int length = 0;
        for (int i = 1; i < size; i++) {
            
            if (arrayOfInts[i - 1] < arrayOfInts[i]) {
                length++;
                System.out.println(arrayOfInts[i - 1] + " < " + arrayOfInts[i]);
                System.out.println("length: " + length);
            }
            
            if (length > maxLength) {
                maxLength = length;
                System.out.println("maxLength: " + maxLength);
            }
            
            if (arrayOfInts[i - 1] > arrayOfInts[i]) {
                length = 0;
                System.out.print(arrayOfInts[i - 1] + " > " + arrayOfInts[i]);
                System.out.println(" -> descending!");
                System.out.println("RESET length to 0 √");
            }
        }
        System.out.println("MAX LENGTH: " + (maxLength + 1));
    }
    
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
