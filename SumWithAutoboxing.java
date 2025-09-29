import java.util.ArrayList;
import java.util.Scanner;

public class SumWithAutoboxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (type 'done' to finish):");
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                // String parsing → Integer object
                Integer num = Integer.parseInt(input); // autoboxing
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, enter an integer or 'done'.");
            }
        }

        int sum = 0;
        // Unboxing occurs automatically inside the loop
        for (Integer n : numbers) {
            sum += n; // unboxing
        }

        System.out.println("Sum of integers: " + sum);
        sc.close();
    }
}
