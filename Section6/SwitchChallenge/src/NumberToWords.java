public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(100));
        System.out.println((numberToWords(-2)));

    }

    public static StringBuilder numberToWords(int number) {

        if (number < 0) {
            return new StringBuilder("Invalid Value");
        }

        int revNumber = reverse(number); // handle the number coming out reversed
        StringBuilder wordList = new StringBuilder();

        for (int i = 0; i < getDigitCount(number); i++) {
            int lastDigit = revNumber % 10;

            String numberAsWord = switch (lastDigit) {
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> "Invalid Value";
            };

            wordList.append(numberAsWord).append(" ");
            revNumber /= 10; // drop the last digit from the loop
        }
        return wordList;
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int counter = 1;
        while (number > 9) {
            number /= 10;
            counter ++;
        }
        return counter;
    }
}
