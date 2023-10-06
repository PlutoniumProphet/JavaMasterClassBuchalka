public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

    }

    public static boolean isValid(int num) { return num > 9 && num < 1001; }


    public static boolean hasSameLastDigit(int n1, int n2, int n3) {

        if (isValid(n1) && isValid(n2) && isValid(n3)) {

            n1 %= 10;
            n2 %= 10;
            n3 %= 10;

            return (n1 == n2) || (n1 == n3) || (n2 == n3);
        }
        return false;
    }
}