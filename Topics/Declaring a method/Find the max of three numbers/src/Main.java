import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        int[] arrayOfInts = {a, b, c};
        
        int max = arrayOfInts[0];
        int index = 1;
        
        for (int i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] > max) {
                max = arrayOfInts[i];
                index = i + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}