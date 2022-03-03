class Circle {

    double radius;

    // write methods here
    double getLength() {
        return 2 * radius * Math.PI;
    }
    
    double getArea() {
        return radius * radius * Math.PI;
    }
    /*
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 4;
    
        System.out.println("circumference: " + circle.getLength());
        System.out.println("area of this circle: " + circle.getArea());
        
        System.out.printf("circumference/perimeter: %.2f\n", circle.getLength()); // 0.2f
        System.out.printf("area of this circle: %.2f\n", circle.getArea()); // 2 decimals
    }
    */
}