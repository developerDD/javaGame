package com.ITVDN.RegexAndData;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.GregorianCalendar;

//Работа с датами календаря и временем

/**вывод месяца в консоль
 * GregorianCalendar d = new GregorianCalendar();
 *         int today = d.get(Calendar.DAY_OF_MONTH);
 *         int month = d.get(Calendar.MONTH);
 *
 *         d.set(Calendar.DAY_OF_MONTH, 1);
 *
 *         int weekday = d.get(Calendar.DAY_OF_WEEK);
 *         System.out.println(" Sun   Mon   Tue   Wed   Thu   Fri   Sat");
 *
 *         for (int i = Calendar.SUNDAY; i < weekday; i++) {
 *             System.out.print("      ");
 *         }
 *
 *         do {
 *             int day = d.get(Calendar.DAY_OF_MONTH);
 *             System.out.printf("%4d", day);
 *             if (day == today) {
 *                 System.out.print("* ");
 *             } else {
 *                 System.out.print("  ");
 *             }
 *             if (weekday == Calendar.SATURDAY) {
 *                 System.out.println();
 *             }
 *             d.add(Calendar.DAY_OF_MONTH, 1);
 *             weekday = d.get(Calendar.DAY_OF_WEEK);
 *         } while (d.get(Calendar.MONTH) == month);
 */
public class MainData {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        int today = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH)+1;//начинаються с 0
        int dayWeek = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);//начинаються с 0
        System.out.println( today+" "+month+" "+dayWeek);

        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);

        System.out.println("=============");

        // Слияние 2-х объектов
        LocalDateTime fromLocalTime = localTime.atDate(localDate);
        LocalDateTime fromDateTime = localDate.atTime(localTime);

        System.out.println(fromLocalTime);
        System.out.println(fromDateTime);

        System.out.println("=============");

        fromDateTime = localDate.atTime(12,00,57,01);
        System.out.println(fromDateTime);

        System.out.println("=============");
        localDate = localDate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println(localDate);
    }
}
