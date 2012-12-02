package com.codereligion.service;

import org.springframework.stereotype.Service;

/**
 * HelloWorldService
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