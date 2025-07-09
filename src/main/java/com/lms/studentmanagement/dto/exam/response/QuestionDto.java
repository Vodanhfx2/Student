package com.lms.studentmanagement.dto.exam.response;

import java.util.List;

public class QuestionDto {
    public Long id;
    public String text;
    public List<String> choices;
    public Integer correctAnswerIndex;
}