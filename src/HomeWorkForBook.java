import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Dima Derevianko
 */
public class HomeWorkForBook {





    public static void main(String[] args) throws IOException {
        int[] mas = new int[]{-12, 21, 33, 4, 5, 6, 9, 27};
        int[] mas2 = MethodsForMass.initMas(20);
        int [][] mat = new int [][]{{10,39,5,4},{5,6,1,2},{11,9,1,1}};
        Matrix matrix = new Matrix(3, 3);
        Matrix matrix1 = new Matrix(3, 3);
        MethodsForMass.findPoint(mat);



    }
}
