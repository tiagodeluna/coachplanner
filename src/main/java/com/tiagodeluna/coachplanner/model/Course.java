package com.tiagodeluna.coachplanner.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course extends Training {

    private final String TYPE = "Course";
    @Override
    public String getType() {
        return TYPE;
    }
}
