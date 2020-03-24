package com.ITVDN.classAndObject;

public enum TypeEngines implements Cloneable{
    DIESEL("Diesel EVRO 5"),
    BENZINE("Benzine - A 92,A 95, A 98"),
    GAZ_BENZINE("Gaz - propane, Benzine - A 92,A 95, A 98"),
    ELECTRIC("Green power!!!"),
    HYBRID("Green power and Diesel or Benzine");
    private String description;
    TypeEngines(String _dedescription){
        this.description=_dedescription;
    }
    public String getDescription(){
        return this.description;
    }

    @Override
    public String toString() {
        return "Type engine - "+ name()+", description: "+description;
    }
}
