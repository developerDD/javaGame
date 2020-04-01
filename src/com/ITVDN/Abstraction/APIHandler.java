package com.ITVDN.Abstraction;

public class APIHandler {
    public static void main(String[] args) {
        String nameFile = "ghdhdh.txdt";
        String formatFile = nameFile.replaceAll("\\w+\\.","");
        AbstractHandler document=null;
        switch (formatFile){
            case "doc":
                document = new DOCHandler();
                break;
            case "txt":
                 document = new TXTHandler();
                break;
            case "xml":
                document = new XMLHandler();
                break;
            default:
                System.out.println("formatFile = " + formatFile+" Invalid!");
                break;
        }
        if (document!=null){
            document.open();
            document.change();
            document.save();
            document.create();
        }

    }
}
