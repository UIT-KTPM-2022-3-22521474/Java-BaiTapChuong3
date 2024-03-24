package BT6;


public class Student implements Comparable<Student> {
    private final String studentId;
    private final String name;
    private final double averageScore;
    private final double conductScore;

    public Student(String studentId, String name, double averageScore, double conductScore) {
        this.studentId = studentId;
        this.name = name;
        this.averageScore = averageScore;
        this.conductScore = conductScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public double getConductScore() {
        return conductScore;
    }

    @Override
    public int compareTo(Student other) {
        if (this.averageScore != other.averageScore) {
            return Double.compare(other.averageScore, this.averageScore);
        } else {
            return Double.compare(other.conductScore, this.conductScore);
        }
    }

    public String getStudentId() {
        return this.studentId;
    }

   @Override
   public String toString() {
        return STR."Student ID: \{studentId}.\nName: \{name}.\nAverage Score: \{averageScore}.\nConduct Score: \{conductScore}.";
    }
}