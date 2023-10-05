public class BarkingDog {
    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        boolean result = false;
        if (barking) {
            if ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <= 23)) {
                result = true;
            }
        }
        return result;
    }
}