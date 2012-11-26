package com.codereligion.rest;

import com.codereligion.server.HelloService;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

@Service
public class HelloRestResourceImpl implements HelloRestResource {

    @Inject
    private HelloService halloService;

    @Override
    public String world() {
        return this.halloService.getWorld();
    }
}