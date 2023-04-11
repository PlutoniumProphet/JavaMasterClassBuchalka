public class Looping {

    public static void main(String[] args) {

        // simple for-loop
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // simple while-loop
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // common while-loop style
        int k = 1;
        while (true) {
            if (k > 5) {
                break;
            }
            System.out.println(k);
            k++;
        }

        // do-while loop always executes first time (isReady is false)
        int m = 1;
        boolean isReady = false;
        do {
            if (m > 5) {
                break;
            }
            System.out.println(m);
            m++;
        } while (isReady);

        // continue statement skips that condition upon success evaluation
        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) { // 25 and 50 removed from list
                continue;
            }
            System.out.print(number + "_");
        }


    }
}
