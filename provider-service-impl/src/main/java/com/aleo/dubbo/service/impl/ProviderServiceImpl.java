package com.aleo.dubbo.service.impl;

import com.aleo.dubbo.service.TestService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ProviderServiceImpl implements TestService {
    @Override
    public String getData(String name) {
        return "生产者提供服务：" + name;
    }
}
