package W02;

// Strings: joining with + (left to right) and three String methods.
public class W02E15 {
    public static void main(String[] args) {
        System.out.println("1" + 2 + 3);
        System.out.println(1 + 2 + "3");
        System.out.println("Total: " + 2 + 3);
        System.out.println("Total: " + (2 + 3));

        String firstName = "Nor";
        String lastName = "Badrul";
        System.out.println(firstName + " " + lastName);

        String w = "Java";
        System.out.println(w.length());
        System.out.println(w.charAt(0));
        System.out.println(w.toUpperCase());
    }
}
