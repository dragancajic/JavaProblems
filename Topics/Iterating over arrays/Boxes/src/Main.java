import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int z1 = scanner.nextInt();
    
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int z2 = scanner.nextInt();
        
        int[] box1 = {x1, y1, z1};
        int[] box2 = {x2, y2, z2};
        
        boolean isIncompatible = false;
        
        Arrays.sort(box1);
        //System.out.println(Arrays.toString(box1));
        int countSize1 = 0;
    
        Arrays.sort(box2);
        //System.out.println(Arrays.toString(box2));
        int countSize2 = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (box2[j] < box1[i] && i == j) {
                    countSize1++;
                    //System.out.println("box 1: " + countSize1);
                }
                
                if (box2[j] > box1[i] && i == j) {
                    countSize2++;
                    //System.out.println("box 2: " + countSize2);
                }
                
                if (box2[j] == box1[i] && i == j) {
                    isIncompatible = true;
                    //System.out.println("incompatible: " + isIncompatible);
                }
            }
        }
        
        if (countSize1 == 3) {
            System.out.println("Box 1 > Box 2");
        }
        
        if (countSize2 == 3) {
            System.out.println("Box 1 < Box 2");
        }
        
        if (isIncompatible) {
            System.out.println("Incompatible");
        }
    }
}