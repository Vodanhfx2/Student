package com.lms.studentmanagement.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {
    @Value("${exam-service.base-url}")
    private String examBaseUrl;

    public String getExamBaseUrl() {
        return examBaseUrl;
    }
}
