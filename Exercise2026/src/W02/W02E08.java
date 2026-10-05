package W02;

// Operator precedence and parentheses.
public class W02E08 {
    public static void main(String[] args) {
        System.out.println(2 + 3 * 4);     // * before +
        System.out.println((2 + 3) * 4);   // parentheses first
        System.out.println(10 - 4 - 3);    // same level: left to right
    }
}
