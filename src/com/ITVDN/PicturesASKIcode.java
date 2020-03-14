package com.ITVDN;

public class PicturesASKIcode {
    //треугольник 90 градусов с лево
    public static void rectangle90(final int heigth){
        for (int i = 1; i < heigth; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //треугольник 90 градусов с права
    public static void rectangle90back(final int heigth){
        for (int i = 1; i < heigth; i++) {
            for (int j = heigth-i; j > 1 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //прирамида
    public static void rectanglePyramid(int heigth){
        heigth*=2; // умножаем высоту на 2 что бы пирамида была правельной
        int centrePyramid = heigth/2; // вершина
        for (int i = 0,col =1; i < heigth/2; i++,col+=2) {
            for (int j = 1; j < (heigth/2)-i; j++) {
               System.out.print(" ");
            }
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //пирамида пустая в средине
    public static void rectanglePyramidEmpty(int heigth) {
        heigth *= 2; // умножаем высоту на 2 что бы пирамида была правельной
        int centrePyramid = heigth / 2; // вершина
        for (int i = 0, col = 1; i < heigth / 2; i++, col += 2) {
            for (int j = 1; j < (heigth / 2) - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < col; j++) {
                if(j==0||j==col-1||i==heigth/2-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
             }
            System.out.println();
        }
    }
}
