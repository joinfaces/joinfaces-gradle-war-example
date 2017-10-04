# JoinFaces Gradle War Example

[![Build Status](https://travis-ci.org/joinfaces/joinfaces-gradle-war-example.svg?branch=master)](https://travis-ci.org/joinfaces/joinfaces-gradle-war-example)

Usages:
  - Can be deployed to an existing Tomcat (see Travis tests)
  - Can be started via its `main`-method using an embedded Tomcat
    - _Using `java -jar`_ (See https://github.com/spring-projects/spring-boot/issues/9014)
    - Using `./gradlew bootRun`
    - Using your IDE
  - Can be tested using `@SpringBootTest(webEnvironment = RANDOM_PORT)`
    - Using `./gradlew test`
    - Using your IDE
