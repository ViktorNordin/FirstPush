package com.company;

public class Sak extends Thing{
    int year;
    String color;

    public Sak(int ID, int year, String color) {
        super(ID);
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sak{" +
                "year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

}
