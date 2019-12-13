import java.io.IOException;

/**
 * @author Dima Derevianko
 */
public class HomeWorkForBook {

    public static void main(String[] args) throws IOException {
//        int[] mas = new int[]{-12, 21, 33, 4, 5, 6, 9, 27};
//        int[] mas2 = MethodsForMass.initMas(20);
//        int [][] mat = new int [][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//       String string = "Madam, I'm Adam!";
//        OperationsString opStr = new OperationsString(string);
//        System.out.println(opStr.isPalindrom(string));

        Tree tree = new Tree();
        tree.add(10);
        tree.add(9);
        tree.add(8);
        tree.add(7);
        tree.add(11);
        tree.add(12);
        tree.add(13);
        tree.add(14);
        tree.deleteNood(13);
        tree.showTree();




    }
}
