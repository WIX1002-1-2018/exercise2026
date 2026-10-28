package W10;

// Try it answer for video #51 (try it yourself first): a record ScoreE30(String name, int score) whose
// compact constructor allows 0 to 100 only. Build records from text lines "name,score" with Integer.parseInt.
record ScoreE30(String name, int score) {
    ScoreE30 {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("score must be 0 to 100");
        }
    }
}

public class W10E30 {
    public static void main(String[] args) {
        String[] lines = {"Aisyah,78", "Ben,91", "Chong,64"};
        ScoreE30 best = null;
        for (String line : lines) {
            String[] part = line.split(",");
            ScoreE30 s = new ScoreE30(part[0], Integer.parseInt(part[1]));
            System.out.println(s);
            if (best == null || s.score() > best.score()) {
                best = s;
            }
        }
        System.out.println("Best: " + best.name() + " with " + best.score());
    }
}
