package com.tiagodeluna.coachplanner.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(Constants.WORKSHOP)
public class Workshop extends Training {

    public Workshop(String title, String description, Schedule schedule) {
        super(title, description, schedule);
    }

    @Override
    public String getType() {
        return Constants.WORKSHOP;
    }
}
