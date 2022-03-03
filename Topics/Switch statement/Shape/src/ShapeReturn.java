import java.util.Scanner;
class ShapeReturn {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int typeOfShape = scanner.nextInt();
		String selectedShape;
		switch (typeOfShape) {
			case 1: {
				selectedShape = "square";
				break;
			}
			case 2: {
				selectedShape = "circle";
				break;
			}
			case 3: {
				selectedShape = "triangle";
				break;
			}
			case 4: {
				selectedShape = "rhombus";
				break;
			}
			default: {
				System.out.println("There is no such shape!");
				return;
			}
		}
		System.out.println("You have chosen a " + selectedShape);
		scanner.close();
		System.out.println("scanner is closed!");
	}
}