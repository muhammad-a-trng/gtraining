package com.galvanize.oop;

import java.util.List;
import java.util.stream.Collectors;

public class Course {
    private final List<String> students;

    Course(List<String> students) {
        this.students = students;
    }

    public String getDescription() {
        return students.stream().collect(Collectors.joining(", "));
    }
}



