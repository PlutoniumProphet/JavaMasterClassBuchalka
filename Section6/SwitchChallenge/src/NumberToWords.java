public class NumberToWords {
    public static void main(String[] args) {

        //TODO
    }

    public static void numberToWords(int number) {
        //TODO

        while (number > 0) {
            int lastDigit = number % 10;

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


            StringBuilder wordList = new StringBuilder();
            wordList.append(numberAsWord).append(" ");

            number -= 1;
        }
    }

    public static String reverse(int number) {
        //TODO
        return null;
    }
}
