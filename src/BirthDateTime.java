import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        int month;
        int day;
        int hour;
        int min;

        year = getRangedInt(in, "Enter your year of birth", 1950, 2015);
        month = getRangedInt(in, "Enter your month of birth", 1, 12);

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                day = getRangedInt(in, "Enter your day of birth", 1, 30);
                break;
            case 2:
                if (isLeapYear(year)) {
                    day = getRangedInt(in, "Enter your day of birth", 1, 29);
                } else {
                    day = getRangedInt(in, "Enter your day of birth", 1, 28);
                }
                break;
            default:
                day = getRangedInt(in, "Enter your day of birth", 1, 31);
                break;
        }

        hour = getRangedInt(in, "Enter the hour you were born (0-23)", 0, 23);
        min = getRangedInt(in, "Enter the minute you were born (0-59)", 0, 59);

        System.out.printf("You were born on %d-%02d-%02d at %02d:%02d.%n", year, month, day, hour, min);
    }

    // Bu metod berilgan oraliqda foydalanuvchidan butun son oladi
    public static int getRangedInt(Scanner in, String prompt, int low, int high) {
        int input;
        do {
            System.out.print(prompt + " [" + low + "-" + high + "]: ");
            while (!in.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                in.next(); // Noto'g'ri kiritishni tozalash
                System.out.print(prompt + " [" + low + "-" + high + "]: ");
            }
            input = in.nextInt();
        } while (input < low || input > high);
        return input;
    }

    // Bu metod yilning kabisa yili ekanligini tekshiradi
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
}
