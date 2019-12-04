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

    public static void showMas(int[] mas) {
        for (int i :
                mas) {
            System.out.print(i + " ");

        }
        System.out.print("\n");
    }

    public static void showMas(int[][] mas) {
        for (int[] i :
                mas) {
            for (int j : i
            ) {
                System.out.print(j + " ");
            }
            System.out.println("\n");
        }

    }

    public static void showMas(Number[] mas) {
        for (Number i :
                mas) {
            System.out.print(i + " ");

        }
        System.out.println("\n");
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
                System.out.println("Елемент " + key + " найден, идекс в масиве " + current);
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
    public static void sotrSelect(int[] mas) {
        int min;
        for (int i = 0; i < mas.length - 1; i++) {
            min = i;
            for (int j = min + 1; j < mas.length; j++) {
                if (mas[j] < mas[min]) {
                    int temp = mas[min];
                    mas[min] = mas[j];
                    mas[j] = temp;
                }
            }
        }
    }

    /*
    Найти количество всех седловых точек матрицы. (Матрица А имеет
    седловую точку Аi,j, если Аi,j является минимальным элементом в i-й
    строке и максимальным в j-м столбце).
    */
    public static void findPoint(int[][] mas) {
        int max, min, count = 0;
        int colum = 0, row = 0;
        boolean flag = true;
        for (int i = 0, k = 0; i < mas.length; i++) {
            max = mas[i][k];
            min = max;
            flag = true;
            colum = k;
            row = i;
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] < min) {  //поиск минимально
                    min = mas[i][j];
                    max = min;
                    colum = j;
                    row = i;
                }
            }
            if (flag) {
                for (int j = 0; j < mas.length; j++) {//проход по столбику для подтверждения того что min это max в столбике
                    if (mas[j][colum] > max) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                System.out.println(mas[row][colum] + " point");
                count++;
            }
        }
        System.out.println(count);
    }
    /*Перестроить матрицу, переставляя в ней строки так, чтобы сумма элементов в строках полученной матрицы убывала.*/

    public static void sumRowMatrix(int[][] mas) {
        LinkedList<Integer> sumRow = new LinkedList<>();
        LinkedList<Integer> indexRow = new LinkedList<>();
        int[] sum = new int[mas[0].length];
        int index = 0;
        for (int[] i :
                mas) {
            for (int j :
                    i) {
                sum[index] += j;
            }
            sumRow.add(sum[index]);
            indexRow.add(index);
            index++;
        }
        for (int i = 0; i < indexRow.size(); i++) {
            System.out.println("Строка " + indexRow.get(i) + " сумма " + sumRow.get(i));
        }
        while (!sumRow.isEmpty()) {
            int iMax = 0;
            int inDex = 0;
            for (int i = 0; i < sumRow.size(); i++) {
                if (sumRow.get(i) > iMax) {
                    iMax = sumRow.get(i);
                    inDex = i;
                }
            }
            for (int h :
                    mas[inDex]) {
                System.out.print(h);
            }
            System.out.println();
            sumRow.remove(inDex);
        }
    }
}
