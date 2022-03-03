class InputClass {
    public static String getString() {
        // write your code here
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        return scanner.nextLine();
    }
    /*
    public static void main(String[] args) {
        String output = getString();
        System.out.println("The input string: " + output);
    }
    */
}