FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/simple.jar
COPY ${JAR_FILE} simple.jar
ENTRYPOINT ["java","-jar", "simple.jar"]