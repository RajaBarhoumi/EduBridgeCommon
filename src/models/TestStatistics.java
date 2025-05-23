package models;

import java.io.Serializable;
import java.sql.Timestamp;

public class TestStatistics implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private int testId;
    private int totalAttempts;
    private float averageScore;
    private float passingRate;

    // Constructors
    public TestStatistics() {}

    public TestStatistics(int id, int testId, int totalAttempts, float averageScore, float passingRate) {
        this.id = id;
        this.testId = testId;
        this.totalAttempts = totalAttempts;
        this.averageScore = averageScore;
        this.passingRate = passingRate;
    }

    public TestStatistics(int testId, int totalAttempts, float averageScore, float passingRate) {
        this.testId = testId;
        this.totalAttempts = totalAttempts;
        this.averageScore = averageScore;
        this.passingRate = passingRate;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public int getTotalAttempts() {
        return totalAttempts;
    }

    public void setTotalAttempts(int totalAttempts) {
        this.totalAttempts = totalAttempts;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }

    public float getPassingRate() {
        return passingRate;
    }

    public void setPassingRate(float passingRate) {
        this.passingRate = passingRate;
    }

}
