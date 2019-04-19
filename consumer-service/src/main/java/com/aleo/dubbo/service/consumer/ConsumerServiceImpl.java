package com.aleo.dubbo.service.consumer;

import com.aleo.dubbo.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl {
    @Reference
    private TestService providerService;

    public String getData(String name) {
        return providerService.getData(name);
    }
}
