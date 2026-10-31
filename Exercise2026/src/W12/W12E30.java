package W12;

import java.util.ArrayList;
import java.util.Comparator;

// Try it answer for video #63 (try it yourself first): sort the same books by pages,
// first with an anonymous Comparator (shortest first), then with a lambda that turns the order around.
class BookE30 {
    final String code;
    final int pages;

    BookE30(String code, int pages) {
        this.code = code;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return code + " (" + pages + " pages)";
    }
}

public class W12E30 {
    public static void main(String[] args) {
        ArrayList<BookE30> shelf = new ArrayList<>();
        shelf.add(new BookE30("BK-0003", 420));
        shelf.add(new BookE30("BK-0001", 180));
        shelf.add(new BookE30("BK-0002", 260));

        shelf.sort(new Comparator<BookE30>() {
            @Override
            public int compare(BookE30 a, BookE30 b) {
                return Integer.compare(a.pages, b.pages);
            }
        });
        System.out.println("anonymous: " + shelf);

        shelf.sort((a, b) -> Integer.compare(b.pages, a.pages));    // longest first
        System.out.println("lambda:    " + shelf);
    }
}
