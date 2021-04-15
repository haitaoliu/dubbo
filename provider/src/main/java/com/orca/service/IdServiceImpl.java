package com.orca.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

import java.util.UUID;

@DubboService
public class IdServiceImpl implements IdService{
    @Override
    public String get() {
        return UUID.randomUUID().toString();
    }
}
