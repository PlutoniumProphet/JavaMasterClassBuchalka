public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }

    public static boolean isPalindrome(int number) {

        // remove the negative problem
        if (number < 0)
            {
                number *= -1;
            }

        int originalNumber = number;
        int reverse = 0;


        while (number > 0) {
            int digit = number % 10; // right-most digit
            reverse = (reverse * 10) + digit; //left-most digit is preserved
            number /= 10; // drop the right-most digit

        }

        return reverse == originalNumber;
    }
}
