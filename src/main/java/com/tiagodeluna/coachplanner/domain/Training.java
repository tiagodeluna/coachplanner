package com.tiagodeluna.coachplanner.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.util.Objects;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type", discriminatorType = DiscriminatorType.STRING)
public abstract class Training {

    private @Id @GeneratedValue Long id;
    private String title;
    // TODO Fix relationship with Schedulem
    private Schedule schedule;
    private String description;

    public Training(String title, String description, Schedule schedule) {
        this.title = title;
        this.description = description;
        this.schedule = schedule;
    }

    public abstract String getType();

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Training))
            return false;
        Training training = (Training) o;
        return Objects.equals(this.id, training.id);
    }
}
