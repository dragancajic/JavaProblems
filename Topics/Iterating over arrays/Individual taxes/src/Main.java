import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int[] incomes = new int[n];
        for (int i = 0; i < n; i++) {
            incomes[i] = scanner.nextInt();
        }
        
        double[] taxes = new double[n];
        for (int i = 0; i < n; i++) {
            taxes[i] = scanner.nextInt() * 1.0 * incomes[i];
        }
        
        double maxTax = taxes[0];
        for (int i = 0; i < n; i++) {
            if (taxes[i] > maxTax) {
                maxTax = taxes[i];
            }
        }
        
        int noOfCompany = findIndexOfElement(taxes, maxTax) + 1; // index + 1
        System.out.println(noOfCompany);
    }
    
    public static int findIndexOfElement(double[] array, double element) {
        int index = -1;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }
        return index;
    }
}