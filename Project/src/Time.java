

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
    private LocalDateTime dateTime;

    public Time() {
        this.dateTime = LocalDateTime.now();
    }

    public Time(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getFormattedTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return dateTime.format(formatter);
    }

    public void displayTime() {
        System.out.println("Order Time: " + getFormattedTime());
    }
}
