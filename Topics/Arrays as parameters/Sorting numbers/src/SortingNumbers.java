import java.util.Arrays;
import java.util.Scanner;

public class SortingNumbers {
    
    public static void sort(int[] numbers) {
        // write your code here
        
        // TODO: Try to implement correct algorithm for sorting!
        int min = numbers[0];
    
        for (int i = 1; i < numbers.length; i++) {
            while (min != numbers[0]) {
                if (numbers[i - 1] > numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i - 1];
                    numbers[i - 1] = temp;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }
        
        //Arrays.sort(numbers);
    }
    
    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}
