# resteasy-spring-integration-test

The main purpose of this application is to demonstrate a solution for a full end-to-end integration test with coverage analysis.

## Application technologies
* JAX-RS with RESTeasy as implementation
 * allows sharing of the rest interface with a client
 * brings an easy to use client accessible through the org.jboss.resteasy.client.ProxyFactory
* Spring for DI

## Testing technologies
* JUnit
* failsafe for unit tests
* surefire for integration tests
* jacoco for code coverage
* cargo + tomcat7 for web application deployment

## Setup
* Java 1.6 or higher
* Maven 3

## How to use
* clone this project into your local workspace
* run unit test with the following comand ```mvn clean verify -Punit.test```
 * check target/site/jacoco/index.html for results
* or run integration test with the following command ```mvn clean verify -Pintegration.test```
 * check target/site/jacoco/index.html for results
* ATTENTION: the profiles are not meant to be run together

## How it works
The integration test starts the server, runs the tests against the REST endpoint and gathers coverage data of the code which is executed on the server side.
For more details check the pom.xml.
