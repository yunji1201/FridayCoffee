package com.fridayCoffee._2_student.constans;

public enum Place {
    HOME("10, 50"),
    THEATER("30, 40"),
    SCHOOL("70, 10"),
    GYM("60, 20"),
    RESTAURANT("80, 0");

    final private String point;

    private Place(String point) {
        this.point = point;
    }

    public String getPoint() {
        return point;
    }
}