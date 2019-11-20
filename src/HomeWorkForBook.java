import java.awt.*;

public class HomeWorkForBook {


    public static void showMas(int[] mas) {
        for (int i :
                mas) {
            System.out.print(i + " ");

        }
        System.out.println("\n");
    }


    public static void main(String[] args) {
        int[] mas = new int[]{12, 21, 33, 4, 5, 6, 9, 27};

        Methods.evenAndOddNum(mas);


    }
}
