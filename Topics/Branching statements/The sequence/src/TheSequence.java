import java.util.Scanner;

class TheSequence {
	public static void main(String[] args) {
		// put your code here
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int digit = 1;
		int counter = 0;
		
		// TODO: Try to find a better way to solve the problem! ;-)
		while (counter < n) {
			for (int j = 0; j < digit; j++) {
				System.out.print("" + digit + " ");
				counter++;
				
				if (counter == n) {
					//System.out.println("Goodbye!");
					break;
				}
			}
			digit++;
			//System.out.println("counter: " + counter);
			//System.out.println("digit: " + digit);
		}
	}
}
