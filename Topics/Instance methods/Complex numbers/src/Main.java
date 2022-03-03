class Complex {

    double real;
    double image;

    // write methods here
    void add(Complex num) {
        this.real += num.real;
        this.image += num.image;
        /*
        if (imgPart < 0) {
            System.out.println("number = " + realPart + " - " + Math.abs(imgPart) + "i");
        } else {
            System.out.println("number = " + realPart + " + " + imgPart + "i");
        }
        */
    }
    
    void subtract(Complex num) {
        this.real -= num.real;
        this.image -= num.image;
        /*
        if (imgPart < 0) {
            System.out.println("number = " + realPart + " - " + Math.abs(imgPart) + "i");
        } else {
            System.out.println("number = " + realPart + " + " + imgPart + "i");
        }
        */
    }
    /*
    public static void main(String[] args) {
        Complex number1 = new Complex();
        number1.real = -10;
        number1.image = -4;
        
        Complex number2 = new Complex();
        number2.real = -6;
        number2.image = -6;
        
        number1.add(number2);
        number1.subtract(number2);
    }
    */
}