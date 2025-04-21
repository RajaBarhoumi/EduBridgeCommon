package models;

import java.io.Serializable;

public class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String title;
    private String description;
    private Level level;
    private int professorId;

    public enum Level {
        Beginner, Intermediate, Advanced
    }

    public Course() {}

    public Course(int id, String title, String description, Level level, int professorId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.level = level;
        this.professorId = professorId;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Level getLevel() { return level; }
    public void setLevel(Level level) { this.level = level; }

    public int getProfessorId() { return professorId; }
    public void setProfessorId(int professorId) { this.professorId = professorId; }

    @Override
    public String toString() {
        return title;
    }
}
