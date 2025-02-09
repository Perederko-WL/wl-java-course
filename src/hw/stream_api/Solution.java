package hw.stream_api;

import java.util.Comparator;
import java.util.List;

/// Solution to the homework.
///
/// @link [Stream API HW](https://docs.google.com/document/d/1WjtbLtapXOIfDh_I9dmdtTmVv-edzFjX_nbpLOCs8kw/edit?tab=t.0)
public class Solution {
    /// Main.
    ///
    /// @param args Arguments list.
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Loony Won", 17, List.of(
                        new Grade(95.0, "Math"),
                        new Grade(45.5, "English"),
                        new Grade(98.6, "Music")
                ), "School #2", new Address("New York", "Street Ave 21")),
                new Student("Bob Marley", 18, List.of(
                        new Grade(33.3, "Math"),
                        new Grade(79.9, "English"),
                        new Grade(99.6, "Music")
                ), "School Mountain View", new Address("New York", "Street Mountain View 5463")),
                new Student("Nikola Tesla", 16, List.of(
                        new Grade(100.0, "Math"),
                        new Grade(60.4, "English"),
                        new Grade(9.6, "Music")
                ), "School Catholic", new Address("New York", "Street Catholic 6576")),
                new Student("David Robin", 16, List.of(
                        new Grade(50.0, "Math"),
                        new Grade(50.0, "English"),
                        new Grade(0.0, "Music")
                ), "School Down Town", new Address("City Toronto", "Street Down Town 54321")),
                new Student("Kim In ", 17, List.of(
                        new Grade(67.7, "Math"),
                        new Grade(65.8, "English"),
                        new Grade(0.0, "Music")
                ), "School New Start", new Address("City Ontario", "Street Ave 45"))
        );

        students
                .stream()
                .filter(student -> student.getAge() > 15 && student.getAddress().getCity().equals("New York"))
                .flatMap(student -> student
                        .getGrades()
                        .stream()
                        .map(grade -> new StudentGrade(
                                student.getName(), student.getSchool(), grade.getSubject(), grade.getScore()
                        ))
                )
                .sorted(Comparator.comparingDouble(StudentGrade::score).reversed())
                .limit(3)
                .map(studentGrade -> "%15s | %20s | %7s| %3.2f".formatted(
                        studentGrade.studentName(), studentGrade.school(), studentGrade.subject(), studentGrade.score()
                ))
                .forEach(System.out::println);
    }
}
