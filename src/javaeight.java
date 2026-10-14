import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class javaeight {
    static void main(String[] args) {
        LocalDate t1 = LocalDate.now();
        LocalDateTime t2 =  LocalDateTime.now();
        LocalTime t = LocalTime.now(ZoneId.of("Europe/Monaco"));
        LocalTime t3 = LocalTime.now(ZoneId.of("Indian/Antananarivo"));
        for(String s: ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }

        System.out.println(t);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);



    }
}
