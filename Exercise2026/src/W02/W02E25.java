package W02;

// Modern Java: a text block (Java 15) and newer String methods (Java 11 and 15).
public class W02E25 {
    public static void main(String[] args) {
        String menu = """
            1. Add student
            2. Show average
            3. Exit
            """;
        System.out.print(menu);

        System.out.println("[" + "  hi  ".strip() + "]");
        System.out.println("   ".isBlank());
        System.out.println("ab".repeat(3));
        System.out.println("%s is %d".formatted("Ali", 19));
    }
}
