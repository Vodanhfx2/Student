package com.lms.studentmanagement.dto.exam.response;

public class QuestionFeedbackDto {
    public Long questionId;
    public String questionText;
    public Integer chosenAnswerIndex;
    public Integer correctAnswerIndex;
    public boolean correct;
    public String chosenAnswer;
    public String correctAnswer;
}