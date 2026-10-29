package W11;

import java.util.Objects;

// Try it answer for video #55 (try it yourself first): books are equal when their codes are equal.
// EBookE28 adds a file size to toString with super.toString(); equals and hashCode stay final.
class BookE28 {
    private final String code;
    final String title;

    BookE28(String code, String title) {
        this.code = Objects.requireNonNull(code);
        this.title = title;
    }

    @Override
    public String toString() {
        return title + " [" + code + "]";
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BookE28 other)) {
            return false;
        }
        return code.equals(other.code);
    }

    @Override
    public final int hashCode() {
        return code.hashCode();
    }
}

class EBookE28 extends BookE28 {
    final double sizeMb;

    EBookE28(String code, String title, double sizeMb) {
        super(code, title);
        this.sizeMb = sizeMb;
    }

    @Override
    public String toString() {
        return super.toString() + ", e-book " + sizeMb + " MB";
    }
}

public class W11E28 {
    public static void main(String[] args) {
        BookE28 a = new BookE28("BK-0001", "Java Basics");
        EBookE28 b = new EBookE28("BK-0001", "Java Basics", 4.5);
        BookE28 c = new BookE28("BK-0002", "Clean Loops");
        System.out.println(a);
        System.out.println(b);
        System.out.println("a.equals(b): " + a.equals(b) + ", a.equals(c): " + a.equals(c));
        System.out.println("same hashCode for a and b: " + (a.hashCode() == b.hashCode()));
    }
}
