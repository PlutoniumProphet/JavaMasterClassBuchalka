public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945)); // this is the first test
        System.out.println(getDurationString(-65,45)); // seconds test case
        System.out.println(getDurationString(65, 145)); // third test case
        System.out.println(getDurationString(65, 45)); // fourth test case
        System.out.println(getDurationString(3945)); // fifth test case
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds + "), must be a positive integer";
        }

        // pass the expressions directly in the call
        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes + "), must be a positive integer";
        }

        if (seconds <= 0 || seconds >=59) {
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";

    }

}
