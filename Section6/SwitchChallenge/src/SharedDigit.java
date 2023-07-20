public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }

    public static boolean hasSharedDigit(int num1, int num2) {

        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        int num1lastDigit = num1 % 10;
        int num1FirstDigit = num1 /= 10;
        int num2lastDigit = num2 % 10;
        int num2FirstDigit = num2 /= 10;

        if ((num1FirstDigit != num2FirstDigit) || (num1FirstDigit != num2lastDigit)) {
            if ((num1lastDigit != num2FirstDigit) || (num1lastDigit != num2lastDigit)) {
                return false;
            }
        } return true;
    }
}
