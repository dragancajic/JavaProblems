import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        String shape = scanner.next();
        
        double area = 0.0;
        
        // triangle (a, b, c) & rectangle (a, b)
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        
        // circle
        double radius = 0.0;
        
        switch (shape) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                double s = (a + b + c) / 2;
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                area = a * b;
                break;
            case "circle":
                radius = scanner.nextDouble();
                area = 3.14 * radius * radius;
                break;
            default:
                System.out.println("Unknown floor-space!");
                break;
        }
    
        if (area != 0.0) {
            System.out.println(area);
        } else {
            System.out.println("Room doesn't exist! :o)");
        }
    }
}