package com.ITVDN.InheritanceAndPolymorphism;

import java.util.Scanner;

public class APIDocuments {
    public static void main(String[] args) {
        System.out.println("Введите ключь 1 (PRO) или 2 (EXP) доступа для Document Worker:");
        Scanner scanner = new Scanner(System.in);
        int options = scanner.nextInt();
       switch (options){
           case 1:
               DocumentWorker pro = new ProDocumentWorker();
               pro.openDocument();
               pro.editDocument();
               pro.saveDocument();
               break;
           case 2:
               DocumentWorker exp = new ExpertDocumentWorker();
               exp.openDocument();
               exp.editDocument();
               exp.saveDocument();
               break;
           default:
               DocumentWorker orig = new DocumentWorker();
               orig.openDocument();
               orig.editDocument();
               orig.saveDocument();
       }

    }
}
