package W09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

// Methods for files: save an array to a file and load it back.
// The first line stores how many numbers follow, so load knows the array size.
public class W09E13 {
    static void saveScores(String fileName, int[] scores) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter(fileName)) {
            out.println(scores.length);
            for (int s : scores) {
                out.println(s);
            }
        }
    }

    static int[] loadScores(String fileName) throws FileNotFoundException {
        try (Scanner in = new Scanner(new File(fileName))) {
            int[] scores = new int[in.nextInt()];
            for (int i = 0; i < scores.length; i++) {
                scores[i] = in.nextInt();
            }
            return scores;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        int[] quiz = {7, 9, 6, 10, 8};
        saveScores("quiz_scores.txt", quiz);
        int[] back = loadScores("quiz_scores.txt");
        System.out.println("Loaded " + back.length + " scores: " + Arrays.toString(back));
    }
}
