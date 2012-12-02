resteasy-spring-integration-test
================================

The main purpose of this application is to demonstrate a solution for a full n-to-n integration test with coverage analysis.

### application technologies
* JAX-RS with RESTeasy as implementation
 * it allows sharing of the rest interface with a client
 * it brings an easy to use client accessible through the org.jboss.resteasy.client.ProxyFactory
* Spring for DI

### testing technologies
* JUnit
* failsafe for unit tests
* surefire for integration tests
* jacoco for code coverage
* cargo + tomcat7 for web application deployment

### how to use
* clone this project into your local workspace
* run unit test with the following comand "mvn clean verify -Punit.test"
 * check target/site/jacoco/index.html for results
* or run integration test with the following command "mvn clean verify -Pintegration.test"
 * check target/site/jacoco/index.html for results
* ATTENTION: the profiles are not meant to be run together