public class HomeWorkForBook {


    public static void showMas(int[] mas) {
        for (int i :
                mas) {
            System.out.print(i + " ");

        }
        System.out.println("\n");
    }
    public static void showMas(Number[] mas) {
        for (Number i :
                mas) {
            System.out.print(i + " ");

        }
        System.out.println("\n");
    }


    public static void main(String[] args) {
        int[] mas = new int[]{-12, 21, 33, 4, 5, 6, 9, 27};
        int[] mas2 = Methods.initMas(20);
        Methods.boobleSort(mas,true);
        showMas(mas);
        Methods.find(mas,5);
    }
}
