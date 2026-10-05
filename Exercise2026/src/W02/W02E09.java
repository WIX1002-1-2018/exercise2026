package W02;

// Postfix x++ and prefix ++x.
public class W02E09 {
    public static void main(String[] args) {
        int x = 5;
        int y = x++;   // y gets the old value, then x becomes 6
        System.out.println("x = " + x + ", y = " + y);

        int p = 5;
        int q = ++p;   // p becomes 6 first, then q gets 6
        System.out.println("p = " + p + ", q = " + q);
    }
}
