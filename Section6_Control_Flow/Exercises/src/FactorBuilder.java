public class FactorBuilder {

    public static void main(String[] args) {

        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);

    }

    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            StringBuilder printString = new StringBuilder();

            for (int i = 1; i <= number; i++) {

                if (number % i == 0) {
                    printString.append(i).append(" ");
                }

            }
            System.out.println(printString);
        }
    }
}
