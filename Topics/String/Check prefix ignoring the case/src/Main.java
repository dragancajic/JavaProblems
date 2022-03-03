import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        String word = scanner.next();
        
        // ~ I solution ~ [recommended solution by JetBrains Academy!]
        /*
        if (word.charAt(0) == 'J' || word.charAt(0) == 'j') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        */
        // or simplified 'if' statement would be:
        System.out.println(word.charAt(0) == 'J' || word.charAt(0) == 'j');
        
        // ~ II solution ~
        /*
        if (word.startsWith("J") || word.startsWith("j")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        */
        // or simplified if statement would be:
        //System.out.println(word.startsWith("J") || word.startsWith("j"));
    }
}