//import java.util.Arrays;

class CreateCube {
    
    public static void createCube() {
        // write your code here
        int[][][] cube = new int[3][3][3];
        
        int element = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    cube[i][j][k] = element++;
                }
            }
            element = 0;
        }
        /*
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(cube[i][j][k] + " ");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
        */
        // or by using from java.util package
        // public static String Arrays.toString(int[]) method:
        /*
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Arrays.toString(cube[i][j]) + "\t");
            }
            System.out.println();
        }
        */
    }
    /*
    public static void main(String[] args) {
        createCube();
    }
    */
}