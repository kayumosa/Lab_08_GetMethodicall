import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String SSN = getRegExString(in, "Enter your social security number: ", "\\d{3}-\\d{2}-\\d{4}");
        String MNumber = getRegExString(in, "Enter your M number: ", "^(M|m)\\d{5}$");
        String menuChoice = getRegExString(in, "Enter your menu choice (O/S/V/Q): ", "^[OoSsVvQq]$");

        System.out.println("Your SSN is: " + SSN);
        System.out.println("Your M number is: " + MNumber);
        System.out.println("Your menu choice is: " + menuChoice);

        in.close();
    }

    // Foydalanuvchidan berilgan regexga mos keluvchi matn olish metodi
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String retString;
        while (true) {
            System.out.print(prompt);
            retString = pipe.nextLine().trim();
            if (retString.matches(regEx)) {
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
        return retString;
    }
}
