package com.tiagodeluna.coachplanner.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Schedule {

    private @Id @GeneratedValue Long id;
    private int sessions;
    private float workload;

    public Schedule(int sessions, float workload) {
        this.sessions = sessions;
        this.workload = workload;
    }
}
