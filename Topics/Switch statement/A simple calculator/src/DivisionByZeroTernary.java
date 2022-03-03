import java.util.Scanner;

class DivisionByZeroTernary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long firstNumber = scanner.nextLong();
		char operator = scanner.next().charAt(0);
		long secondNumber = scanner.nextLong();
		
		switch (operator) {
			case '+':
				System.out.println(firstNumber + secondNumber);
				break;
			case '-':
				System.out.println(firstNumber - secondNumber);
				break;
			case '*':
				System.out.println(firstNumber * secondNumber);
				break;
			case '/':
				System.out.println(secondNumber == 0 ? "Division by 0!" : firstNumber / secondNumber);
				break;
			default:
				System.out.println("Unknown operator");
				break;
		}
	}
}