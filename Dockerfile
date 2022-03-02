FROM eclipse-temurin:11.0.13_8-jre-alpine
VOLUME /tmp
COPY target/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
