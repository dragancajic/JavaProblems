import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int durationInDays = scanner.nextInt();
        int totalFoodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int costOfOneNightInAHotel = scanner.nextInt();
        
        int total = durationInDays * totalFoodCostPerDay + 2 * oneWayFlightCost +
                costOfOneNightInAHotel * (durationInDays - 1);
    
        System.out.println(total);
    }
}