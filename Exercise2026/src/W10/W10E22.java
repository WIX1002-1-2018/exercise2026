package W10;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

// Worked example (self-study): a small club membership list.
// MemberE22 holds one member; ClubE22 holds an array of members and the methods that use it.
// It brings together private fields, a constructor, getters, a static id counter, an array of objects and a file.
class MemberE22 {
    private static int nextId = 1;
    private final int id;
    private final String name;
    private boolean active = true;

    MemberE22(String name) {
        this.name = name;
        id = nextId;
        nextId++;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    boolean isActive() {
        return active;
    }

    void leave() {
        active = false;
    }

    public String toString() {
        String status = "active";
        if (!active) {
            status = "left";
        }
        return id + ". " + name + " (" + status + ")";
    }
}

class ClubE22 {
    private final String clubName;
    private final MemberE22[] members = new MemberE22[50];
    private int count = 0;

    ClubE22(String clubName) {
        this.clubName = clubName;
    }

    void join(String name) {
        if (count < members.length) {
            members[count] = new MemberE22(name);
            count++;
        }
    }

    MemberE22 find(int id) {
        for (int i = 0; i < count; i++) {
            if (members[i].getId() == id) {
                return members[i];
            }
        }
        return null;                                // no member with that id
    }

    int activeCount() {
        int n = 0;
        for (int i = 0; i < count; i++) {
            if (members[i].isActive()) {
                n++;
            }
        }
        return n;
    }

    void save(String fileName) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter(fileName)) {
            for (int i = 0; i < count; i++) {
                out.println(members[i].getId() + "," + members[i].getName() + "," + members[i].isActive());
            }
        }
    }

    void print() {
        System.out.println(clubName + ": " + count + " members, " + activeCount() + " active");
        for (int i = 0; i < count; i++) {
            System.out.println("  " + members[i]);
        }
    }
}

public class W10E22 {
    public static void main(String[] args) throws FileNotFoundException {
        ClubE22 club = new ClubE22("Robotics Club");
        club.join("Aisyah");
        club.join("Ben");
        club.join("Chong");

        MemberE22 m = club.find(2);
        if (m != null) {
            m.leave();
        }
        club.print();
        club.save("members.csv");
        System.out.println("Saved to members.csv");
    }
}
