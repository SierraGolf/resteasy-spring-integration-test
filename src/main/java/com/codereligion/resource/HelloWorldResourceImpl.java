package com.codereligion.resource;

import com.codereligion.service.HelloWorldService;

import javax.inject.Inject;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldResourceImpl implements HelloWorldResource {

    @Inject
    private HelloWorldService halloService;

    @Override
    public String talk() {
        return this.halloService.sayHelloWorld();
    }
}