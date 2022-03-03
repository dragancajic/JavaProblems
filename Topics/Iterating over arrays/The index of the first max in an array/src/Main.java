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
        
        int indexOfFirstMax = 0;
        int maximum = arrayOfInts[indexOfFirstMax];
        
        for (int i = 0; i < size; i++) {
            if (arrayOfInts[i] > maximum) {
                maximum = arrayOfInts[i];
                indexOfFirstMax = i;
            }
        }
        System.out.println(indexOfFirstMax);
        
        // call findIndex(int[], int) function from main function
        //int indexOfFirstMaximum = findIndex(arrayOfInts, maximum);
        //System.out.println(indexOfFirstMaximum);
    }
    /*
    // find index of first maximum (or any given element in array!)
    public static int findIndex(int[] arrayOfElements, int element) {
        for (int index = 0; index < arrayOfElements.length; index++) {
            if (arrayOfElements[index] == element) {
                return index;
            }
        }
        return -1;
    }
    */
}