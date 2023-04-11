public class ChallengeMethodOverloading {
    public static void main(String[] args) {

        System.out.println(convertToCentimeter(78));
        System.out.println(convertToCentimeter(5,11));

    }

    public static double convertToCentimeter (int inches) {
        // convert inches to cms & return
        return inches * 2.54d;
    }
    public static double convertToCentimeter (int feet, int inches ) {
        int convertedFeet = (feet * 12) + inches;
        return convertToCentimeter(convertedFeet);
        // return convertToCentimeter((feet * 12), inches); a matter of style
    }
}