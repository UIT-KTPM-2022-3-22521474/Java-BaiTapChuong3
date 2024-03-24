package BT9;

public class Student implements Comparable<Student> {
    private final String fullName;
    private final String studentId;
    private final double averageScore;

    public Student(String fullName, String studentId, double averageScore) {
        this.fullName = fullName;
        this.studentId = studentId;
        this.averageScore = averageScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.averageScore, other.averageScore);
    }
}