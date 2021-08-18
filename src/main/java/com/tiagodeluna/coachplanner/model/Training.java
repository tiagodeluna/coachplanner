package com.tiagodeluna.coachplanner.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Training {

    private String title;

    public abstract String getType();
}
