public class SwitchChallenge {

    public static void main(String[] args) {

        char alpha_character = 'A';

        // traditional switch statement (return statements)
        switch (alpha_character) {
            case 'A':
                System.out.println(alpha_character + " = Able");
                break;
            case 'B':
                System.out.println(alpha_character + " = Baker");
                break;
            case 'C':
                System.out.println(alpha_character + " = Charlie");
                break;
            case 'D':
                System.out.println(alpha_character + " = Dog");
                break;
            case 'E':
                System.out.println(alpha_character + " = Easy");
                break;
            default:
                System.out.println(alpha_character + " Not Found");
        }
    }
}
