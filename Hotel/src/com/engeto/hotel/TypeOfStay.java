package com.engeto.hotel;

public enum TypeOfStay {
    WORKING("working"), RECREATIONAL("recreational");

    String description;

    TypeOfStay(String description) {
        this.description=description;
    }

    @Override
    public String toString() {
        return description;
    }
}
