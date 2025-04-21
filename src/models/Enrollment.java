package models;

import java.io.Serializable;
import java.util.Date;

public class Enrollment implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private int studentId;
    private int courseId;
    private Date date;

    public Enrollment() {}

    public Enrollment(int id, int studentId, int courseId, Date date) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.date = date;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }
    public Date getDate(){return date;}

    public void setDate(Date date) {
        this.date = date;
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

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
