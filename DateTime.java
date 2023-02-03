import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;  

public class DateTime {
    public static void main(String[] args) {
        // LocalDate class ----------------------
        LocalDate date = LocalDate.now();    
        LocalDate yesterday = date.minusDays(1);    
        LocalDate tomorrow = date.plusDays(1);    
        System.out.println("Today date: "+date);    
        System.out.println("Yesterday date: "+yesterday);    
        System.out.println("Tomorrow date: "+tomorrow);    
        System.out.println(date.isLeapYear());
        System.out.println("----------------------------------------");
    
        // LocalTime class -----------------------
        ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
        ZoneId zone2 = ZoneId.of("Asia/Tokyo");  
        LocalTime time1 = LocalTime.now(zone1);  
        System.out.println("India Time Zone: "+time1);  
        LocalTime time2 = LocalTime.now(zone2);  
        System.out.println("Japan Time Zone: "+time2);  
        long hours = ChronoUnit.HOURS.between(time1, time2);  
        System.out.println("Hours between two Time Zone: "+hours);  
        long minutes = ChronoUnit.MINUTES.between(time1, time2);  
        System.out.println("Minutes between two time zone: "+minutes);  
        System.out.println("----------------------------------------");

        // LocalDateTime class ----------------------------
        LocalDateTime now = LocalDateTime.now(); 
        System.out.println("Before Formatting: " + now); 
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
        String formatDateTime = now.format(format); 
        System.out.println("After Formatting: " + formatDateTime); 
        System.out.println("----------------------------------------");

        // Get() Method -------------------------------
        LocalDateTime a = LocalDateTime.of(2022, 12, 11, 15, 56);    //yyyy-mm-dd-hh-min
        System.out.println(a.get(ChronoField.DAY_OF_WEEK)+" th day of the week");  
        System.out.println(a.get(ChronoField.DAY_OF_YEAR) + " th day of year");  
        System.out.println(a.get(ChronoField.DAY_OF_MONTH) + " th day of month");  
        System.out.println(a.get(ChronoField.HOUR_OF_DAY) + " th hour of the day");  
        System.out.println(a.get(ChronoField.MINUTE_OF_DAY)+" th minute of the day");   
        System.out.println("----------------------------------------");

        // MonthDay Class ---------------------------------
        MonthDay month = MonthDay.now();  
        LocalDate date1 = month.atYear(2022);  
        System.out.println(date1);  
        System.out.println("----------------------------------------");

        // OffSetTime Class ---------------------------------
        OffsetTime offset = OffsetTime.now();  
        int h = offset.get(ChronoField.HOUR_OF_DAY);  
        System.out.println(h + " th hour of the day");  
        int m = offset.get(ChronoField.MINUTE_OF_DAY );  
        System.out.println(m + " th minute of the day");  
        int s = offset.get(ChronoField.SECOND_OF_DAY );  
        System.out.println(s +" th second of the day");  
        System.out.println("----------------------------------------");

        System.out.println("----------------------------------------");

        System.out.println("----------------------------------------");
    
    }
}
