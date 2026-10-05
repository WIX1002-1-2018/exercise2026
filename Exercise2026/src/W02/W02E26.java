package W02;

// JDK 25: IO.readln asks and reads a whole line (no Scanner, no nextLine trap).
public class W02E26 {
    public static void main(String[] args) {
        double weight = Double.parseDouble(IO.readln("Weight (kg): "));
        double height = Double.parseDouble(IO.readln("Height (m): "));
        String name = IO.readln("Name: ");
        double bmi = weight / (height * height);
        IO.println("%s, BMI = %.2f".formatted(name, bmi));
    }
}
