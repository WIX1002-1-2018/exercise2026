package W10;

// Try it answer for video #46 (try it yourself first): a class SongE25 with a title and a length in seconds,
// and a method length() that returns the time as m:ss. Make two songs and print them.
class SongE25 {
    String title;
    int seconds;

    String length() {
        int s = seconds % 60;
        String pad = "";
        if (s < 10) {
            pad = "0";                              // 3:05, not 3:5
        }
        return (seconds / 60) + ":" + pad + s;
    }
}

public class W10E25 {
    public static void main(String[] args) {
        SongE25 a = new SongE25();
        a.title = "Negaraku";
        a.seconds = 65;

        SongE25 b = new SongE25();
        b.title = "Lofi study mix";
        b.seconds = 185;

        System.out.println(a.title + " (" + a.length() + ")");
        System.out.println(b.title + " (" + b.length() + ")");
    }
}
