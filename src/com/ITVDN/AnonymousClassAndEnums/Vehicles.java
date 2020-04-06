package com.ITVDN.AnonymousClassAndEnums;

public enum Vehicles {
    BMW(50000){
        public int getPrice(){
            return priceCar;
        }
        public String getColor(){
            return "color Red!";
        }
    },
    AUDI(563200){
        public int getPrice(){
            return priceCar;
        }
        public String getColor(){
            return "color Green!";
        }
    },
    FORD(454847){

        public int getPrice(){
            return priceCar;
        }
        public String getColor(){
            return "color Blue!";
        }
    };
    int priceCar;

    Vehicles(int priceCar){
        this.priceCar=priceCar;
    }
    @Override
    public String toString(){
        return "Car model "+super.toString()+" "+getColor()+" price -> "+getPriceCar();
    }
    public int getPriceCar(){
        return priceCar;
    }

    public abstract String getColor();
}

