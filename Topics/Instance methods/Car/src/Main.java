class Car {

    int yearModel;
    String make;
    int speed;
    
    void accelerate() {
        this.speed += 5;
    }
    
    void brake() {
        if (this.speed >= 5) {
            this.speed -= 5;
        } else {
            this.speed = 0;
        }
    }
    /*
    public static void main(String[] args) {
        Car yugo45 = new Car();
        yugo45.speed = 45;
    
        yugo45.accelerate();
        yugo45.accelerate();
        yugo45.accelerate();
        System.out.println(yugo45.speed);
        
        yugo45.brake();
        System.out.println(yugo45.speed);
    }
    */
}