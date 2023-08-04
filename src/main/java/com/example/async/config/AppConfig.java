package com.example.async.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Configuration
public class AppConfig {

    @Bean(name = "defaultTaskExecutor")
    public ThreadPoolExecutor defaultTaskExecutor() {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(200,
                300,
                3,
                TimeUnit.MICROSECONDS,
                new LinkedBlockingQueue<>());

        return executor;
    }

    @Bean(name = "emailTaskExecutor")
    public ThreadPoolExecutor emailTaskExecutor() {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(200,
                300,
                3,
                TimeUnit.MICROSECONDS,
                new LinkedBlockingQueue<>());

        return executor;
    }
}
