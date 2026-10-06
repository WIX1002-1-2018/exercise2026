package W03;

// Logical operators join conditions: && (and), || (or), ! (not).
public class W03E02 {
    public static void main(String[] args) {
        int mark = 75, attendance = 85;
        System.out.println(mark >= 50 && attendance >= 80);   // true only if both are true
        System.out.println(mark >= 80 || attendance >= 80);   // true if at least one is true
        System.out.println(!(mark >= 50));                     // ! flips true and false
    }
}
