import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        String stringOne = scanner.nextLine();
        String stringTwo = scanner.nextLine();
        
        /*
        for (int i = 0; i < stringOne.length(); i++) {
            if (stringOne.charAt(i) == '\u0020') {
                stringOne = stringOne.replace(" ", "");
            }
        }
        System.out.println(stringOne);
        */
        stringOne = removeWhitespaces(stringOne);
        //System.out.println(stringOne);
        stringTwo = removeWhitespaces(stringTwo);
        //System.out.println(stringTwo);
        
        System.out.println(stringOne.equalsIgnoreCase(stringTwo));
    }
    
    public static String removeWhitespaces(String string) {
        String newString = null;
        
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '\u0020') {
                newString = string.replace(" ", "");
            }
        }
    
        if (newString == null) {
            return string;
        } else {
            return newString;
        }
    }
}