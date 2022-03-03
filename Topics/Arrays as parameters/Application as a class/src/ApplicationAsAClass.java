//import java.util.Arrays;
//import java.util.Scanner;
//
//class ApplicationAsAClass {
//
//	String name;
//
//	public ApplicationAsAClass() {
//		this.name = "SimpleApplication";
//	}
//
//	void run(String[] args) {
//		// implement me
//		System.out.println(this.name);
//
//		for (String arg : args) {
//			System.out.println(arg);
//		}
//	}
//
//	// TODO: Tests on JetBrain's testing server don't pass! Try to fix the problem!!!
//	public static void main(String[] args) {
//		final ApplicationAsAClass app = new ApplicationAsAClass();
//
//		final Scanner scanner = new Scanner(System.in);
//		String[] array = Arrays.stream(scanner.nextLine().split(" "))
//				.toArray(String[]::new);
//		app.run(array);
//	}
//}
