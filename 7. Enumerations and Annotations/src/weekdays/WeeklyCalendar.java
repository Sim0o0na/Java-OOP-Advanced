package weekdays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Sim0o on 3/23/2017.
 */
public class WeeklyCalendar
{
    private List<WeeklyEntry> entries;
    public WeeklyCalendar(){
        this.entries = new ArrayList<>();
    }

    public void addEntry(String weekday, String notes){
        WeeklyEntry entry =  new WeeklyEntry(weekday.toUpperCase(), notes);
        this.entries.add(entry);
    }

    public Iterable<WeeklyEntry> getWeeklySchedule() {
        Collections.sort(entries, WeeklyEntry.BY_WEEKDAY);
        return this.entries;
    }
}
