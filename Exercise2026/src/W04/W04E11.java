package W04;

// The update can be any step: up by 5, down by 2, or through the letters of the alphabet.
public class W04E11 {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 10; i >= 0; i -= 2) {      // counting down by 2
            System.out.print(i + " ");
        }
        System.out.println();

        for (char c = 'A'; c <= 'J'; c++) {     // a char is a number underneath (Week 2), so ++ works
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
