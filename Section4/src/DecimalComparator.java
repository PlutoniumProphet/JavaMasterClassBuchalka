public class DecimalComparator {
    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {

       // move decimal place 3 spaces
       int firstNum = (int) (num1 * 1000);
       int secondNum = (int) (num2 * 1000);

       if (firstNum - secondNum == 0) {
           return true;
       } else {
           return false;
       }
    }
}