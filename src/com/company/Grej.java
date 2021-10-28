package com.company;

public class Grej extends Thing{
    int age;
    String name;
    String brand;
    public Grej(int ID, int age, String name, String brand) {
        super(ID);
        this.age = age;
        this.name = name;
        this.brand = brand;
    }




    @Override
    public String toString() {
        return "Grej{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    }

