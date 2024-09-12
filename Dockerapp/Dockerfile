FROM openjdk:17-jdk-alpine
LABEL maintainer="Harshitha"
ARG JAR_FILE=target/*.jar
COPY ./target/Dockerapp-0.0.1-SNAPSHOT.jar springboot-docker.jar
ENTRYPOINT ["java","-jar","springboot-docker.jar"]