package W06.mine;
import java.util.Arrays;
public class rotateMatrix {
    public static void main(String[] args) {
        int [][] matrixs = {{1,5,7},
                            {3,6,9},
                            {5,3,8}};
        int [][] rotate = new int[3][3];
        for (int i = 0; i < matrixs.length; i++){
            for (int j = 2; j >= 0; j--){
                rotate[i][2-j] = matrixs[j][i];
        }        
    }
    for (int k = 0;k < rotate.length; k++){
            System.out.println(Arrays.toString(rotate[k]));
        }
    }
}
