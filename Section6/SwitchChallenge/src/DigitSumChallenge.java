public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(1000));
        System.out.println(sumDigits(6));
    }

    public static int sumDigits (int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 9) {
            sum += (number % 10); // extract the right-most number
            number /= 10; // truncate the right-most number
        }
        sum += number; // single digit so set as sum
        return sum;

    }
}
