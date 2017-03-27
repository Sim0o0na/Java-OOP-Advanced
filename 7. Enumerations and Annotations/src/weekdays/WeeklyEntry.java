package weekdays;

import java.util.Comparator;

/**
 * Created by Sim0o on 3/23/2017.
 */
public class WeeklyEntry {
    public final static Comparator<WeeklyEntry> BY_WEEKDAY = getComparatorByWeekday();

    private Weekday weekday;
    private String notes;

    public WeeklyEntry(String weekday, String notes){
        this.weekday = Weekday.valueOf(Weekday.class, weekday);
        this.notes = notes;
    }

    private static Comparator<WeeklyEntry> getComparatorByWeekday() {
        return (e1, e2) -> Integer.compare(e1.weekday.ordinal(), e2.weekday.ordinal());
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.weekday.toString(), this.notes);
    }
}
