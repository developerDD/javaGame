package com.ITVDN.RegexAndData;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkHome {
    public static void main(String[] args) {
//        System.out.println(replaceOnJava("dima.txt"));
//    registration();
       // countTimeYourBirthday(2013,11,8,5,30);
        WorkHome workHome = new WorkHome();
        workHome.foo();
    }

//Напишите шуточную программу «Дешифратор», которая бы в текстовом файле могла бы заменить все
//предлоги на слово «Java».
    public static String replaceOnJava(String nameFile){
        String regex = "\\sв\\s|\\sпро\\s|\\sу\\s|\\sдо\\s|\\sза\\s|\\sна\\s|\\sо\\s|\\sпо\\s|,на\\s";
        StringBuilder text = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(nameFile))) {
            String string;
            while ((string=br.readLine())!=null){
                text.append(string);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text.toString().replaceAll(regex," Java ");
    }
    //Напишите консольное приложение, позволяющие пользователю зарегистрироваться под «Логином»,
    //состоящем только из символов латинского алфавита, и пароля, состоящего из цифр и символов.
    public static void  registration(){
        System.out.println("Введите Ваш логин: "+(char) 27 + "[31m"+ "(только латиница не менее 6 символов)");
        Scanner scanner=new Scanner(System.in);
        String login = scanner.next();
        Pattern patternLogin = Pattern.compile("\\w{6,}");
        Pattern patternPass = Pattern.compile("[0-9a-zA-Z!@#$%^&*]{6,8}");
        Matcher matcher=patternLogin.matcher(login);
        if (matcher.matches()){
            System.out.println((char) 27 + "[30m"+"Введите Ваш пароль: "+(char) 27 + "[31m"+ "(цифры и символы c 6 до 8 символов)");
            try {
                String pass = scanner.next();
                Matcher matcherPass = patternPass.matcher(pass);
                if (matcherPass.matches()){
                    System.out.println("Добро пожаловать!");
                }else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println((char) 27 + "[31m"+ "Ваш пароль не корректный!");
            }
        }else {
            System.out.println((char) 27 + "[31m"+ "Ваш логин имеет недопустимые символы или короткий!");
        }
    }
    //Спроектируйте и разработайте метод, определяющий, сколько времени прошло с заданной даты.
    //С помощью этого методы выведите в консоль, сколько времени прошло с вашего дня рождения в удобном
    //для восприятия виде, например: «Вам исполнилось 20 лет, 3 месяца, 18 дней, 4 часа, 5 минут и 10 секунд».
    public static void countTimeYourBirthday(int years,int month,int date,int hourOfDay,int minute){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(years,month-1,date,hourOfDay,minute);
        long milsec= calendar.getTimeInMillis();
        System.out.println(milsec);
        Date date2 = new Date();
        long i = date2.getTime();

        long milsec2 = i-milsec;
        long second =Math.abs(milsec2/1000l) ;
        System.out.println(second);
        long year = second / 31536000;
        long monthRes = (second/31536000)%12;
        long day = (second / 86400) % 365;
        long hours = (second % 86400) / 3600;
        long min = (second % 3600) / 60;
        long secc = second % 60;// можно добаить и секунды
        System.out.println("Ваш возраст:");
        System.out.println(year + " лет "+monthRes+" месяц " + day + " дней " + hours + " часов " + min + " минут ");
    }
// с помощью  LocalDate разница с текущей датой и прошлой
    public void foo(){
        LocalDate last = LocalDate.of(2020,6,3);
        LocalDate first = LocalDate.of(1984, 9, 14);
        LocalDate resultDate = compare(last, first); //returns 0011-08-25
        System.out.println(resultDate.toString());

    }
    LocalDate compare(LocalDate dateOfSession, LocalDate compared)
    {
        long resultDays = ChronoUnit.DAYS.between(compared, dateOfSession);
        return LocalDate.of(0, 1, 1).plusDays(resultDays - 1);
    }
}
