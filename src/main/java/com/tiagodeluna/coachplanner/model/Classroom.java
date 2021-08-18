package com.tiagodeluna.coachplanner.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
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
}
