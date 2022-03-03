// You can experiment here, it won’t be checked

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		// put your code here
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input $ amount: ");
		int dollars = scanner.nextInt();
		
		if (dollars < 1000) {
			System.out.println("By a laptop");
		}
	}
}
