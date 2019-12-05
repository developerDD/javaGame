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
        int [][] mat = new int [][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
       String string = "Madam, I'm Adam!";
        OperationsString opStr = new OperationsString(string);
        System.out.println(opStr.isPalindrom(string));



    }
}
