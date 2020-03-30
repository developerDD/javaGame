package com.CodeWars;

public class Time {
    public static void TimeInSecond() {
        int colSec = 15731080;
        int year = colSec / 31536000;
        int day = (colSec / 86400) % 365;
        int hours = (colSec % 86400) / 3600;
        int min = (colSec % 3600) / 60;
        int sec = colSec % 60;
        System.out.println(year + " " + day + " " + hours + " " + min + " " + sec);
    }

    public static String formatDuration(int seconds) {
        // your code goes here
        if (seconds==0)return "now";
        int year=0, day=0, hours=0, minutes=0, second = 0;
        year = seconds / 31536000;
        day = (seconds / 86400) % 365;
        hours = (seconds % 86400) / 3600;
        minutes = (seconds % 3600) / 60;
        second = seconds % 60;
        String yearS= "year", dayS= "day", hourS= "hour", minuteS= "minute", secondS = "second", string="";
        if (seconds>59){
            string = getStrFormat(year,yearS)+getStrFormat(day,dayS)+getStrFormat(hours,hourS)+
                    getStrFormat(minutes,minuteS)+getStrFormat(second,secondS);
        }else {
            return getStrFormat(second,secondS).replaceAll(",","");
        }
        //делим строку по значениеям для вствки and так как она вставляеться перед последним значение
        String [] arr = string.split(",",0);
        if (arr.length==1) return arr[0];//если только одно значение в строке
        StringBuilder stringBuilder =new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                stringBuilder.append(" and ").append(arr[i]);
                break;
            }
            if (i==arr.length-2){
                stringBuilder.append(arr[i]);
                continue;
            }
            stringBuilder.append(arr[i]).append(", ");
        }
        return stringBuilder.toString();
    }
    //формирование окончания и если значение 0 мы его не передаем
    public static String getStrFormat(int time,String word){
        return time==1?""+time+" "+word+",":time==0?"":""+time+" "+word.concat("s")+",";
    }
}
