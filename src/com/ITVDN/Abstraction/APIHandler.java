package com.ITVDN.Abstraction;

public class APIHandler {
    public static void main(String[] args) {
//        String nameFile = "ghdhdh.txdt";
//        String formatFile = nameFile.replaceAll("\\w+\\.","");
//        AbstractHandler document=null;
//        switch (formatFile){
//            case "doc":
//                document = new DOCHandler();
//                break;
//            case "txt":
//                 document = new TXTHandler();
//                break;
//            case "xml":
//                document = new XMLHandler();
//                break;
//            default:
//                System.out.println("formatFile = " + formatFile+" Invalid!");
//                break;
//        }
//        if (document!=null){
//            document.open();
//            document.change();
//            document.save();
//            document.create();
//        }
            Distance distance = new Distance();
            distance.setDistance(100);
          double Mile =  distance.convertFromKilometerToMile(distance.getDistance());
          double Kilometer =  distance.convertFromMeterToKilometer(distance.getDistance());
          double Centimeter =  distance.convertMillimeterToCentimeter(distance.getDistance());
        System.out.println(distance.getDistance()+" km to mile -> "+Mile);
        System.out.println("Centimeter = " + Centimeter);
        System.out.println("Kilometer = " + Kilometer);
        System.out.println(distance.convertUAHtoUSD(1000));
        System.out.println(distance.convertUAHtoERO(1000));
        System.out.println(distance.convertEROtoUAH(150));
        System.out.println(distance.convertUSDtoUAH(175));

    }
}
