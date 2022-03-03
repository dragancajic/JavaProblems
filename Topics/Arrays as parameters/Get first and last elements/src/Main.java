import java.util.*;

public class Main {

    // write a method here
    public static int[] getFirstAndLast(int[] arrayOfInts) {
        if (arrayOfInts.length < 1) {
            System.out.println("empty array of ints!");
            return new int[] {};
        } else {
            int firstElement = arrayOfInts[0];
            int lastElement = arrayOfInts[arrayOfInts.length - 1];
            return new int[] {firstElement, lastElement};
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}