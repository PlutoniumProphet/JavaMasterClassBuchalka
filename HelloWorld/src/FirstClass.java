public class FirstClass {
    public static void main(String[] args) {


        double firstValue = 20.00d; // step 1
        double secondValue = 80.00d; // step 2

        double addThenMultiplyValues = (firstValue + secondValue) * 100d; // step 3

        double remainderResult = addThenMultiplyValues % 40.00d; // step 4

        boolean isVariableTrue = remainderResult == 0.00d; // step 5

        System.out.println("The remainder is zero: " + isVariableTrue); // step 6

        if (!isVariableTrue) {
            System.out.println("got some remainder");
        }
    }
}
