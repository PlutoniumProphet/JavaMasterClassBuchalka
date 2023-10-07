import java.util.Scanner;

public class MinAndMaxNumberChalllenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double min = 0;
        double max = 0;

        boolean validNumber = true;

        while (validNumber) {
            try {
                System.out.println("Please enter a number or any character to quit: ");
                String nextNumber = scanner.nextLine();
                double userInput = Double.parseDouble(nextNumber);

                if ((userInput <= min || min == 0)) {
                    min = userInput;
                }

                if (userInput >= max) {
                    max = userInput;
                }

            } catch (NumberFormatException e) {
                validNumber = false;
                System.out.println("The minimum number entered is " + min + " and the maximum number is " + max + ".");
            }
        }
    }
}
