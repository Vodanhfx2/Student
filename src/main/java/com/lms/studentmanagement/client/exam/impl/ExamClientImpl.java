package com.lms.studentmanagement.client.exam.impl;

import com.lms.studentmanagement.client.exam.ExamClient;
import com.lms.studentmanagement.config.ServiceConfig;
import com.lms.studentmanagement.dto.exam.response.ExamDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
@RequiredArgsConstructor
public class ExamClientImpl implements ExamClient {

    private final RestTemplate restTemplate;
    private ServiceConfig serviceConfig;

    @Override
    public ExamDto getExamById() {
        serviceConfig.getExamBaseUrl();
        String featureUtl = "/exam/abc";

        HttpMethod rr = new HttpMethod();

        restTemplate.getForObject()
        return null;
    }
}
