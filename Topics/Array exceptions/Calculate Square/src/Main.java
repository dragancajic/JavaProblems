class FixingExceptions {

    public static void calculateSquare(int[] array, int index) {
        // write your code here
        if (array == null || index < 0 || index > array.length - 1) {
            System.out.println("Exception!");
        } else {
            System.out.println(array[index] * array[index]);
        }
    }
    /*
    public static void main(String[] args) {
        calculateSquare(new int[] {1, 2, 3}, 1);
        calculateSquare(new int[] {1, 2, 3}, -1);
        calculateSquare(new int[] {1, 2, 3}, 0);
        calculateSquare(new int[] {1, 2, 3}, 3);
        calculateSquare(new int[] {1, 2, 3}, 2);
    }
    */
}