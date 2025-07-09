package com.lms.studentmanagement.dto.exam.response;

import java.util.List;

public class ExamAttemptResponseDto {
    public Long attemptId;
    public int score;
    public List<Integer> userAnswers;
    public List<Integer> correctAnswers;
    public int triesLeft;
    public List<QuestionFeedbackDto> questionFeedbacks;
}
