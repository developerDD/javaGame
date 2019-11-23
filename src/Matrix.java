public class Matrix {
   private int[][] mas;
    int row, kolum;

    public Matrix(int row, int kolum) {
        mas = new int[row][kolum];
        this.row = row;
        this.kolum = kolum;
    }

    public int getVerticalSize() {
        return mas.length;
    }

    public int getHorizonyalSize() {
        return mas[0].length;
    }

    public int getElemetsMatrix(int row, int kolum) {
        return mas[row][kolum];
    }

    public void setElemetsMatrix(int row, int kolum, int value) {
        mas[row][kolum] = value;
    }

    public void createRandomeMatix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < kolum; j++) {
                setElemetsMatrix(i, j, (int) (Math.random() * kolum * kolum));
            }
        }
    }

    public String toSting() {
        String str = "Matrix : " + mas.length + " x "  + mas[0].length + "\n";
        for (int[] vector : mas) {
            for (int value : vector) {
                str += value + " ";
            }
            str += "\n";
        }
        return str;
    }
}
