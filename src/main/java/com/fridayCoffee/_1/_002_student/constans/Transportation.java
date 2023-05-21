package com.fridayCoffee._1._002_student.constans;

public enum Transportation {
    BUS("bus"),
    SUBWAY("subway"),
    AIRPLANE("airplane");

    private final String name;

    Transportation(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name.toString();
    }
}