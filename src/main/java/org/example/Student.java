package org.example;

import java.util.ArrayList;
import java.util.List;

class Student {
    private int studentId;
    private String firstName;
    private String lastName;

    public Student(int studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
