package p01_Weekdays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        WeeklyCalendar wc = new WeeklyCalendar();
        wc.addEntry("Friday","sleep");
        wc.addEntry("Monday","sport");
        Iterable<WeeklyEntry> schedule = wc.getWeeklySchedule();
        for (WeeklyEntry weeklyEntry : schedule) {
            System.out.println(weeklyEntry);
        }
    }
}
