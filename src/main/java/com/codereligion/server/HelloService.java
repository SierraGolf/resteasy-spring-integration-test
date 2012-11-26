package com.codereligion.server;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getWorld() {
        return "world";
    }
}