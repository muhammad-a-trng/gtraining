package com.galvanize.oop;

import java.util.List;
import java.util.stream.Collectors;

public class InPersonCourse extends Course {
    private final List<String> students;
    private String teacher;

    public InPersonCourse(List<String> students, String teacher) {
        super(students);

        this.students = students;
        this.teacher = teacher;
    }

    @Override
    public String getDescription() {

        return super.getDescription() + " (taughts by " + teacher + ")";
    }
}

class Person {

    // The class should always be static
    private static class Name {
        private Person person;

        public Name(Person person) {
            this.person = person;
        }

        public String byLastName() {
            return String.format(
                    "%s, %s",
                    person.getLastName(),
                    person.getFirstName());

        }
    }

    // A getter method that abstracts away the instantiation of the nested class
    public Name getName() {
        return new Name(this);
    }

    private String firstName;
    private String lastName;

    public Person() {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}