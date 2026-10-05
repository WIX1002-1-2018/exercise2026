package W02;

// JDK 25: an instance main method, void main(), with IO.readln and IO.println (no Scanner, no String[] args).
class W02E32 {
    void main() {
        String name = IO.readln("Your name: ");
        int age = Integer.parseInt(IO.readln("Age: "));
        IO.println("Hello, " + name + "! Next year you will be " + (age + 1) + ".");
    }
}
