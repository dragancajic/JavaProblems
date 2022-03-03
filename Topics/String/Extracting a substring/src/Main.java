import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        String word = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        /*
        for (int i = start; i <= end; i++) {
            if (start >= 0 && end < word.length()) {
                System.out.print(word.charAt(i));
            }
        }
        */
        //System.out.println(); // empty line
        // or use String.substring(int, int) function:
        System.out.println(word.substring(start, end + 1));
    }
}