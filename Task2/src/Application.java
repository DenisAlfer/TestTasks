package com.company;
import java.util.*;

public class Application {

    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("Denis", "Alfer");
        students[1] = new Student("Ivan", "Ivanov");
        students[2] = new Student("Petr", "Petrov");
        students[3] = new Student("Vladimir", "Vladimirov");
        students[4] = new Student("John", "Doe");

        int[] results = new int[5];
        int avgValue = 0;

        Random r = new Random(System.currentTimeMillis());

        for (int i = 0; i < students.length; i++) {
            results[i] = r.nextInt(5) + 1;
            System.out.println(students[i] + " " + results[i]);
            avgValue += results[i];
        }

        avgValue = avgValue/results.length;

        System.out.println("Average students rating: " + avgValue);
    }
}