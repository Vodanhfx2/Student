package com.lms.studentmanagement.dto.exam.response;

import java.time.LocalDateTime;
import java.util.List;

public class ExamDto {
    public Long id;
    public String title;
    public Integer durationMinutes;
    public String location;
    public LocalDateTime timeslot;
    public List<QuestionDto> questions;
}