# JoinFaces Gradle War Example

![Java CI with Gradle](https://github.com/joinfaces/joinfaces-gradle-war-example/workflows/Java%20CI%20with%20Gradle/badge.svg?branch=master)

Usages:
  - Can be deployed to an existing Tomcat (see GitHub Actions workflow)
  - Can be started via its `main`-method using an embedded Tomcat
    - Using `java -jar`
    - Using `./gradlew bootRun`
    - Using your IDE
  - Can be tested using `@SpringBootTest(webEnvironment = RANDOM_PORT)`
    - Using `./gradlew test`
    - Using your IDE
