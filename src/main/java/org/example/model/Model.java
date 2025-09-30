package org.example.model;

import java.time.LocalDate;

public class Model {
    private Student student;

    public Student getStudent() {
        return student;
    }

    public Model() {
        this.student=new Student("Robert Smith",
                40,
                LocalDate.of(2000,01,01));
    }
}

