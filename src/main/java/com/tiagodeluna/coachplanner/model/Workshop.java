package com.tiagodeluna.coachplanner.model;

public class Workshop extends Training {

    private final String TYPE = "Workshop";

    @Override
    public String getType() {
        return TYPE;
    }
}
