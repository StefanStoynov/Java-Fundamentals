package p19_Weekdays;

import java.util.ArrayList;
import java.util.List;

public class WeeklyCalendar {
    private List<WeeklyEntry> entries;

    public WeeklyCalendar() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String weekday, String notes) {
        this.entries.add(new WeeklyEntry(weekday, notes));
    }

    public Iterable<WeeklyEntry> getWeeklySchedule() {
        this.entries.sort((e1, e2) -> e1.getWeekday().compareTo(e2.getWeekday()));

        return this.entries;
    }
}
