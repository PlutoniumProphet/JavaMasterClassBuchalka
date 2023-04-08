public class SwitchChallnge2 {

    public static void main(String[] args) {

        printDayOWeek(0);
        printDayOWeek(1);
        printDayOWeek(2);
        printDayOWeek(3);
        printDayOWeek(4);
        printDayOWeek(5);
        printDayOWeek(6);
        printDayOWeek(7);
    }

    public static void printDayOWeek ( int day){

        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println(day + " stands for " + dayOfWeek);
    }
}
