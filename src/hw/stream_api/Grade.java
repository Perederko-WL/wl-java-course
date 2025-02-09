package hw.stream_api;

/// Represents a student grade for a subject.
public class Grade {
    /// Score obtained in the subject.
    private final Double score;

    /// Name of the subject.
    private final String subject;

    /// Class constructor.
    ///
    /// @param score   Student score obtained in the subject.
    /// @param subject Name of the subject.
    Grade(Double score, String subject) {
        this.score = score;
        this.subject = subject;
    }

    /// Returns the score that student obtains in the subject.
    public Double getScore() {
        return score;
    }

    /// Returns the subject name.
    public String getSubject() {
        return subject;
    }
}
