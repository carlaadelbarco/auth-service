FROM openjdk:17-jdk-slim
LABEL authors="carlaalvarez"

VOLUME /tmp

COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]

EXPOSE 8080