package models;

import java.io.Serializable;

public class Answer implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private int studentTestId;
    private int questionId;
    private int selectedOptionId;

    public Answer() {}

    public Answer(int id, int studentTestId, int questionId, int selectedOptionId) {
        this.id = id;
        this.studentTestId = studentTestId;
        this.questionId = questionId;
        this.selectedOptionId = selectedOptionId;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentTestId() {
        return studentTestId;
    }

    public void setStudentTestId(int studentTestId) {
        this.studentTestId = studentTestId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getSelectedOptionId() {
        return selectedOptionId;
    }

    public void setSelectedOptionId(int selectedOptionId) {
        this.selectedOptionId = selectedOptionId;
    }
}
