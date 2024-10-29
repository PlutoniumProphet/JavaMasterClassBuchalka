package PrintInformation;

public class StringMethods {

    public static void main(String[] args) {

        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982"); // pos 6
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex)); // arg of substring startpoint

        System.out.println("Month = " + birthDate.substring(3, 5));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate = " + newDate);

        // bad code but for trial. Each call creates a string...
        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = " + newDate);

        // more efficients as bitcode uses a string literal
        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("newDate = " + newDate);

        // method chaining - each call is a new string being created...still.
        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("2", "00"));

        // uses a regex under the bonnet
        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        //chaining with indent
        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        // negative indent
        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));

    }
}
