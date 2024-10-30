import java.util.Scanner;

public class TicketCostCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input age and number of tickets
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter number of tickets: ");
        int tickets = scanner.nextInt();

        // Determine ticket price based on age
        int price;
        if (age >= 60) {
            price = 30; // Senior citizen price
        } else if (age <= 12) {
            price = 20; // Child price
        } else {
            price = 50; // Regular price
        }

        // Calculate total cost
        int totalCost = price * tickets;

        // Display total cost
        System.out.println("Total cost for " + tickets + " tickets: ₹" + totalCost);

        scanner.close();
    }
}
