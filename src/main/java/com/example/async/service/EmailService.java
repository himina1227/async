package com.example.async.service;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    @Async("defaultTaskExecutor")
    public void sendMail() {
        System.out.println("[sendEmail] :: " + Thread.currentThread().getName());
    }

    @Async("emailTaskExecutor")
    public void sendMailWithCustomExecutor() {
        System.out.println("[email] :: " + Thread.currentThread().getName());
    }
}
