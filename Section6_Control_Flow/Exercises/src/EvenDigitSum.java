public class EvenDigitSum {

    public static void main(String[] args) {

       System.out.println(getEvenDigitSum(2000));
        System.out.println(getEvenDigitSum(123456789));
    }


    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0){
            int remainder = number % 10;
            if ((remainder % 2) == 0) sum += remainder;
            else sum += 0;
            //sum += ((remainder % 2) == 0) ? remainder : 0;  nice ternary but does it loose readability?
            number /= 10;
        }
        return sum;
    }
}
