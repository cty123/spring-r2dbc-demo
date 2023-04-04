FROM openjdk:17

COPY build/libs/demo-0.0.1-SNAPSHOT.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "./demo-0.0.1-SNAPSHOT.jar"]