package com.example.async.feign.config;

import com.example.async.feign.decoder.DemoFeignErrorDecoder;
import com.example.async.feign.intercepter.DemoFeignInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoFeignConfig {

    @Bean
    public DemoFeignInterceptor feignInterceptor() {
        return DemoFeignInterceptor.of();
    }

    @Bean
    public DemoFeignErrorDecoder DemoErrorDecoder() {
        return new DemoFeignErrorDecoder();
    }

}
