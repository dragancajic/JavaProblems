import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        
        for (int i = 0; i < n; i++) {
            int grade = scanner.nextInt();
            
            if (grade == 5) {
                gradeA++;
            }
            
            if (grade == 4) {
                gradeB++;
            }
            
            if (grade == 3) {
                gradeC++;
            }
            
            if (grade == 2) {
                gradeD++;
            }
        }
    
        System.out.println(gradeD + " " + gradeC + " " + gradeB + " " + gradeA);
    }
}