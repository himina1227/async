package com.example.async.service;

import com.example.async.feign.client.DemoFeignClient;
import com.example.async.feign.common.BaseResponseInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DemoService {

    private final DemoFeignClient demoFeignClient;

    public String get() {
        ResponseEntity<BaseResponseInfo> response = demoFeignClient.callGet("aa", "aa", 1L);
        return "get";
    }
}
