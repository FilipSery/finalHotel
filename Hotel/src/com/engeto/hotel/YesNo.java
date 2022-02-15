package com.engeto.hotel;

public enum YesNo {
    YES("yes"), NO("no");
    String description;

    YesNo(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
