package W03;

// INTENTIONALLY MISLEADING: an else belongs to the nearest if that has no else,
// whatever the indentation says. Braces make the meaning clear.
public class W03E10 {
    public static void main(String[] args) {
        int age = 20;
        boolean hasLicence = false;

        // Misleading indentation: this else belongs to the inner if (hasLicence).
        if (age >= 18)
            if (hasLicence)
                System.out.println("You may drive");
        else
            System.out.println("Too young to drive");

        // Braces make the meaning clear.
        if (age >= 18) {
            if (hasLicence) {
                System.out.println("You may drive");
            } else {
                System.out.println("Get a licence first");
            }
        } else {
            System.out.println("Too young to drive");
        }
    }
}
