package Lesson_21;

import java.time.*;
import java.util.Date;

public class DateConvert {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date:----> "+date);

        LocalDate ld = dateToLocalDate(date);
        LocalTime lt = dateToLocalTime(date);
        LocalDateTime ldt = dateToLocalDateTime(date);

        System.out.println("Local Date:----> " + ld);
        System.out.println("Local Time:----> " + lt);
        System.out.println("Local DateTime:----> " + ldt);
    }

    public static LocalDate dateToLocalDate(Date date) {
        return getZonedDatetime(date).toLocalDate();
    }

    public static LocalTime dateToLocalTime(Date date) {
        return getZonedDatetime(date).toLocalTime();
    }

    public static LocalDateTime dateToLocalDateTime(Date date) {
        return  getZonedDatetime(date).toLocalDateTime();
    }
    private static ZonedDateTime getZonedDatetime(Date date){
        return date.toInstant().atZone(ZoneId.systemDefault());
    }
}
