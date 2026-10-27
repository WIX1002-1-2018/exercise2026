package W04;

public class W04T04 {

    public static void main(String[] args){

        int a = 3;
        int b = 4;
        int c = 5;

        if(a >= b && a >= c){
            System.out.println(a);
        }
        else if(b >= a && b >= c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}
