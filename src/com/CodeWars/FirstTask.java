package com.CodeWars;

public class FirstTask {
    public static String  whoLikesIt(String... names) {
        int col = names.length;
        String resalt=null;
        if (col==0){
            resalt="no one likes this";
        }
        else if (col==1){
            resalt =names[0]+ " likes this";
        }else if(col==2){
            resalt =names[0]+ " and "+names[1]+" like this";
        }else if(col==3){
            resalt =names[0]+ ", "+names[1]+" and "+names[2]+" like this";
        }else if(col>3){
            resalt =names[0]+ ", "+names[1]+" and " +(col-2)+" others like this";
        }
        return resalt;
    }
}
