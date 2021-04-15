package com.orca.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Reference
    private IdService idService;

    public String getId(){
        return idService.get();
    }
}
