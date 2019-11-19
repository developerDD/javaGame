public class HomeWorkForBook {
    //Числа Фибоначчи: f0 = f1 = 1, f (n) = f (n–1) + f (n–2)
    public static int Fibo(int index) {
        if (index <= 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return Fibo(index - 1) + Fibo(index - 2);
        }
    }

    public static void ShowMas(int[] mas) {
        for (int i :
                mas) {
            System.out.println(i);

        }
    }

    public static void FindMinMax_devision3_9(int [] mas)
    {

    }

    public static void buildPascalTriangle(int number, int rows) {
        for (int y = 0; y < rows; y++) {
            int c = number;
            for (int w = 0; w < rows - y; w++) {
                System.out.print("   ");
            }
            for (int x = 0; x <= y; x++) {
                System.out.print("   " + c + " ");
                c = c * (y - x) / (x + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] mas = new int[]{12, 21, 33, 4, 5, 6, 9, 27};
        int max = 0;
        int min = mas[0];
        System.out.println("Числа которые делять на 3 или 9 :");
        for (int i :
                mas) {
            if (i % 3 == 0 || i % 9 == 0) {
                System.out.print(" " + i);
            }
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.print("\n" + "Max = " + max + "\n" + "Min = " + min);
        int tamp;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length - 1; j++) {
                if (mas[i] < mas[j]) {     //смена знака влияет на направление сортировки
                    tamp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = tamp;
                }
            }
        }
        int numberFibo = 5;

        System.out.println(Fibo(numberFibo));
    }
}
