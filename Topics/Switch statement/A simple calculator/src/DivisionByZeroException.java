import java.util.Scanner;

class DivisionByZeroException {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long num1 = s.nextLong();
		String operation = s.next();
		long num2 = s.nextLong();
		try {
			switch (operation) {
				case "+":
					System.out.println(num1 + num2);
					break;
				case "-":
					System.out.println(num1 - num2);
					break;
				case "/":
					System.out.println(num1 / num2);
					break;
				case "*":
					System.out.println(num1 * num2);
					break;
				default:
					System.out.println("Unknown operator");
					break;
			}
		} catch (Exception e) {
			System.out.println("Division by 0!");
		}
	}
}