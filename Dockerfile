ARG BASE=khipu/openjdk17-alpine
ARG JAR_FILE=target/*.jar

FROM $BASE

LABEL authors="´Jonas Wolfram"

VOLUME /tmp

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]


