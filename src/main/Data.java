package main;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Data {
    public static void main(String[] args) {

        LocalDate dzien = LocalDate.of(1997, Month.JULY, 3);
        System.out.println(dzien);
        DayOfWeek dzienTygodnia = dzien.getDayOfWeek();
        System.out.println(dzienTygodnia);
        System.out.println();


        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.getDefault());
        LocalDate data = LocalDate.parse("21.04.2022", formatter);
        System.out.println("Data sformatowana: " + data);
        System.out.println();


        LocalDateTime ldt = LocalDateTime.of(2022, 12, 31, 23, 59, 59);
        System.out.println(ldt);

        DayOfWeek dow = ldt.getDayOfWeek();
        System.out.println(dow);

    }
}
