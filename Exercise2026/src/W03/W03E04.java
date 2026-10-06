package W03;

// && is done before ||. Use parentheses to say what you mean.
public class W03E04 {
    public static void main(String[] args) {
        boolean member = true, weekend = false, holiday = false;
        System.out.println(member || weekend && holiday);     // read as: member || (weekend && holiday)
        System.out.println((member || weekend) && holiday);   // the parentheses change the answer
    }
}
