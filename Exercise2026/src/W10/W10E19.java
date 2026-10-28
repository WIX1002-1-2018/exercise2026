package W10;

// The Character wrapper class: static methods that test or change one char.
// Check a tracking code: two capital letters, then five digits (for example MY10001).
// (isLetter and isDigit also accept letters and digits of other languages, not only A to Z and 0 to 9.)
public class W10E19 {
    static boolean isTrackingCode(String code) {
        if (code == null || code.length() != 7) {
            return false;
        }
        for (int i = 0; i < 2; i++) {
            if (!Character.isLetter(code.charAt(i)) || !Character.isUpperCase(code.charAt(i))) {
                return false;
            }
        }
        for (int i = 2; i < 7; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] codes = {"MY10001", "my10002", "M110003", "MY1234", "MY10O04"};
        for (String code : codes) {
            System.out.println(code + " -> " + isTrackingCode(code));
        }
        System.out.println("Character.toUpperCase('m') = " + Character.toUpperCase('m'));
        System.out.println("isLetterOrDigit('7') = " + Character.isLetterOrDigit('7') + ", isWhitespace(' ') = " + Character.isWhitespace(' '));
        String typed = "my10002";                       // a user typed small letters
        System.out.println(typed + " in capitals -> " + isTrackingCode(typed.toUpperCase()));
    }
}
