package W12;

// Two more nested forms:
// 1. A static nested class (Label) needs no ParcelE16 object. It can still read a parcel's
//    private field, through a reference to that parcel.
// 2. A local class (Line) is declared inside a method and used only there. It may read
//    local variables that never change after they are set (effectively final), such as hub.
class ParcelE16 {
    private final String trackingNo;

    ParcelE16(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    static class Label {
        String print(ParcelE16 p) {
            return "[" + p.trackingNo + "]";        // private field, through the reference p
        }
    }
}

public class W12E16 {
    public static void main(String[] args) {
        ParcelE16.Label label = new ParcelE16.Label();  // no ParcelE16 object needed
        System.out.println(label.print(new ParcelE16("MY30032")));

        String hub = "KL hub";                      // effectively final
        class Line {
            String show(String trackingNo) {
                return trackingNo + " via " + hub;
            }
        }
        Line line = new Line();
        System.out.println(line.show("MY30033"));
        System.out.println(line.show("MY30034"));
    }
}
