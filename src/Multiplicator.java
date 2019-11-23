import org.omg.CORBA.MARSHAL;

import java.io.IOException;

public class Multiplicator extends Exception {
    public static Matrix multiply(Matrix a, Matrix b) {

        int v = a.getVerticalSize();
        int h = b.getHorizonyalSize();
        int temp = a.getHorizonyalSize();
        //проверка на умножение матрици
        try {
            if (temp != b.getVerticalSize()) {
                throw new Exception();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        Matrix result = new Matrix(v, h);
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                int value = 0;
                for (int k = 0; k < temp; k++) {
                    value += a.getElemetsMatrix(i, k) * b.getElemetsMatrix(k, j);
                }
                result.setElemetsMatrix(i, j, value);
            }
        }
        return result;
    }

    public static Matrix addMatrix(Matrix a, Matrix b) {
        int v = a.getVerticalSize();
        int h = b.getHorizonyalSize();
        int temp = a.getHorizonyalSize();
        //проверка на сложение матрици
        try {
            if (temp != b.getVerticalSize()) {
                throw new Exception();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Matrix result = new Matrix(v, h);
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                result.setElemetsMatrix(i, j, a.getElemetsMatrix(i, j) + b.getElemetsMatrix(i, j));
            }
        }
        return result;
    }

    public static Matrix differenceMatrix(Matrix a, Matrix b) {
        int v = a.getVerticalSize();
        int h = b.getHorizonyalSize();
        int temp = a.getHorizonyalSize();
        //проверка на разность матрици
        try {
            if (temp != b.getVerticalSize()) {
                throw new Exception();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Matrix result = new Matrix(v, h);
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                result.setElemetsMatrix(i, j, a.getElemetsMatrix(i, j) - b.getElemetsMatrix(i, j));
            }
        }
        return result;
    }

    public static Matrix transpoceMatrix(Matrix matrix) {
        Matrix transpMatrix = new Matrix(matrix.getHorizonyalSize(), matrix.getVerticalSize());
        int v = transpMatrix.getVerticalSize();
        int h = transpMatrix.getHorizonyalSize();
        try {
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < h; j++) {
                    transpMatrix.setElemetsMatrix(i, j, matrix.getElemetsMatrix(j, i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transpMatrix;
    }
}
