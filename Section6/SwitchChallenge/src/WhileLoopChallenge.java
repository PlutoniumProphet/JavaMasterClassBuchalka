public class WhileLoopChallenge {
    public static void main(String[] args) {
        int number = 5;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= 20) {
            if (isEvenNumber(number)) {
                if (evenCount < 5) {
                    System.out.println("Even Number: " + number);
                    evenCount++;
                } else {
                    System.out.println("There were " + evenCount
                            + " even and " + oddCount + " odd numbers.");
                    break;
                }
            } else oddCount++;
            number++;
        }
    }

    public static boolean isEvenNumber(int number){
        return (number % 2 == 0);
    }
}
