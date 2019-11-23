import java.util.*;

public class MethodsForMass {

    public static int[] initMas(int size) {
        int[] mas = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            mas[i] = random.nextInt(100) + 1;
        }
        return mas;
    }

    //Числа Фибоначчи: f0 = f1 = 1, f (n) = f (n–1) + f (n–2)
    public static int[] fibo(int index) {
        System.out.println("Первые " + index + " чисел Фибоначи ->");
        int[] mas = new int[index];
        mas[0] = 0;
        mas[1] = 1;
        for (int i = 2; i < index; i++) {
            mas[i] = mas[i - 1] + mas[i - 2];
        }
        return mas;
    }

    public static void findMinMax_devision3_9(int[] mas) {
        int max = mas[0];
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
    }

    public static void evenAndOddNum(int[] mas) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i : mas) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }
        System.out.println("Чётные числа: " + even);
        System.out.println("Нечётные числа: " + odd);
    }

    //Tреугольник Паскаля для первого положительного числа
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

    //Сортировка с выбором направления
    public static void boobleSort(int[] mas, boolean Ascending) {
        int tamp;
        if (Ascending) {
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas.length - 1; j++) {
                    if (mas[i] < mas[j]) {
                        tamp = mas[i];
                        mas[i] = mas[j];
                        mas[j] = tamp;
                    }
                }
            }
        } else {
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas.length - 1; j++) {
                    if (mas[i] > mas[j]) {
                        tamp = mas[i];
                        mas[i] = mas[j];
                        mas[j] = tamp;
                    }
                }
            }
        }
    }

    //Двоичный поиск в отсортированом массиве
    public static void find(int[] mas, int key) {
        int current;
        int start = 0;
        int end = mas.length - 1;
        while (true) {
            current = (start + end) / 2;
            if (mas[current] == key) {
                System.out.println("Елемент "+key+ " найден, идекс в масиве " + current);
                break;
            } else if (start > end) {
                System.out.println("Нет такого елемента в массиве!");
                break;
            } else {
                if (mas[current] < key) {
                    start = current + 1;
                } else {
                    end = current - 1;
                }
            }
        }

    }

    //Сортировка вставкой
    public static void sotrSelect(int []mas){
        int min;
        for (int i = 0; i < mas.length-1; i++) {
            min=i;
            for (int j = min+1; j <mas.length ; j++) {
                if (mas[j]<mas[min]){
                    int temp = mas[min];
                    mas[min]=mas[j];
                    mas[j]=temp;
                }
            }
        }
    }
}
