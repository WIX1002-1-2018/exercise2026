package W11;

// Same package: W11E13 is not a subclass, but it is in package W11,
// so it can use W11Parcel's package-private auditNote() and its protected weightKg.
public class W11E13 {
    public static void main(String[] args) {
        W11Parcel p = new W11Parcel("MY20001", 1.2);
        System.out.println(p.auditNote());          // package-private: allowed in W11
        p.weightKg = 1.5;                           // protected: allowed in the same package
        System.out.println(p.auditNote());
        // Try it: make auditNote() private in W11Parcel. Which two calls stop compiling?
    }
}
