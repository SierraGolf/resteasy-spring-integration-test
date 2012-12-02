resteasy-spring-integration-test
================================

The main purpose of this application is to demonstrate a solution for a full n-to-n integration test with coverage analysis.

## application technologies
* JAX-RS with RESTeasy as implementation
 * it allows sharing of the rest interface with a client
 * it brings an easy to use client accessible through the org.jboss.resteasy.client.ProxyFactory
* Spring for DI

## testing technologies
* failsafe for unit tests
* surefire for integration tests
* jacoco for code coverage
* cargo + tomcat7 for web application deployment