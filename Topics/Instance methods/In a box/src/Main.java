class Box {

    double height;
    double width;
    double length;

    // write a method here
    double getVolume() {
        return this.height * this.width * this.length;
        //return height * width * length; //<-- works without 'this.' keyword!
    }
    /*
    public static void main(String[] args) {
        Box box = new Box();
        box.height = 10;
        box.width = 5;
        box.length = 3;
    
        System.out.println(box.getVolume());
    }
    */
}