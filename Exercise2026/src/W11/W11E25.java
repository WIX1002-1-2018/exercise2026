package W11;

// Try it answer for video #52 (try it yourself first): LiveSongE25 extends SongE25.
// The subclass adds a venue and reuses the parent's length() (m:ss) without copying it.
class SongE25 {
    private final String title;
    private final int seconds;

    SongE25(String title, int seconds) {
        this.title = title;
        this.seconds = seconds;
    }

    String getTitle() {
        return title;
    }

    String length() {
        int s = seconds % 60;
        return (seconds / 60) + ":" + (s < 10 ? "0" : "") + s;
    }
}

class LiveSongE25 extends SongE25 {
    private final String venue;

    LiveSongE25(String title, int seconds, String venue) {
        super(title, seconds);
        this.venue = venue;
    }

    String getVenue() {
        return venue;
    }
}

public class W11E25 {
    public static void main(String[] args) {
        LiveSongE25 live = new LiveSongE25("Negaraku", 65, "DTC, Universiti Malaya");
        System.out.println(live.getTitle() + " (" + live.length() + ") live at " + live.getVenue());
    }
}
