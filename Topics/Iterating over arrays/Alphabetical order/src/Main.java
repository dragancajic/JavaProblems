import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        String[] strings = scanner.nextLine().toLowerCase().split(" ");
        
        boolean isInAlphabeticalOrder = false;
        
        for (int i = 1; i < strings.length; i++) {
            if (strings[i - 1].compareTo(strings[i]) <= 0) {
                isInAlphabeticalOrder = true;
                //System.out.println(strings[i - 1] + " < " + strings[i] +
                        //" -> " + strings[i - 1].compareTo(strings[i]));
            }
            
            if (strings[i - 1].compareTo(strings[i]) > 0) {
                //System.out.println(strings[i - 1] + " > " + strings[i] +
                        //" -> " + strings[i - 1].compareTo(strings[i]));
                isInAlphabeticalOrder = false;
                break;
            }
            
            if (!isInAlphabeticalOrder) {
                break;
            }
        }
        System.out.println(isInAlphabeticalOrder);
    }
}