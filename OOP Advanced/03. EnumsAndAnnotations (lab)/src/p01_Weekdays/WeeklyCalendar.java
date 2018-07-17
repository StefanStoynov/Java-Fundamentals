package p01_Weekdays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WeeklyCalendar {


    private List<WeeklyEntry> calendar;

    public WeeklyCalendar() {
        this.calendar = new ArrayList<>();
    }

    public void addEntry(String weekday, String notes) {
        this.calendar.add(new WeeklyEntry(weekday, notes));
    }

    public Iterable<WeeklyEntry> getWeeklySchedule() {
        Collections.sort(calendar,WeeklyEntry.BY_WEEKDAY);
        return this.calendar;
    }
}
