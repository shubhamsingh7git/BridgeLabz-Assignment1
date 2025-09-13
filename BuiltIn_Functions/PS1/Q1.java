package BuiltIn_Functions.PS1;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Q1 {
    public static void main(String[] args) {
       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

       
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current Time in GMT: " + gmtTime.format(formatter));

   
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Time in IST: " + istTime.format(formatter));


        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("US/Pacific"));
        System.out.println("Current Time in PST: " + pstTime.format(formatter));
    }
}
