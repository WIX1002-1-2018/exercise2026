package W10;

// Try it answer for video #50 (try it yourself first): a playlist as an array of SongE29 objects.
// Print each song, the total length in minutes and seconds, and the longest song.
class SongE29 {
    private final String title;
    private final int seconds;

    SongE29(String title, int seconds) {
        this.title = title;
        this.seconds = seconds;
    }

    String getTitle() {
        return title;
    }

    int getSeconds() {
        return seconds;
    }
}

public class W10E29 {
    public static void main(String[] args) {
        SongE29[] playlist = {
            new SongE29("Negaraku", 65),
            new SongE29("Lofi study mix", 185),
            new SongE29("Campus radio jingle", 20)
        };
        int total = 0, longest = 0;
        for (int i = 0; i < playlist.length; i++) {
            System.out.println((i + 1) + ". " + playlist[i].getTitle()
                    + ", " + playlist[i].getSeconds() + " s");
            total += playlist[i].getSeconds();
            if (playlist[i].getSeconds() > playlist[longest].getSeconds()) {
                longest = i;
            }
        }
        System.out.println("Total: " + total / 60 + " min " + total % 60 + " s");
        System.out.println("Longest: " + playlist[longest].getTitle());
    }
}
