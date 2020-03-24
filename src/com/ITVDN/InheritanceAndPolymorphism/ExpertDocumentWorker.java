package com.ITVDN.InheritanceAndPolymorphism;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в новом формате!");
    }
}
