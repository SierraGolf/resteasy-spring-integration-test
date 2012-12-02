package com.codereligion.service;

import org.springframework.stereotype.Service;

/**
 * Implementation of {@link HelloWorldService}.
 *
 * @author sgroebler
 * @since 02.12.2012
 */
@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
    public String sayHelloWorld() {
		return "Hello world!";
	}
}