package W03;

// INTENTIONALLY FAULTY: one logic bug that compiles, and Try it lines that do not compile.
public class W03E18 {
    public static void main(String[] args) {
        int mark = 30;

        // Logic bug: a semicolon after if (...) ends the if, so the next line always runs.
        // It compiles. javac -Xlint:empty warns "empty statement after if"; NetBeans flags it only if its
        // "Empty statement after if/else" hint is turned on (Tools > Options > Editor > Hints).
        if (mark >= 50);
            System.out.println("Passed?");

        // Try it: remove the // on one line at a time and compile. Each note shows the first javac error.
        // if mark >= 50 System.out.println("pass");
        //   javac: '(' expected
        // if (mark = 50) System.out.println("fifty");
        //   javac: incompatible types: int cannot be converted to boolean
        // if (mark >= 50 and mark <= 100) System.out.println("pass");
        //   javac: ')' expected (Java uses &&, not and)
        // if (0 <= mark <= 100) System.out.println("valid");
        //   javac: bad operand types for binary operator '<=' (write 0 <= mark && mark <= 100)
        // if (mark >= 50) System.out.println("pass"); else (mark < 50) System.out.println("fail");
        //   javac: not a statement (else takes no condition)
        // String note; if (mark >= 50) note = "pass"; System.out.println(note);
        //   javac: variable note might not have been initialized
    }
}
