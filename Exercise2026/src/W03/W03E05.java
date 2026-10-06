package W03;

// if: the body runs only when the condition is true. Braces group the statements of the body.
public class W03E05 {
    public static void main(String[] args) {
        int number = 5;
        if (number > 0) {
            System.out.println("The number is positive");
        }

        int mark = 42;
        if (mark < 50) {
            System.out.println("You did not pass");
            System.out.println("Try harder next time");
        }
        System.out.println("Done");
    }
}
