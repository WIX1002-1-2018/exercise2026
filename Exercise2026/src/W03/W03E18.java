package W03;

// INTENTIONALLY FAULTY: one logic bug that compiles, and two Try it lines that do not compile.
public class W03E18 {
    public static void main(String[] args) {
        int mark = 30;

        // Logic bug: the semicolon becomes the empty body of the if, so the next line always runs.
        // It compiles. javac -Xlint:empty warns "empty statement after if"; NetBeans flags it only if its
        // "Empty statement after if/else" hint is turned on (Tools > Options > Editor > Hints).
        if (mark >= 50);
            System.out.println("Passed?");

        // Try it: remove the // on one line at a time and compile. Each note shows the first javac error.
        // if mark >= 50 System.out.println("pass");
        //   javac: '(' expected (the condition needs parentheses)
        // String note; if (mark >= 50) note = "pass"; System.out.println(note);
        //   javac: variable note might not have been initialized (give it a value on every path)
    }
}
