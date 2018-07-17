package p01_Weekdays;

import java.util.Comparator;

public class WeeklyEntry {
    public static final Comparator<WeeklyEntry> BY_WEEKDAY = getCompByDay();
    private Weekday weekday;
    private String notes;

    public WeeklyEntry(String weekday, String notes) {
        this.weekday = Enum.valueOf(Weekday.class, weekday.toUpperCase());
        this.notes = notes;
    }

    private static Comparator<WeeklyEntry> getCompByDay() {
        return (e1, e2) -> e1.weekday.compareTo(e2.weekday);
    }

    @Override
    public String toString() {

        return this.weekday + " - " + this.notes;
    }

}
