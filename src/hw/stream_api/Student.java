package hw.stream_api;

import java.util.List;

/// Student representation.
public final class Student {
    /// Name of the student.
    private final String name;

    /// Age of the student.
    private final Integer age;

    /// List of Grade objects, each representing the score in a subject.
    private final List<Grade> grades;

    /// The name of the school the student attends.
    private final String school;

    /// Information about the student’s address
    private final Address address;

    /// Class constructor.
    ///
    /// @param name    The student name.
    /// @param age     The student age.
    /// @param grades  List of the student subject grades.
    /// @param school  The school name.
    /// @param address The student address.
    Student(String name, Integer age, List<Grade> grades, String school, Address address) {
        this.name = name;
        this.age = age;
        this.grades = List.copyOf(grades);
        this.school = school;
        this.address = address;
    }

    /// Returns the student name.
    public String getName() {
        return name;
    }

    /// Returns the student age.
    public Integer getAge() {
        return age;
    }

    /// Returns a list of the student grades.
    public List<Grade> getGrades() {
        return List.copyOf(grades);
    }

    /// Returns the school name for which student is depends.
    public String getSchool() {
        return school;
    }

    /// Returns the address of the student.
    public Address getAddress() {
        return address;
    }
}
