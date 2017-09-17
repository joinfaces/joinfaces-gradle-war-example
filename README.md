# joinfaces-gradle-war-example
JoinFaces Gradle War Example

Usages:
  - Can be deployed to an existing Tomcat (see Travis tests)
  - Can be started via its `main`-method using an embedded Tomcat
    - _Using `java -jar`_ (See spring-projects/spring-boot#9014)
    - Using `./gradlew bootRun`
    - Using your IDE
  - Can be tested using `@SpringBootTest(webEnvironment = RANDOM_PORT)`
    - Using `./gradlew test`
    - Using your IDE
