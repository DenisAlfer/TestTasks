package com.company;

public class Student {
    public String name;
    public String lastName;

    public Student(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public String toString() {
        return name + " " + lastName;
    }
}