import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        String prompt1 = "Enter your favourite integer: ";
        int favInt;
        Scanner in = new Scanner(System.in);

        // Foydalanuvchidan butun son olish
        System.out.print(prompt1);
        while (!in.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            in.next(); // Noto'g'ri kirishni tozalash
            System.out.print(prompt1);
        }
        favInt = in.nextInt();

        // Natijani chiqarish
        System.out.println("Your favourite integer is: " + favInt);
    }
}

