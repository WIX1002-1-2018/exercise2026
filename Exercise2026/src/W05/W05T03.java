public class tutoq2 {
    public static void main(String[] args){
        int temp1 = 1;
        int temp2 = 0;
        System.out.printf(temp1 + " ");
        for (int i = 0; i < 9;i++){
            int nth = temp1 + temp2;
            temp2 = temp1;
            temp1 = nth;
            System.out.print(nth + " ");
        }
    }

}
