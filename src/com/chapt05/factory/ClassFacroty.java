package com.chapt05.factory;

public class ClassFacroty  {
    private enum Flag{FIRST,SECOND}
    public static Base getCalssFromFactory(String id){
        Flag  flag = Flag.valueOf(id.toUpperCase());
        switch (flag){
            case FIRST:return new First();
            case SECOND:return new Second();
            default:throw new EnumConstantNotPresentException(Flag.class,flag.name());
        }
    }
}
