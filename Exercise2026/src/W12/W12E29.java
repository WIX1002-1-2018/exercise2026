package W12;

import java.util.ArrayList;

// Try it answer for video #62 (try it yourself first): books in an ArrayList, natural order by code.
// compareTo uses the code, and so do equals and hashCode, so the order and equality agree.
class BookE29 implements Comparable<BookE29> {
    final String code;
    final String title;

    BookE29(String code, String title) {
        this.code = code;
        this.title = title;
    }

    @Override
    public int compareTo(BookE29 other) {
        return code.compareTo(other.code);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof BookE29 other && code.equals(other.code);
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
}

public class W12E29 {
    public static void main(String[] args) {
        ArrayList<BookE29> shelf = new ArrayList<>();
        shelf.add(new BookE29("BK-0003", "Data Structures"));
        shelf.add(new BookE29("BK-0001", "Java Basics"));
        shelf.add(new BookE29("BK-0002", "Networks"));
        shelf.sort(null);
        for (BookE29 b : shelf) {
            System.out.println(b.code + " " + b.title);
        }
        System.out.println(shelf.size() + " books");
    }
}
