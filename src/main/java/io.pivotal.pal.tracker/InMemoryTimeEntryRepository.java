package io.pivotal.pal.tracker;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTimeEntryRepository implements TimeEntryRepository{


    private List<TimeEntry> timeEntry;
    private long id;

    public InMemoryTimeEntryRepository() {
        this.id = 1L;
        this.timeEntry = new ArrayList<>();
    }

    @Override
    public TimeEntry create(TimeEntry timeEntry) {

        timeEntry.setId(id++);
        this.timeEntry.add(timeEntry);
        return timeEntry;
    }

    public TimeEntry find(long id) {
        return timeEntry.get(new Long(id).intValue()-1);
    }

    public List<TimeEntry> list() {
        return timeEntry;
    }

    public TimeEntry update(long id, TimeEntry timeEntry) {
        TimeEntry entryToUpdate = timeEntry.getId(new Long(id).intValue()-1);
        entryToUpdate = timeEntry;
        return entryToUpdate;
    }

    public void delete(long id) {

    }
}
