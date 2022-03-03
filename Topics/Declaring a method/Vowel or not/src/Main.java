import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here
        char chLowerCase = Character.toLowerCase(ch);
    
        return chLowerCase == 'a' || chLowerCase == 'e' ||
                chLowerCase == 'i' || chLowerCase == 'o' || chLowerCase == 'u';
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}