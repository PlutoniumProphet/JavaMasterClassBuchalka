import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ParsingAndReadingSystemInput {

    public static void main(String[] args) {

        int currentYear = 2022;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static String getInputFromConsole(int currentYear){

        // requires console not IDE compatible

        String name = System.console().readLine("Hi, what is your name? ");
        System.out.println("Hi " + name + ", thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, what is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", thanks for taking the course!");

        System.out.println("What year were you born? ");

        boolean validDob = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " + (currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDob = age < 0 ? false : true;
            } catch (NumberFormatException badInputData) {
                System.out.println("Character not allowed. Try again!");
            }
        } while (!validDob);

        return "So you are " + age + " years old";

    }

    public static int checkData(int currentYear, String dateOfBirth) {

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }
        return (currentYear - dob);
    }
}
