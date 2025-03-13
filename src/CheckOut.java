import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        double totalPrice = 0;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the price of your item (0.10 to 10.00): ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number between 0.10 and 10.00.");
                in.next(); // Noto'g'ri kirishni tozalash
            }
            double price = in.nextDouble();
            if (price < 0.10 || price > 10.00) {
                System.out.println("Please enter a price between 0.10 and 10.00.");
                continue;
            }
            totalPrice += price;

            System.out.print("Do you have more items? (y/n): ");
            String response = in.next().trim().toLowerCase();
            if (response.equals("n")) {
                break;
            } else if (!response.equals("y")) {
                System.out.println("Invalid input. Please enter 'y' for yes or 'n' for no.");
            }
        }

        System.out.printf("Total price of your items is: %.2f%n", totalPrice);
        in.close();
    }
}



