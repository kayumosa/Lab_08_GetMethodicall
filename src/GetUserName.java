import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";

        // Prompt user for first and last name
        System.out.print("Enter your first name: ");
        firstName = in.nextLine();

        System.out.print("Enter your last name: ");
        lastName = in.nextLine();

        // Output full name
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }
}

