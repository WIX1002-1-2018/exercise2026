package W03;

// && and || are evaluated left to right and stop early (short-circuit) once the answer is known.
public class W03E03 {
    public static void main(String[] args) {
        int count = 0, total = 0;
        // && : the left side is false, so the right side (total / count) is never evaluated.
        System.out.println(count != 0 && total / count > 50);
        // || : the left side is true, so the right side is never evaluated.
        boolean isEmpty = count == 0;
        System.out.println(isEmpty || total / count > 50);
        // Try it: remove the // below and run. The division now comes first.
        // System.out.println(total / count > 50 && count != 0);
        //   run-time error: Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}
