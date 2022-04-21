package main;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DataCzasLokalny {
    public static void main(String[] arg) {
        System.out.println(ZoneId.getAvailableZoneIds());

        ZoneId strefa1 = ZoneId.of("Europe/Oslo");
        ZoneId strefa2 = ZoneId.of("America/Argentina/Buenos_Aires");

        System.out.println(strefa1.getRules());
        System.out.println(strefa2.getRules());



        LocalTime local1 = LocalTime.now(strefa1);
        LocalTime local2 = LocalTime.now(strefa2);

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.US);
        LocalTime czas = LocalTime.parse("08:08 PM", formatter);
        System.out.println(czas);



        LocalTime czas2 = local1.minusHours(2);
        LocalTime czas3 = local2.plusMinutes(30);
        System.out.println(czas2);
        System.out.println(czas3);



        long roznicaGodziny = ChronoUnit.HOURS.between(local1, local2);
        System.out.println("Różnica w godzinach : " + roznicaGodziny);
        long roznicaMinuty = ChronoUnit.MINUTES.between(local1, local2);
        System.out.println("Różnica w minutach : " + roznicaMinuty);


    }
}
