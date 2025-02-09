package hw.stream_api;

/// Represent a student grade in specific subject.
///
/// @param studentName Name of the student associated with the grade.
/// @param school Name of the student’s school.
/// @param subject Name of the subject.
/// @param score Score for the subject.
public record StudentGrade(String studentName, String school, String subject, Double score) {
}
