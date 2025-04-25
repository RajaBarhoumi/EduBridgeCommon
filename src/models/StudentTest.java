package models;

import java.io.Serializable;
import java.sql.Timestamp;

public class StudentTest implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private int studentId;
    private int testId;
    private float score;
    private boolean passed;
    private Timestamp takenDate;

    // Constructors
    public StudentTest() {}

    public StudentTest(int id, int studentId, int testId, float score, boolean passed, Timestamp takenDate) {
        this.id = id;
        this.studentId = studentId;
        this.testId = testId;
        this.score = score;
        this.passed = passed;
        this.takenDate = takenDate;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public Timestamp getTakenDate() {
        return takenDate;
    }

    public void setTakenDate(Timestamp takenDate) {
        this.takenDate = takenDate;
    }

    @Override
    public String toString() {
        return "StudentTest{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", testId=" + testId +
                ", score=" + score +
                ", passed=" + passed +
                ", takenDate=" + takenDate +
                '}';
    }
}
