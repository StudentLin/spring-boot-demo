FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD meaning-0.0.1-SNAPSHOT.jar meaning.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/meaning.jar"]