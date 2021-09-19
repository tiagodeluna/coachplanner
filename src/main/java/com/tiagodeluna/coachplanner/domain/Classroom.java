package com.tiagodeluna.coachplanner.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Classroom {

    private Trainer trainer;
    private List<Attendee> attendees;
    private Training training;
    private String name;
    private int vacancies;
    private LocalDateTime startDate;

    public Classroom() {
        this.attendees = new ArrayList<>();
    }

    /**
     * Returns a copy of the list of attendees.
     * @return List of attendees.
     */
    public List<Attendee> getAttendees() {
        return List.copyOf(this.attendees);
    }

    /**
     * Add new attendee to the classroom.
     * @param attendee New attendee to be added.
     */
    public void addAttendee(Attendee attendee) {
        this.attendees.add(attendee);
    }

    /**
     * Checks whether there are vacancies for this training. Also, returns true if <i>vacancies</i> is equal to zero.
     * @return boolean - if there are remaining vacancies for this training or not.
     */
    public boolean areThereVancancies() {
        return vacancies == 0 || attendees.size() >= vacancies;
    }

}
