package com.tiagodeluna.coachplanner.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(Constants.COURSE)
public class Course extends Training {

    public Course(String title, String description, Schedule schedule) {
        super(title, description, schedule);
    }

    @Override
    public String getType() {
        return Constants.COURSE;
    }
}
