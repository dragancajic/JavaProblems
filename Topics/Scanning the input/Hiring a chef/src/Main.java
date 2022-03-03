//put imports you need here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        String firstName = scanner.nextLine();
        //String age = scanner.nextLine();
        scanner.nextLine();
        //String stageOfEducation = scanner.nextLine();
        scanner.nextLine();
        //String yearsOfExperience = scanner.nextLine();
        scanner.nextLine();
        String cuisinePreference = scanner.nextLine();
    
        System.out.print("The form for " + firstName + " is completed. ");
        System.out.print("We will contact you if we need a chef that cooks " +
                cuisinePreference + " dishes.");
    }
}