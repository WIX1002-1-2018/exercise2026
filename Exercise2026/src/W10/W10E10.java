package W10;

import java.util.Locale;

// Two files, one package: W10Parcel is in W10Parcel.java, and this program uses it.
// Both files start with  package W10;  so no import is needed.
// From another package (say W11) you would write  import W10.W10Parcel;  at the top.
// The package is also a folder: the classes are in W10/. From the src folder, on the command line:
//   javac -d out W10/W10Parcel.java W10/W10E10.java   (makes out/W10/*.class)
//   java -cp out W10.W10E10                           (W10.W10E10 is the full name of the class)
public class W10E10 {
    public static void main(String[] args) {
        W10Parcel p = new W10Parcel("MY10001", "Aisyah", 1.2);
        System.out.println(p);
        System.out.println("Fee: RM " + String.format(Locale.ROOT, "%.2f", p.fee()));
        System.out.println("Full class name: " + W10Parcel.class.getName());   // optional: the package and the class
    }
}
