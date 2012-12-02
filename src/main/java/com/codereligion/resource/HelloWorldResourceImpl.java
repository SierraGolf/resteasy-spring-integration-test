package com.codereligion.resource;

import com.codereligion.service.HelloWorldService;

import javax.inject.Inject;
import org.springframework.stereotype.Service;

/**
 * Implementation of {@link HelloWorldResource}.
 *
 * @author sgroebler
 * @since 02.12.2012
 */
@Service
public class HelloWorldResourceImpl implements HelloWorldResource {

    @Inject
    private HelloWorldService halloService;

    @Override
    public String talk() {
        return this.halloService.sayHelloWorld();
    }
}