FROM openjdk

WORKDIR /app

COPY target/devweb-0.0.1-SNAPSHOT.jar /app/spring-web.jar

ENTRYPOINT ["java", "-jar", "spring-web.jar"]