package omar.ecutb.java;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LocalDate today = LocalDate.now();
        LocalDate lastMonday = LocalDate.parse("2020-01-06");
        String custom = today.format(DateTimeFormatter.ISO_DATE);
        Period period = Period.between(lastMonday, today);
        int days = period.getDays();
        LocalDate tomorrow = LocalDate.parse("2020-01-14");
        LocalDate before = LocalDate.of(1945, 05, 8);
        DayOfWeek dayOfWeek = DayOfWeek.from(before);
        LocalDate mix = today.plus(period.ofYears(10).minus(period.ofMonths(10)));
        LocalDate myBirthDay = LocalDate.parse("1993-03-05");
        Period secondPeriod = Period.between(before, myBirthDay);
        int years = secondPeriod.getYears();
        int month = secondPeriod.getMonths();
        int day = secondPeriod.getDays();
        LocalDate newDate = today.plusYears(4).plusMonths(7).plusDays(29);
        System.out.println( "Hello World!\n " + today + "\n " + custom + "\n " + days + " Days between last monday and today \n" + " Tomorrow is " + tomorrow
        + " \n Day of week on date 1945-05-08 is " + " " + dayOfWeek + "\n the new date from this date plus 10 years minus 10 month is " + mix
        + "\n The elapse between the date 1945-05-08 and my birthday is " + years + " years, " + month + " months and, " + day + " days."
        + "\n The current date plus 4 years 7 month and 29 days is: " + " " + newDate);
        LocalTime currentTime = LocalTime.now();
        LocalTime currentTimeParsed = LocalTime.parse("08:00");
        String formatter = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.parse("21:36");
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        String customize = dateTime.format(DateTimeFormatter.ofPattern("eeee dd MMM HH:mm"));
        LocalDate dates = LocalDate.parse("2020-01-15");
        LocalTime times = LocalTime.parse("08:00");
        LocalDateTime combination = LocalDateTime.of(dates, times);
        System.out.println(currentTime + "\n" + currentTimeParsed + "\n" + formatter + "\n" + dateTime + "\n" + customize + "\nDate and time combined " + combination);
    }
}
