package W04;

// Loop over the characters of a String: index 0 to length() - 1, so the condition is i < length().
public class W04E12 {
    public static void main(String[] args) {
        String text = "Universiti Malaya";
        int vowels = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
        }
        System.out.println(text + " has " + vowels + " vowels");
    }
}
