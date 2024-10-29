package TextBlockAndStringFormaters;

public class main {
    public static void main(String[] args) {

        String bulletIt = "Print as Bulleted list:\n " +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        // text block
        String textBlock = """
                Print a Bulleted list:
                    \u2022 First Point
                        \u2022 Sub Point""";

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d%n", age);

        // formatting 2 dp (default is 6)
        System.out.printf("Your age is %.2f%n", (float) age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d and year of birth is %d%n", age, yearOfBirth);

        for (int i = 1; i < 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i );
        }

        // more formatting options 
        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

    }
}
