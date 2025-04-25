package models;

import java.io.Serializable;

public class Test implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String title;
    private int courseId;
    private int professorId;
    private int timeLimit;
    // Constructors
    public Test() {}

    public Test(int id, String title, int courseId, int professorId, int timeLimit) {
        this.id = id;
        this.title = title;
        this.courseId = courseId;
        this.professorId = professorId;
        this.timeLimit = timeLimit;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    @Override
    public String toString() {
        return title;
    }
    
}
