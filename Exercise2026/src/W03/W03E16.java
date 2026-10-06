package W03;

// The conditional operator ?: picks one of two values: condition ? valueIfTrue : valueIfFalse
public class W03E16 {
    public static void main(String[] args) {
        int x = -7;
        int y = x >= 0 ? x : -x;                // absolute value (except Integer.MIN_VALUE, which overflows)
        System.out.println("y = " + y);

        int mark = 65;
        String result = mark >= 50 ? "Pass" : "Fail";
        System.out.println(result);

        int count = 1;
        System.out.println(count + (count == 1 ? " file" : " files"));
    }
}
