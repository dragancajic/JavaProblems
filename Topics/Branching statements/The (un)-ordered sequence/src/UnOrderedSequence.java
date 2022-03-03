import java.util.Scanner;

class UnOrderedSequence {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        boolean ascending = true;
        boolean descending = true;
        boolean ordered = true;
        int first = scanner.nextInt();
        int next = scanner.nextInt();
        
        while (next != 0) {
            System.out.println("» -~-~- start iteration ~-~-~-");
            System.out.println("first: " + first + ", " + "next: " + next);
            
            if (next == first) {
                next = scanner.nextInt();
                continue;
            }
            
            if (next > first) {
                descending = false;
                ordered &= ascending;
                System.out.println("current: ascending!");
            } else {
                ascending = false;
                ordered &= descending;
                System.out.println("current: descending!");
            }
            System.out.println("ordered: " + ordered);
            
            first = next;
            next = scanner.nextInt();
            
            System.out.println("first: " + first + ", " + "next: " + next);
            System.out.println("o-o-o- finish iteration -o-o-o");
        }
        
        System.out.println("ascending: " + ascending);
        System.out.println("descending: " + descending);
        System.out.print("ordered: ");
        //ordered = ascending ^ descending; <-- don't use this: test # 5 [1000 0, false!]
        System.out.println(ordered);
    }
}
