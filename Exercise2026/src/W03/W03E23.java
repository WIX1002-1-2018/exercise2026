package W03;

// Try it answer for video #15 (try it yourself first): entry needs attendance of at least 80 AND the fee paid.
public class W03E23 {
    public static void main(String[] args) {
        int attendance = 85;
        boolean feePaid = false;
        System.out.println(attendance >= 80 && feePaid);
        feePaid = true;
        System.out.println(attendance >= 80 && feePaid);
    }
}
