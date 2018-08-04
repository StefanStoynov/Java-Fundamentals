package p19_Weekdays;

public class WeeklyEntry {
    private Weekday weekday;
    private String note;

    public WeeklyEntry(String weekday, String note) {
        this.weekday = Enum.valueOf(Weekday.class, weekday.toUpperCase());
        this.note = note;
    }

    public Weekday getWeekday() {
        return this.weekday;
    }

    @Override
    public String toString() {
        return String.format("%s - %s",this.weekday, this.note);
    }
}
